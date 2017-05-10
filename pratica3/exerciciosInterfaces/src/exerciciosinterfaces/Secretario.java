
package exerciciosinterfaces;

/**
 *
 * @author Professor
 */
public class Secretario extends Funcionario implements IExibicao {

    @Override
    public void exibirResumo() {
        System.out.println("Nome Completo:" + this.nomeCompleto);
        System.out.println("CPF:" + this.cpf);
        System.out.println("Salario:" + this.salario);
        
    }
    
}
