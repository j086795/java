
package Ex2;


public class Imovel {

    private String endereco;
    private float preco;
    

    public String getEndereco() {
        return endereco;
    }


    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

 
    public float getPreco() {
        return preco;
    }


    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    
    public Imovel(String end,float p){
        
        endereco = end;
        preco = p;
        
    }   
    
    public void imprimir(){
    
        System.out.println("Endereço: "+endereco+"\nPreço: "+preco);
    }
    
    
    
}
