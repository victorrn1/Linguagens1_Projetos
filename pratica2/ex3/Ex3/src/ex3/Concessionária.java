/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;



public class Concessionária {
    
    private static double totalDeVendas;
    private static int totalDeFuncionarios;
    private double bonusIndividual;
    private static double taxaTotalDeVendas = 0.05;
    
    public void bonusIndividual (double bIndividual){
       bIndividual = (Concessionária.taxaTotalDeVendas * Concessionária.taxaTotalDeVendas)/Concessionária.totalDeFuncionarios;
        }
    
    
    
    
}
