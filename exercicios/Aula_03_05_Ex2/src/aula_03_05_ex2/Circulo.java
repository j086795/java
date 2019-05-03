
package aula_03_05_ex2;


public class Circulo implements AreaCalculavel{

    private double raio;


    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    public Circulo(double r) throws IllegalArgumentException{
        
        if(r<0){
            
        throw new IllegalArgumentException("Valor inválido, o valor esperado é maior que 0 (zero)");
        
        }else{
        
            this.raio = r;
        }
    
    }
    
    double area = 0;
    
    
    @Override
    public double calcularArea() {
        
        area = (3.14159265359*(raio*raio));
        
        return area;

    }
    
}
