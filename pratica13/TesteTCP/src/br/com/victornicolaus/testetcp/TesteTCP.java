package br.com.victornicolaus.testetcp;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.Scanner;

public class TesteTCP {

    public static void main(String[] args) throws IOException {
        try {
            //Instancia o ServerScoket ouvindo a porta 12345
            ServerSocket servidor = new ServerSocket(12346);
            System.out.println("Servidor ouvindo a porta 12346");
            while (true) {
                //o método accept() bloqueia a execução até que
                // o servidor receba um pedido de conexao
                Socket cliente = servidor.accept();
                System.out.println("Cliente conectado: " + cliente.getInetAddress().getHostAddress());
                
                               
                PrintStream out = new PrintStream (cliente.getOutputStream(), true);
                out.println("Olá, Bem vindo. Seu ip é: " + cliente.getInetAddress().getHostAddress());
                
                
                Scanner in = new Scanner(cliente.getInputStream());
                //Scanner scan = new Scanner (System.in);
                //scan.nextLine();
                
                String s = in.nextLine();
                System.out.println(s);
                
                cliente.close();
            }
    
        }
        catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
        
    }
    

}
