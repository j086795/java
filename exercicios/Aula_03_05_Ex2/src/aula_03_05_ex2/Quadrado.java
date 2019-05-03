
package aula_03_05_ex2;


public class Quadrado implements AreaCalculavel {
    
    private double lado;
    
 
 
    public void setLado(double lado) {
        
        this.lado = lado;
    }
    
    
    public Quadrado(double l) throws IllegalArgumentException{
    
        if(l<0){
        throw new IllegalArgumentException("Valor inválido, o valor esperado é maior que 0 (zero)");
        }else
        {
            this.lado = l;
        }
    }

    double area = 0;
    
    @Override
    public double calcularArea(){
        
        area = lado*lado;
        
        return area;
        
    }
    
}
