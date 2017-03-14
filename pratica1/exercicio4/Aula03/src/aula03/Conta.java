/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03;

public class Conta {

    int numero;
    double saldo;
    Cliente titular; // Da as propriedades da Classe Cliente para a Classe Conta

    void visualizarSaldo() {
        System.out.println("Saldo = " + this.saldo);
    }

    void depositar(double valor) {
        if (valor > 0) {
            this.saldo = this.saldo + valor;
        }
    }

    boolean sacar(double valor) {
        if (this.saldo < valor) {
            return false;
        } else {
            this.saldo = this.saldo - valor;
            return true;
        }
    }

    boolean transferirPara(Conta c1, double valor) {
        if (this.sacar(valor)) {
            c1.depositar(valor);
            return true;
        } else {
            System.out.println("Erro na transferência, por favor confira se seu saldo é suficiente.");
            return false;
        }
    }

    void exibirInformações() {
        System.out.println("Nome do titular = " + this.titular.nome);
        System.out.println("Sobrenome do titular = " + this.titular.sobrenome);
        System.out.println("CPF do titular = " + this.titular.cpf);
        System.out.println("Número da conta = " + this.numero);
        System.out.println("--------- FIM ---------");
    }
}
