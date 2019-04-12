
package Ex1;


public class Ingresso {

   private float valor;
   
 
    public float getValor() {
        return valor;
    }

     public void setValor(float valor) {
        this.valor = valor;
    }
     
     //Construtor
     
     public Ingresso(float v){
     
         valor = v;
     }
     
     //Metodo
     
     public void imprimirValor(){
     
         System.out.println("Valor do ingresso: "+valor);
     

     }
     
    
}
