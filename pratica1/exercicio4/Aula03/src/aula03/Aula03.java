/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03;

/**
 *
 * @author Professor
 */
public class Aula03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.saldo = 1000;
        c1.visualizarSaldo();
        c1.depositar(200);
        c1.visualizarSaldo();
        c1.sacar(200);
        c1.visualizarSaldo();
        
        Conta c2 = new Conta();
        c2.saldo = 6000;
        c2.visualizarSaldo();
        
        
        
    }
    
}
