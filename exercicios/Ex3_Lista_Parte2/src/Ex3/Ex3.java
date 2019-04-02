
package Ex3;


public class Ex3 {


    public static void main(String[] args) {
        
        Pessoa pessoa1 = new Pessoa(8,2,1990,"Julio");
        pessoa1.calculaIdade();
        pessoa1.informaNome();
        pessoa1.informaIdade();
        
        System.out.println("\n");
        
        Pessoa pessoa2 = new Pessoa(14,3,1879,"Albert Einstein");
        pessoa2.calculaIdade();
        pessoa2.informaNome();
        pessoa2.informaIdade();
        
        System.out.println("\n");
        
        Pessoa pessoa3 = new Pessoa(04,01,1643,"Isaac Newton");
        pessoa3.calculaIdade();
        pessoa3.informaNome();
        pessoa3.informaIdade();
            
    }
    
}
