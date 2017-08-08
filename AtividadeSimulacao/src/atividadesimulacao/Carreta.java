/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadesimulacao;

/**
 *
 * @author Professor
 */
public class Carreta {

    private Dimensoes dim;
    private boolean seguro;
    private Pellet[] pallets; //array
    private int qtdePalletsR;
    private int qtdePalletsQ;

    public Carreta(boolean seguro, Dimensoes dim) {

        this.seguro = seguro;
        this.dim = new Dimensoes();
        this.dim.altura = 250;
        this.dim.comprimento = dim.comprimento;
        this.dim.largura = dim.largura;

    }

    public void melhorDistribuicao() {
        
        int nComprimento =(int) this.dim.comprimento/100;
                
        if (this.dim.largura == 300) {
            this.qtdePalletsQ = nComprimento*3;
            this.qtdePalletsR = 0;
            
        } else if (this.dim.largura >= 280) {
            this.qtdePalletsQ = 0;
            this.qtdePalletsR = nComprimento*2;
        } else if (this.dim.largura >= 240) {
            this.qtdePalletsQ = nComprimento*1;
            this.qtdePalletsR = nComprimento*1;
        } else if (this.dim.largura >= 210) {
            this.qtdePalletsQ = nComprimento*2;
            this.qtdePalletsR = 0;
        }
    }

    public Dimensoes getDim() {
        return dim;
    }

    /**
     * @param dim the dim to set
     */
    public void setDim(Dimensoes dim) {
        this.dim = dim;
    }

    /**
     * @return the seguro
     */
    public boolean isSeguro() {
        return seguro;
    }

    /**
     * @return the pallets
     */
    public Pellet getPallets() {
        return pallets;
    }

    /**
     * @param qtdePallets the qtdePallets to set
     */
    public void setQtdePallets(int qtdePallets) {
        this.qtdePallets = qtdePallets;
    }

}
