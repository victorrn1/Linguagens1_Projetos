/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;

public class Funcionario {

    protected String nomeCompleto;
    protected String cpf;
    protected int registro;
    protected double salarioBase;
    
    public Funcionario (String nome, String novoCpf, int novoReg, double novoSa)
    { 
        this.cpf = this.setCpf(novoCpf);
        this.nomeCompleto = this.setNome(nome);
        this.registro = this.setRegistro(novoReg);
        this.salarioBase = this.setSalarioBase(novoSa);
        
    }

    //GETTER AND SETTERS
    public double getSalarioBase() {
        return this.salarioBase;
    }

    public double setSalarioBase(double sB) {
        if (sB > this.salarioBase) {
            this.salarioBase = sB;
        } else {
            System.out.println("Você não pode abaixar o salário de um funcionário");
        }
        return this.salarioBase;
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

    public int getRegistro() {
        return this.registro;
    }

    public int setRegistro(int registro) {
        return this.registro = registro;
    }

    //Métodos adicionais
    public double calcularBonus(double bIndividual) {
        return bIndividual;
    }
    
    
}
