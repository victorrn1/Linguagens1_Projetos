/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.telefônica;

import java.util.Scanner;

public class ClasseTeste {

    private ListaDeContatos lista;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String helper = sc.next();
        int op = Integer.parseInt(helper);
        
        switch (op) {
            case 1:
            {
                Scanner sc1 = new Scanner(System.in);
                String nome = sc1.next();
                String cel = sc1.next();
                int x = Integer.parseInt(cel);
                lista.Adicionar(nome,x);
                break;
            } 

        }
    }

}
