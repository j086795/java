
package Ex1;


public class Funcionario {
    
    private String nome;
    private String sobrenome;
    private float salarioMensal;


    public String getNome() {
        return nome;
    }

 
    public void setNome(String nome) {
        this.nome = nome;
    }

  
    public String getSobrenome() {
        return sobrenome;
    }

 
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

 
    public float getSalarioMensal() {
        return salarioMensal;
    }


    public void setSalarioMensal(float salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
    
    //Construtor
    
    public Funcionario(String n, String s, float sal){
        
        nome = n;
        sobrenome = s;
        if(sal<0)
            salarioMensal = 0;
        else
            salarioMensal = sal;
       
    }
    
    public Funcionario(String n, float sal){
        
        nome = n;
        sobrenome = "";
        if(sal<0)
            salarioMensal = 0;
        else
            salarioMensal = sal;
       
    }
    
    public Funcionario(float sal){
        
        nome = "";
        sobrenome = "";
        if(sal<0)
            salarioMensal = 0;
        else
            salarioMensal = sal;
       
    }
    
    public Funcionario(String n){
        
        nome = n;
        sobrenome = "";
        salarioMensal = 0;
       
    }
    
    //Metodos
    
    public float salarioAnual(){
        
        float salarioAnual = salarioMensal*12;
        return salarioAnual;
    
    }
    
    public float salarioAnualAumento(){
        
        float salarioAnualAumento = (salarioMensal*1.1f)*12;
        return salarioAnualAumento;
    
    }
    
}
