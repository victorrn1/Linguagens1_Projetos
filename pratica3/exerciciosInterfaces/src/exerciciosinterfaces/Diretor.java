package exerciciosinterfaces;

/**
 *
 * @author Professor
 */
public class Diretor extends Funcionario implements IAutenticavel {

    private String senha;
    
    public Diretor (String nome, String CPF, double salario, String senha){
        this.setNomeCompleto(nome);
        this.setCpf(CPF);
        this.setSalario(salario);
        this.senha = senha;
    }

    public boolean darAumento(Funcionario f, String s, double aumento) {
       
        boolean retorno = false;
        if (this.autentica(s)) {
            f.setSalario(f.getSalario() + aumento);
            retorno = true;
        }
        return retorno;
    }

    @Override
    public boolean autentica(String senha) {
        return (this.senha.equals(senha));           
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
