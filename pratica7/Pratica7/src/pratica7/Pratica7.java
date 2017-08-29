/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratica7;

import java.util.ArrayList;

/**
 *
 * @author Aluno 12
 */
public class Pratica7 {

    
    public static void main(String[] args) {
       
        ArrayList<String> lista = new ArrayList<String>();
        ArrayList<String> lista2 = new ArrayList<String>();
    
        lista.add("aeiou");
        lista.add("n1");
        lista.add("n2");
        lista.add(1, "Batata");
        lista.set(2, "Fifo");
        lista.remove(0);
        
        
        printList(lista);
        
        lista2.add("original lista 2 - 1");
        lista2.add("original lista 2 - 2");
        lista2.add("original lista 2 - 3");
        lista2.addAll(1, lista);
        printList(lista2);
        System.out.println(lista2.indexOf("Fifo"));
        
    }
    public static void printList (ArrayList<String> arrayLista){
     
            System.out.println("----------Início Lista-----------");
            for (int i = 0; i < arrayLista.size(); i++) {
            System.out.println(arrayLista.get(i));
        }
    
    }
}
