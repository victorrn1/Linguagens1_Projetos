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
    }
    
}
