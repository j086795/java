
package Ex2;


public class Item {

    private int codigo;
    private String descricao;
    private int quantidadeItem;
    private float precoItem;
    
    
    public int getCodigo() {
        return codigo;
    }


    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


    public String getDescricao() {
        return descricao;
    }


    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public int getQuantidadeItem() {
        return quantidadeItem;
    }


    public void setQuantidadeItem(int quantidadeItem) {
        this.quantidadeItem = quantidadeItem;
    }


    public float getPrecoItem() {
        return precoItem;
    }


    public void setPrecoItem(float precoItem) {
        this.precoItem = precoItem;
    }
   
    
    //Construtor
    
    public Item(int cod,String desc,int qnt,float p){
        
        codigo = cod;
        descricao = desc;
        if(qnt<0)
            quantidadeItem = 0;
        else
            quantidadeItem = qnt;
        if(p<0)
            precoItem = 0;
        else
            precoItem = p;
        
    }
    
    //Metodos
    
    public float getTotal(){
        
        float getTotal = quantidadeItem*precoItem;
        return getTotal;
        
    }
    
    
}
