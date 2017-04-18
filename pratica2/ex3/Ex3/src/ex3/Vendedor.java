/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;


public class Vendedor extends Funcionario{
    
    private double totalVendasVendedor ;
    private static double taxaVendedor = 0.03;
    
    
    @Override
    public double calcularBonus (double bIndividual){
        return this.totalVendasVendedor*Vendedor.taxaVendedor + bIndividual;
    }
}
