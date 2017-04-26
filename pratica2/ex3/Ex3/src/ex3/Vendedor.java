/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;

public class Vendedor extends Funcionario {

    private double totalVendasVendedor;
    private double vendas;
    private static double taxaVendedor = 0.03;

    public Vendedor(String n, String cpf, int reg, double salario) {
        super(n, cpf, reg, salario);
    }

    @Override
    public double calcularBonus(double bIndividual) {
        return this.totalVendasVendedor * Vendedor.taxaVendedor + bIndividual;
    }

    public double getSalarioTotal() {
        return this.salarioBase + this.calcularBonus(Concessionária
    }
    
    public void realizarVenda (double valorVenda){
        if (valorVenda > 0){
        this.vendas += valorVenda;}
        }
        
}
