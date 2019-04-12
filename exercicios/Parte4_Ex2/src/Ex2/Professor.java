
package Ex2;


public class Professor extends Pessoa {
    
    private float salario;
    
    public Professor(String n,int i,float sal){
    
        super(n,i);
        salario = sal;
    }
    
    

    public float getSalario() {
        return salario;
    }

 
    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
    //Metodo
    
    @Override
    public void imprimir(){

        super.imprimir();
    }
    
    
    public void imprimirSalario(){
        
        System.out.println("Salário: "+getSalario());

    }
    
    public float aumento(){
    
        float aumento = (float) (getSalario()*1.1);
        System.out.println("Salário com aumento: "+aumento);
        
        return aumento;
    
    }

        
}
