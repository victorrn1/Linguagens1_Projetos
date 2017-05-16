package exerciciosinterfaces;

/**
 *
 * @author Professor
 */
public class Secretario extends Funcionario implements IExibicao {

    public Secretario (String nome, String CPF, double salario){
        this.setNomeCompleto(nome);
        this.setCpf(CPF);
        this.setSalario(salario);
        
    }
    
    public boolean atenderTelefone(boolean ocupado) {
        return !ocupado;
    }

    @Override
    public void exibirResumo() {
        System.out.println("Nome Completo:" + this.getNomeCompleto());
        System.out.println("CPF:" + this.getCpf());
        System.out.println("Salario:" + this.getSalario());

    }

}
