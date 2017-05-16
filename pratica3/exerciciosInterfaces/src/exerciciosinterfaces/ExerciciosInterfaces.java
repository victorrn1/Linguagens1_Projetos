package exerciciosinterfaces;

public class ExerciciosInterfaces {

    public static void main(String[] args) {

        Secretario secretario = new Secretario("Paulo", "111.111.111-11", 1250);
        
        Gerente gerente = new Gerente("Ricardo", "222.222.222-22", 3000, "oi123");
        
        Diretor diretor = new Diretor("Rafael", "333.333.333-33", 6000, "alo123");
        
        Cliente cliente = new Cliente("Carol", "444.444.444-44", "hi123");
        
        Sistema sistema = new Sistema();
        
       String senhaTentativaAcessoSistema = "alo123";
        if (sistema.login( diretor , senhaTentativaAcessoSistema )) {
            //Acesso ao sistema
               System.out.println("Acessou");
        }

    }

}
