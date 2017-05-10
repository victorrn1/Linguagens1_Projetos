package exerciciosinterfaces;

/**
 *
 * @author Professor
 */
public class Cliente implements IAutenticavel, IImprimivel {

    protected String nomeCompleto;
    protected String cpf;
    protected int senha;

    @Override
    public boolean autentica(int senha) {
        if (senha == this.senha) {
            System.out.println("Autenticado com sucesso.");
        }
        return true;
    }

    @Override
    public void exibirResumo() {
        System.out.println("Nome:" + this.nomeCompleto );
        System.out.println("Nome:" + this.cpf );
    }

    @Override
    public void imprimirResumo() {
        System.out.println("Enviando o arquivo para a impressora");
        System.out.println("Enviado com sucesso");
    }
}
