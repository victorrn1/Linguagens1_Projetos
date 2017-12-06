//Victor Rampanha Nicolaus RA: 14.01617-6
//Rafael Negrão Chaves Caielli RA: 15.04095-0
package br.com.victorerafael.atividade4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Atividade4 {
    static Connection conexao = ConnectionFactory.getConnection();
    public static void main(String[] args) {
        Thread gerador = new Thread( new GeradorRelatorios("./relatorio.txt",pesquisarReservas()));
        
        Scanner scan = new Scanner(System.in);
        int op = 0;
        
        System.out.println("-------Travel Bus Thomaz Z-------");
        System.out.println("O que deseja fazer?");
        System.out.println("1 - Mostrar clientes");
        System.out.println("2 - Mostrar trajetos");
        System.out.println("3 - Mostrar reservas");
        System.out.println("4 - Cadastrar novos clientes");
        System.out.println("5 - Cadastrar novos trajetos");
        System.out.println("6 - Realizar nova reserva");
        System.out.println("7 - Gerar relatório de reservas");
        op = scan.nextInt();
        if (op == 1){
            pesquisarClientes();
        }
        else if(op == 2){
            pesquisarTrajetos();
        }
    }

    public static void pesquisarClientes() {
        String sql = "SELECT Nome, CPF FROM tbl_clientes;";
        PreparedStatement ps;

        try {
            ps = conexao.prepareStatement(sql);
            ResultSet resultadoQuery = ps.executeQuery();
            while (resultadoQuery.next()) {
                String nome = resultadoQuery.getString("Nome");                
                String cpf = resultadoQuery.getString("CPF");
                System.out.println(" Nome: " + nome + " CPF: " + cpf);
            }
            ps.close();
            conexao.close();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Atividade4.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public static String pesquisarReservas() {
        String sql = "SELECT a.nome, a.cpf, c.cid_origem, c.cid_destino, c.data FROM tbl_clientes AS a INNER JOIN tbl_reserva AS b ON a.id_cliente = b.id_cliente INNER JOIN tbl_trajetos AS c ON c.id_trajeto = b.id_trajeto;";
        PreparedStatement ps;
        String res = "";
        try {
            ps = conexao.prepareStatement(sql);
            ResultSet resultadoQuery = ps.executeQuery();
            while (resultadoQuery.next()) {
                String origem = resultadoQuery.getString("c.cid_origem");                
                String destino = resultadoQuery.getString("c.cid_destino");
                int data  = resultadoQuery.getInt("c.data");
                java.util.Date time = new java.util.Date((long)data*1000);
                String nome = resultadoQuery.getString("a.nome");                
                String cpf = resultadoQuery.getString("a.cpf");  
                res = res + "/n" + "Origem: " + origem + 
                                   " Destino: " + destino +
                                   " Data: " + time +
                                   " Nome: " + nome +
                                   " CPF: " + cpf;
                System.out.println("Origem: " + origem + 
                                   " Destino: " + destino +
                                   " Data: " + time +
                                   " Nome: " + nome +
                                   " CPF: " + cpf);
                
            }
            ps.close();
            conexao.close();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Atividade4.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }
    
    public static void realizarReserva(int idTrajeto, int idCliente){
        String sql = "SELECT assentos_vagos FROM tbl_trajetos WHERE id_trajeto = " + idTrajeto + ";";
        PreparedStatement ps;
        try {
            ps = conexao.prepareStatement(sql);
            ResultSet resultadoQuery = ps.executeQuery();
            int vagos = 0;
            while (resultadoQuery.next()) {                
                vagos = resultadoQuery.getInt("assentos_vagos");                              
            }
            if (vagos > 0){
                vagos--;
            }
            
            sql = "UPDATE tbl_trajetos SET assentos_vagos='"+ vagos+ "' WHERE id_trajeto='"+ idTrajeto +"';";
            ps = conexao.prepareStatement(sql);
            ResultSet resultQuery = ps.executeQuery();
            
            sql = "INSERT INTO tbl_reserva (id_trajeto, id_cliente) VALUES (?, ?);";
            ps = conexao.prepareStatement(sql);
            ps.setInt(1, idTrajeto);            
            ps.setInt(2, idCliente);
            ps.execute();
            
            
            ps.close();
            conexao.close();
            
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Atividade4.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void pesquisarTrajetos() {
        String sql = "SELECT cid_origem, cid_destino, data, assentos_vagos, preco FROM tbl_trajetos;";
        PreparedStatement ps;

        try {
            ps = conexao.prepareStatement(sql);
            ResultSet resultadoQuery = ps.executeQuery();
            while (resultadoQuery.next()) {
                String origem = resultadoQuery.getString("cid_origem");                
                String destino = resultadoQuery.getString("cid_destino");
                int data  = resultadoQuery.getInt("data");
                java.util.Date time = new java.util.Date((long)data*1000);
                int vagos = resultadoQuery.getInt("assentos_vagos");
                double preco = resultadoQuery.getDouble("preco");
                System.out.println("Origem: " + origem + 
                                   " Destino: " + destino +
                                   " Data: " + time +
                                   " Assentos vagos: " + vagos +
                                   " Preço: " + preco);
                
            }
            ps.close();
            conexao.close();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Atividade4.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void cadastroCliente (String nome, String CPF){
        String sql = "INSERT INTO tbl_clientes (Nome,CPF) VALUES (?,?)";
        
        PreparedStatement ps;
        try {
            ps = conexao.prepareStatement(sql);
            ps.setString(1, nome);            
            ps.setString(2, CPF);
            ps.execute();
            
            ps.close();
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(Atividade4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void cadastroTrajetos (String origem, String destino, String data, int vagos, double preco){
        String sql = "INSERT INTO tbl_clientes (Nome,CPF) VALUES (?,?,?,?,?)";
        
        PreparedStatement ps;
        try {
            ps = conexao.prepareStatement(sql);
            ps.setString(1, origem);            
            ps.setString(2, destino);
            java.util.Date utilDate = new java.util.Date(data);
            java.sql.Timestamp time = new java.sql.Timestamp(utilDate.getTime());
            ps.setTimestamp(3, time);
            ps.setInt(4, vagos);
            ps.setDouble(5, preco);
            
            ps.execute();
            
            ps.close();
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(Atividade4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
