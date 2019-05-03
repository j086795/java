
package aula_03_05;


public class Aula_03_05 {
    
    


    public static void main(String[] args) {
       
        Object o = null;
    
        try{
            
        o.toString();
        
        }
        catch(NullPointerException e){
        
            System.out.println("O valor informado não é válido!\n"+e.toString());
            
        }
        
        finally{
        
            System.out.println("Operação finalizada!\n");
        }
    }
    
}
