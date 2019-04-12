
package Ex2;


public class Aluno extends Pessoa {
    
    private float nota;
    
public Aluno(String n,int i,float nt){
    
    super(n,i);
    nota = nt;
    
}
    
    //Metodo
    
    @Override
    public void imprimir(){

        super.imprimir();
    }
    
    
    public void imprimirNota(){
        
        System.out.println("Nota: "+nota);

    }
}
