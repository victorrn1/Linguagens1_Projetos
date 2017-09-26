package br.com.victornicolaus.hellomysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;
        
public class HelloMySql {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
       
        Connection conexao = ConnectionFactory.getConnection();
        //String sql = "INSERT INTO `alunos_teste`.`tblalunos` (`nome`, `idade`, `ra`) VALUES ('Jorge', '40', '95.00000-8');";
        String sql = "SELECT * FROM tblalunos;";
        PreparedStatement ps;
        try{
            ps = conexao.prepareStatement(sql);
            ResultSet resultadoQuery = ps.executeQuery();
            
            while(resultadoQuery.next()){
                int id = resultadoQuery.getInt("id");
                String nome = resultadoQuery.getString("nome");
                int idade = resultadoQuery.getInt("idade");
                String ra = resultadoQuery.getString("ra");
                
                System.out.println("Id: " + Integer.toString(id)+ "  Nome: " + nome + " Idade: " + idade + " R.A: " + ra);
            }
            ps.close();
            conexao.close();}
        catch(SQLException ex){
             System.out.println("Erro");               
        }
               
    }
    
}
