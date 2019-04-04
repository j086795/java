
package Ex2;


public class Pessoa {

    protected String nome;
    protected int idade;
    

    public String getNome() {
        return nome;
    }

 
    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getIdade() {
        return idade;
    }

 
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    //Construtor
    
    public Pessoa(String n,int i){
        
        nome = n;
        idade = i;
       
    }
    
    //Metodo
    
    public void imprimir(){
    
        System.out.println("\nNome: "+nome+"\nIdade: "+idade);
    }
    
    
}
