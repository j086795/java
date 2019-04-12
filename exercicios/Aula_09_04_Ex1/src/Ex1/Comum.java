
package Ex1;


public class Comum extends Ingresso{
    
    public Comum(float v) {
        super(v);
    }
    

    @Override
    public void imprimirValor(){
        
        float v = this.getValor();
        System.out.println("Valor do ingresso: "+v);
    }
    
}
