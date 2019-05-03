
package aula_03_05_ex2;


public class Aula_03_05_Ex2 {

  
    public static void main(String[] args) {
 
        
        try{
            
        Quadrado q1 = new Quadrado(-1);
        //Circulo c1 = new Circulo(0);
        //Retangulo r1 = new Retangulo(0,1);
        
        
         
        q1.calcularArea();
        //c1.calcularArea();
        //r1.calcularArea();
        
        }
        catch(IllegalArgumentException e){
        
            System.out.println("Valores inválidos");
        }
        
    }
    
}
