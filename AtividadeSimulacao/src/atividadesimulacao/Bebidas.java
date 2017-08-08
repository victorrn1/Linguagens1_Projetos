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
public class Bebidas extends Produto implements ICarregavel {

    static enum tipoBebida {  coca, minalba };

    public Bebidas(tipoBebida tipo) {

        this.necessitaSeguro = false;
        this.dim = new Dimensoes();
        this.dim.altura = 31;
        this.dim.comprimento = 9;
        this.dim.largura = 9;
        this.dim.raio = 9 / 2;

        switch (tipo) {
            case coca:
                this.nome = "Coca-Cola";
                this.preco = 5;
                break;
            case minalba:
                this.nome = "Minalba";
                this.preco = 1.3;
                break;
        }

    }

    @Override
    public Dimensoes getDimensoes() {
        return this.dim;
    }

    @Override
    public double getValor() {
        return this.preco;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public boolean seguroObrigatorio() {
        return this.necessitaSeguro;
    }

}
