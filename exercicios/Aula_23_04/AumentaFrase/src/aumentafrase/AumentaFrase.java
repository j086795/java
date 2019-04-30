
package aumentafrase;


public class AumentaFrase {
    
    public static void aumentarLetra()throws NullPointerException{
    
        String frase = null;
        String novaFrase = null;
        
        try{
        
          novaFrase = frase.toUpperCase(); 
          
        }
        
        catch(NullPointerException e){
        
            throw new NullPointerException("Esperado valor diferente de nulo");
        }
        
        System.out.println("Frase antiga: "+frase);
        System.out.println("Nova frase: "+novaFrase);
    
    }

  
    public static void main(String[] args) {
        
        try{
            
        aumentarLetra();  
        
        }
        catch(NullPointerException e){
        
            System.out.println("Metodos não pode ser executado porque a string antiga é nula");
            
        }
    }
    
}


