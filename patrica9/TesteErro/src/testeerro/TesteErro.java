/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeerro;

/**
 *
 * @author Aluno 12
 */
public class TesteErro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("inicio do main");

        metodo1();

        System.out.println("fim do main");
    }

    static void metodo1() {
        System.out.println("inicio do metodo1");
        try {
            metodo2();
        } catch (Exception e) {
            System.out.println("Tratamento erro método 1 " + e);

        }
        System.out.println("fim do metodo1");
    }

    static void metodo2() throws Exception {
        System.out.println("inicio do metodo2");
        int[] array = new int[10];
        try {
            for (int i = 0; i <= 15; i++) {

                array[i] = i;
                System.out.println(i);

            }
        } catch (Exception e) {
            System.out.println("Erro dentro do método 2:" + e);
            throw (e);
        }

        System.out.println("fim do metodo2");

    }

}
