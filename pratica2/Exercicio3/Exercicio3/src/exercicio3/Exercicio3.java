package exercicio3;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nVend;
        int nGer;
        //perguntar num vendedores
        System.out.println("Quantos vendedores terá sua concessionária?");
        nVend = scan.nextInt();

        //perguntar num gerentes
        System.out.println("Quantos gerentes terá sua concessionária?");
        nGer = scan.nextInt();

        Concessionaria cons = new Concessionaria(nVend, nGer);

        int op;
        do {
            System.out.println("O que deseja fazer?");
            System.out.println("1- Inserir Funcionário");
            System.out.println("2- Realizar venda");
            System.out.println("3- Sair");
            op = scan.nextInt();
            switch (op) {
                case 1:
                    int x;
                    System.out.println("1- Inserir Vendedor");
                    System.out.println("2- Inserir Gerente");
                    System.out.println("3- Voltar ao Menu Anterior");
                    x = scan.nextInt();
                    Exercicio3.inserirFuncionario(x, cons);
                    break;
                case 2:
                    int y;
                    System.out.println("1- Vendedor");
                    System.out.println("2- Gerente");
                    System.out.println("3- Voltar ao Menu Anterior");
                    y = scan.nextInt();

                    break;
                case 3:
                    op = 0;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (op != 0);

    }

    private static void inserirFuncionario(int op, Concessionaria cons) {
        Scanner scan = new Scanner(System.in);
        String nome;
        String cpf;
        int reg;
        double sal;
        int regGerente;
        String senha;
        do {
            switch (op) {
                case 1:
                    System.out.println("Nome:");
                    nome = scan.next() + scan.next();
                    System.out.println("CPF:");
                    cpf = scan.next();
                    System.out.println("Registro:");
                    reg = scan.nextInt();
                    System.out.println("Salário:");
                    sal = scan.nextDouble();
                    System.out.println("Registro do Gerente:");
                    regGerente = scan.nextInt();
                    cons.novoVendedor(nome, cpf, reg, sal, regGerente);
                    break;
                case 2:
                    System.out.println("Nome:");
                    nome = scan.next() + scan.next();
                    System.out.println("CPF:");
                    cpf = scan.next();
                    System.out.println("Registro:");
                    reg = scan.nextInt();
                    System.out.println("Salário:");
                    sal = scan.nextDouble();
                    System.out.println("Senha:");
                    senha = scan.next();
                    cons.novoGerente(nome, cpf, reg, sal, senha);
                    break;
                case 3:
                    op = 0;
                    break;
                default:
                    System.out.println("Opção inválida");
            }

        } while (op != 0);

    }

    private static void menuRealizarVenda(int op, Concessionaria cons) {
        Scanner scan = new Scanner(System.in);
        
        do {
            switch (op) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    op = 0;
                    break;
                default:
                    System.out.println("Opção inválida");
            }

        } while (op != 0);
       
    }

}
