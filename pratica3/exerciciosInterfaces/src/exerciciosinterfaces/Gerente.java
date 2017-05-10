package exerciciosinterfaces;

/**
 *
 * @author Professor
 */
public class Gerente extends Funcionario implements IAutenticavel {

    private int senha;

    

    @Override
    public boolean autentica(int senha) {
        if (senha == this.senha) {
            System.out.println("Autenticado com sucesso.");
        }
        return true;
    }

}
