/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;

public class Concessionária {

    private double totalDeVendas;
    private int totalDeFuncionarios;
    private double bonusIndividual;
    private double taxaTotalDeVendas = 0.05;
    private Vendedor[] vendedor;
    private Gerente[] gerente;
    private int nVendedor = 0;
    private int nGerente = 0;

    public Concessionária(int nVendedores, int nGerentes) {
        vendedor = new Vendedor[nVendedores];
        gerente = new Gerente[nGerentes];
    }

    public boolean novoVendedor(String n, String cpf, int reg, double salario) {
        boolean result;
        if (nVendedor < vendedor.length) {
            this.vendedor[this.nVendedor] = new Vendedor(n, cpf, reg, salario);
            this.nVendedor++;
            this.totalDeFuncionarios ++;
            result = true;
        } else {
            result = false;
        }
        return result;

    }
    public boolean novoGerente(String n, String cpf, int reg, double salario) {
        boolean result;
        if (nGerente < gerente.length) {
            this.gerente [this.nGerente] = new Gerente(n, cpf, reg, salario);
            this.nGerente++;
            this.totalDeFuncionarios++;
            result = true;
        } else {
            result = false;
        }
        return result;

    }

    public double bConcessionaria(double bIndividual) {
        bIndividual = (this.taxaTotalDeVendas * this.taxaTotalDeVendas) / this.totalDeFuncionarios;
        return bIndividual;
    }
    

}


    