
package Ex4;


public class Estoque {

    
    private String nome;
    private int qtdAtual;
    private int qtdMinima;
    

    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getQtdAtual() {
        return qtdAtual;
    }

 
    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

 
    public int getQtdMinima() {
        return qtdMinima;
    }


    public void setQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }
    
    
    //Construtor
    
    public Estoque(String n,int qa,int qm){
        
        nome = n;
        if(qa>0)
            qtdAtual = qa;
        else
            qtdAtual = 0;
        
        if(qm>0)
            qtdMinima = qm;
        else
            qtdMinima = 0;
    
    }
    
    //Metodos
    
    public int repor(int qtd){
        
        qtdAtual+=qtd;
        return qtdAtual;
    
    }
    
    public int darBaixa(int qtd){
        
        qtdAtual-=qtd;
        return qtdAtual;
        
    }
    
    public String mostra(){
        
        System.out.println("Nome do produto: "+nome);
        System.out.println("Quantidade mínima: "+qtdMinima);
        System.out.println("Quantidade atual: "+qtdAtual);
        
        return null;
       
    }
    
    public boolean precisaRepor(){
        
        if(qtdAtual<=qtdMinima)
            return true;
        else
            return false;
    }
      
}
