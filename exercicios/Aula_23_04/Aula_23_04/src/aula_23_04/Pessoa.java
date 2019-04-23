
package aula_23_04;


public abstract class Pessoa {
    
    //atributo
    private int idade;
    
    //metodo abstrato
    public abstract void mostraDados();
    
    //metodo concreto
    public final void testaDados(){
    
        System.out.println("testando dados da pessoa");
    
    }
    
}
