package exerciciosinterfaces;

/**
 *
 * @author Professor
 */
public class Gerente extends Funcionario implements IAutenticavel {

    private String senha;

    public Gerente (String nome, String CPF, double salario, String senha){
        this.setNomeCompleto(nome);
        this.setCpf(CPF);
        this.setSalario(salario);
        this.senha = senha;
    }

    
    @Override
    public boolean autentica(String senha) {
        return(this.senha.equals(senha));           
    }
    
    public boolean alterarSenha(String novaSenha, String senhaAntiga) {
        
        boolean retorno = false;
        
        if (senhaAntiga.equals(this.senha)) {
            this.senha = novaSenha;
            retorno = true;
        }
        return retorno;        
    }

}
