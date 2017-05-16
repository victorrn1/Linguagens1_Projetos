package exerciciosinterfaces;

/**
 *
 * @author Professor
 */
public class Cliente implements IAutenticavel, IImprimivel {

    protected String nomeCompleto;
    protected String cpf;
    protected String senha;
    
    public Cliente (String nome, String CPF, String senha){
        this.setNomeCompleto(nome);
        this.setCpf(CPF);
        this.senha = senha;
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

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public void exibirResumo() {
        System.out.println("Nome:" + this.nomeCompleto);
        System.out.println("Nome:" + this.cpf);
    }

    @Override
    public void imprimirResumo() {
        
        System.out.println("Enviando o arquivo para a impressora");
        this.exibirResumo();
        System.out.println("Enviado com sucesso");
    }
}
