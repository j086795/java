
package Ex2;


public class Professor extends Pessoa {
    
    private float salario;
    
    public Professor(String n,int i,float sal){
    
        super(n,i);
        salario = sal;
    }
    
    //Metodo
    
    @Override
    public void imprimir(){

        super.imprimir();
    }
    
    
    public void imprimirSalario(){
        
        System.out.println("Salário: "+salario);

    }
    
    public float aumento(){
    
        float aumento = (float) (salario*1.1);
        
        return aumento;
    
    }
    
}
