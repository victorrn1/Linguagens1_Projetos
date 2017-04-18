/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;

public class Funcionario {

    protected String nomeCompleto;
    protected String cpf;
    protected String registro;
    protected double salarioBase;

    //GETTER AND SETTERS
    public double getSalarioBase() {
        return this.salarioBase;
    }

    public void setSalarioBase(double sB) {
        if (sB > this.salarioBase) {
            this.salarioBase = sB;
        } else {
            System.out.println("Você não pode abaixar o salário de um funcionário");
        }
    }

    public String getNome() {
        return this.nomeCompleto;
    }

    public String setNome(String nome) {
        return this.nomeCompleto = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String setCpf(String cpf) {
        return this.cpf = cpf;
    }

    public String getRegistro() {
        return this.registro;
    }

    public String setRegistro(String registro) {
        return this.registro = registro;
    }

    //Métodos adicionais
    public double calcularBonus(double bIndividual) {
        return bIndividual;
    }

}
