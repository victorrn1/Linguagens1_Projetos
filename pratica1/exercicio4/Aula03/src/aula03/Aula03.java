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
        c1.titular = new Cliente();
        c1.titular.cpf = "455999555";
        c1.titular.nome = "Victor";
        c1.titular.sobrenome = "Nicolaus";
        c1.numero = 1;        
        c1.saldo = 1000;
        c1.visualizarSaldo();
        c1.depositar(200);
        c1.visualizarSaldo();
        c1.sacar(200);
        c1.visualizarSaldo();
        
        Conta c2 = new Conta();
        c2.titular = new Cliente();
        c2.titular.cpf = "999888777";
        c2.titular.nome = "Ricardo";
        c2.titular.sobrenome = "Bad";
        c2.numero = 02;
        c2.saldo = 6000;
        c2.visualizarSaldo();
        c1.transferirPara(c2, 200);
        c2.visualizarSaldo();
        c1.visualizarSaldo();
        c1.exibirInformações();
        c2.exibirInformações();
           
        
    }
    
}
