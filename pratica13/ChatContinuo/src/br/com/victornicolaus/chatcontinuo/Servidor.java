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
public class Servidor {

    public static void main(String[] args) {
        try {
            //Instancia o ServerScoket ouvindo a porta 12345

            ServerSocket servidor = new ServerSocket(12345);
            System.out.println("Servidor ouvindo a porta 12345");

            Socket cliente = servidor.accept();
            System.out.println("Cliente conectado: " + cliente.getInetAddress().getHostAddress());

            String talk = "";

            try (
                    Scanner in = new Scanner(cliente.getInputStream());
                    Scanner out = new Scanner(System.in);
                    PrintStream saidaRede = new PrintStream(cliente.getOutputStream(), true);) {
                
                saidaRede.println("Olá, Bem vindo. Seu ip é: " + cliente.getInetAddress().getHostAddress());
                System.out.println(in.nextLine());
                
                while (!talk.equalsIgnoreCase("tchau")) {

                    talk = out.nextLine();
                    saidaRede.println(talk);
                    talk = in.nextLine();
                    System.out.println(talk);
                }
                System.out.println("Aplicação finalizada. Pressione ENTER para fechar o programa.");
                out.nextLine();
                servidor.close();
                cliente.close();
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
