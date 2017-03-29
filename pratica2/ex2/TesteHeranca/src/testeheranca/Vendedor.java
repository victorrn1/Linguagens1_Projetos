
package testeheranca;


public class Vendedor {
    private String nome;
    private String sobrenome;
    private String cpf;
    private double salarioBase;
    private String registro;
    private static double taxaComissao = 0.3;
    private double horaExtra;
    private double totalVendas;
    private GerenteDeVendas registroGerente;

    public Vendedor(String nome, String sobrenome, String cpf, double salarioBase, String registro, GerenteDeVendas registroGerente) 
    {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
        this.registro = registro;
        this.registroGerente= registroGerente;
        this.registroGerente.acresceVendedor();
    }

    public double getSalarioBase() {
        return this.salarioBase;
    }

    public void setSalarioBase(double sB) {
        if (sB > 0) {
            this.salarioBase = sB;
        }
    }

    public String getNome() {
        return this.nome;
    }

    public String setNome(String nome) {
        return this.nome = nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public String setSobrenome(String sobrenome) {
        return this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String setCpf(String cpf) {
        return this.cpf = cpf;
    }

    public String getRegistro() {
        return this.registro;
    }

    public String setRegistro(String registro) {
        return this.registro = registro;
    }

    public double getTaxaComissao() {
        return Vendedor.taxaComissao;
    }

    public double setTaxaComissao(double tc) {
        return Vendedor.taxaComissao = tc;
    }

    public double getHorasExtras() {
        return this.horaExtra;
    }

    public double setHorasExtras(double he) {
        return this.horaExtra = he;
    }

    public double calcularComissão() {
        return (this.totalVendas * Vendedor.taxaComissao);
    }

    public boolean contabilizarVenda(double valor) {
        if (valor < 0) {
            return false;
        } else {
            this.totalVendas = valor + this.totalVendas;
            return false;
        }
    }

    public double calcularDecimoTerceiro() {
        return this.salarioBase + 1;
    }

    public double calcularFerias() {
        return (this.salarioBase + (1 / 3) * this.salarioBase);

    }

    public double salarioDoMes() {
        return (this.salarioBase + this.horaExtra + this.calcularComissão());
    }

    public void exibirResumo() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Sobrenome: " + this.sobrenome);
        System.out.println("Cpf: " + this.cpf);
        System.out.println("Registro: " + this.registro);
        System.out.println("Salário Base: " + this.salarioBase);
        System.out.println("Total de Vendas: " + this.totalVendas);
        System.out.println("Horas Extras: " + this.horaExtra);
        System.out.println("Salário Mês: " + this.salarioDoMes());
        System.out.println("Décimo Terceiro: " + this.calcularDecimoTerceiro());
    }
}

    

