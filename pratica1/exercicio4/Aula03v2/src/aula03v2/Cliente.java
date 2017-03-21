package aula03v2;

public class Cliente {

    private String nome;
    private String sobrenome;
    private String cpf;

    public Cliente(String nome, String sobre, String cpf) {
        this.nome = nome;
        this.sobrenome = sobre;
        this.cpf = cpf;
    }

    String getNome() {
        return this.nome;
    }

    String setNome(String nome) {
        return this.nome = nome;
    }

    String getSobrenome() {
        return this.sobrenome;
    }

    String setSobrenome(String sobrenome) {
        return this.sobrenome = sobrenome;
    }

    String getCpf() {
        return this.cpf;
    }

    String setCpf(String cpf) {
        return this.cpf = cpf;
    }
}
