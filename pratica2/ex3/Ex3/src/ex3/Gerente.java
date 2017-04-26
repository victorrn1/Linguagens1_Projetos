/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;

public class Gerente extends Funcionario {

    protected static double taxaComissao = 0.05;
    protected static double taxaExtraSalario = 0.25;
    private double vendas = 0;

    public Gerente(String n, String cpf, int reg, double salario) {
        super(n, cpf, reg, salario);
    }
    
    @Override
    public double calcularBonus(double bIndividual){
            return this.vendas*Gerente.taxaComissao + bIndividual + this.salarioBase*this.taxaExtraSalario;
    }
    
   
}
