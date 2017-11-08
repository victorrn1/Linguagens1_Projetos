/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.victornicolaus.chatcontinuo;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Aluno 12
 */
public class ChatContinuo {

    
    public static void alo(String[] args) {
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
