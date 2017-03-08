/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03;

public class Conta {

    int numero;
    double saldo;
    String titular;
    String cpf;

    void visualizarSaldo() {
        System.out.println("Saldo = " + this.saldo);
    }

    void depositar(double valor) {
        if (valor > 0) {
            this.saldo = this.saldo + valor;
        }
    }

    void sacar(double valor) {
        if (valor <= this.saldo && valor >= 0) {
            this.saldo = this.saldo - valor;
        } 
        else {
            System.out.println("Quer um empréstimo?");
        }
    }

    void transferirDinheiro() {

    }
}
