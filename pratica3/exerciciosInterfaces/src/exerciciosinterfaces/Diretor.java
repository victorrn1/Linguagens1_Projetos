package exerciciosinterfaces;

/**
 *
 * @author Professor
 */
public class Diretor extends Funcionario implements IAutenticavel {

    protected int senha;
    
    public void darAumento(Funcionario f, int s, double aumento) {
        f.salario = f.salario + aumento;
    }

    @Override
    public boolean autentica(int senha) {
        if (senha == this.senha) {
            System.out.println("Autenticado com sucesso.");
        }
        return true;
    }

}
