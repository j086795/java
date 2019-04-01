
package parte2_ex;


public class Retangulo {
    
    private float base;
    private float altura;


    public float getBase() {
        return base;
    }


    public void setBase(float base) {
        this.base = base;
    }


    public float getAltura() {
        return altura;
    }

 
    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    //Construtor
    
    public Retangulo(float b,float a){
        
        if(b>1 && b<20)
            base = b;
        else
            base = 0;
        
        if(a>1 && a<20)
            altura = a;
        else
            altura = 0;
        
    }
    
    //Metodos
    
    public float perimetro(){
        
        float perimetro = (base*2 + altura*2);
        System.out.println("Perímetro: "+perimetro);
        return perimetro;
    }
    
    public float area(){
        
        float area = (base*altura);
        System.out.println("Área: "+area);
        return area;
    }
    
}
