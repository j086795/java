
package aula_03_05_ex2;


public class Retangulo implements AreaCalculavel{

    private double base;
    private double altura;
    
    


    public void setBase(double base) {
        this.base = base;
    }

  
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public Retangulo(double b, double a) throws IllegalArgumentException{
    
        if((b<=0)||(a<=0)){
        
            throw new IllegalArgumentException("Valor inválido, os valores esperados são maiores que 0 (zero)");
            
        }else if(b == a){
            
            throw new IllegalArgumentException("Valor inválido,modifique um dos valores a fim de torná-los diferentes");
        
        }else{
            
        this.base = b;
        this.altura = a;
        
        
        }
    
    }
    
    double area = 0;
    
    
    @Override
    public double calcularArea() throws IllegalArgumentException{
        
        area = base*altura;
        
        return area;

    }
    
}
