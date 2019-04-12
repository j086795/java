
package Ex2;


public class Novo extends Imovel{
    
    public Novo(String end, float p) {
        super(end, p);
    }
    
    public float preco(){
        
        float precoNovo = (float) (getPreco()*1.3);
        return precoNovo;
        
    }
    
    @Override
    public void imprimir(){
    
        System.out.println("\nEndereço: "+getEndereco()+"\nPreço com acréscimo: "+preco());
    }
}
