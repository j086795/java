
package Ex1;


public class Vip extends Ingresso {
    
    public Vip(float v) {
        super(v);
    }
    


    @Override
    public void imprimirValor(){
        
        float valor = this.getValor()+10;
        System.out.println("Valor do ingresso: "+valor);
        
    }
    
    
    
    
    
}
