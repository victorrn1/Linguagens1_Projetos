/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.victornicolaus.chatcontinuo;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aluno 12
 */
public class Servidor implements Runnable {
    static Socket cliente;
    static boolean fechou = false;  
    public static void main(String[] args) {
        try {
            //Instancia o ServerScoket ouvindo a porta 12345

            ServerSocket servidor = new ServerSocket(12345);
            System.out.println("Servidor ouvindo a porta 12345");

            cliente = servidor.accept();
            System.out.println("Cliente conectado: " + cliente.getInetAddress().getHostAddress());

            String talk = "";
            
            Thread entrada = new Thread(new Servidor());
            entrada.start();          
            

            try (
                    
                    Scanner out = new Scanner(System.in);
                    PrintStream saidaRede = new PrintStream(cliente.getOutputStream(), true);) {

                saidaRede.println("Olá, Bem vindo. Seu ip é: " + cliente.getInetAddress().getHostAddress());
                
                
                while (!fechou && !talk.equalsIgnoreCase("tchau")) {

                    talk = out.nextLine();
                    saidaRede.println(talk);
                    
                }
                System.out.println("Aplicação finalizada. Pressione ENTER para fechar o programa.");
                out.nextLine();
                fechou = true;
                servidor.close();
                cliente.close();
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    @Override
    public void run() {
        try (
                Scanner in = new Scanner(cliente.getInputStream());
            ){ 
            String talk = "";
            while (!fechou && !talk.equalsIgnoreCase("tchau")) {
                talk = in.nextLine();
                System.out.println(talk);
            }
            System.out.println("Cliente fechou a conexão, pressione ENTER para sair");
            fechou = true;
        } catch (IOException ex) {
            
        }
    }
}
