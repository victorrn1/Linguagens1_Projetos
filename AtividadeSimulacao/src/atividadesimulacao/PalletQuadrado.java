/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadesimulacao;

/**
 *
 * @author Tiago-note
 */
public class PalletQuadrado extends Pellet {
    
    static private Dimensoes dim;
    
    public PalletQuadrado (  ){
        PalletQuadrado.dim = new Dimensoes();
        PalletQuadrado.dim.altura = 10;
        PalletQuadrado.dim.comprimento = 100;
        PalletQuadrado.dim.largura = 100;
        this.carregado = false;
    }

    static public int qtdProdutos(ICarregavel produto) {
        
        Dimensoes a = produto.getDimensoes();
        int nLargura = Math.floorDiv(PalletQuadrado.dim.largura, a.largura);
        int nComprimento = Math.floorDiv(PalletQuadrado.dim.comprimento, a.comprimento);
        int nAltura = (int) (250 - PalletQuadrado.dim.altura)/a.altura;                
        return nLargura*nComprimento*nAltura;      
        
        
    }
    
}
