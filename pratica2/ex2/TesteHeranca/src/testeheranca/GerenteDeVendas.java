package testeheranca;

public class GerenteDeVendas extends Vendedor{

    private String senha;
    private int nVendedores;

    public GerenteDeVendas(String nome, String sobrenome, String cpf, double salarioBase, String registro, String senha) {
        
        super(nome, sobrenome, cpf, salarioBase, registro);
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
        this.registro = registro;
        this.senha = senha;
    }

    public boolean darAumento(Vendedor vend, double aumento, String senha) {
        if (vend.getRegistroGerente().equals(this.registro)) {
            if (senha.equals(this.senha)) {
                if (aumento > 0) {
                    vend.setSalarioBase(vend.getSalarioBase() * aumento + vend.getSalarioBase());
                    return true;
                }
            }
        } 
        return true;        
    }

    public double getNVendedores() {
        return this.nVendedores;
    }

    /*public double calcularComissão() {
        return (this.totalVendas * GerenteDeVendas.taxaComissao);
    }*/
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
        return (this.salarioBase + this.horaExtra);
    }

    public int acresceVendedor() {
        return this.nVendedores = this.nVendedores + 1;
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
