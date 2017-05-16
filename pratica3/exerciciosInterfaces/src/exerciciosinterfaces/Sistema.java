package exerciciosinterfaces;


public class Sistema {
    public boolean login( IAutenticavel objeto, String senhaDeAcesso){
      return  objeto.autentica(senhaDeAcesso);
      
    }
}
