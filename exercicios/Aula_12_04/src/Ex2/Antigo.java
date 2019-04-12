
package Ex2;


public class Antigo extends Imovel{
    
    public Antigo(String end, float p) {
        super(end, p);
    }
    
    public float preco(){
        float novoPreco = (float) (getPreco()*0.7);
    
        return novoPreco;
    }
    
    @Override
    public void imprimir(){
        
        System.out.println("\nEndereço: "+getEndereco()+"\nPreço com desconto: "+preco());
    
        
    }
    
}
