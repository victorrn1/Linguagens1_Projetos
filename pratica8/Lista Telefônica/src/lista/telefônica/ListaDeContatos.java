/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.telefônica;

import java.util.ArrayList;


public class ListaDeContatos {

    private ArrayList<Contato> lista = new ArrayList<>();

    public ArrayList<Contato> getLista() {
        return lista;
    }
    
    public void Adicionar (String nome,int celular){
        lista.add(new Contato(celular ,nome));
    } 
    public void Remover (int n){
        lista.remove(n);
    }

    
    

}
