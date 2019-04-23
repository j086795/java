
package aula_23_04_1;


public class Fusca implements Carro, ItemCaro {

    @Override
    public void abrirPorta() {
        
        System.out.println("Fusca abriu a porta");
        System.out.println("Este fusca é novo");
  
    }

    @Override
    public void virarEsquerda() {
        
        System.out.println("Fusca virou a esquerda");
        System.out.println("Esse fusca é flex");

    }

    @Override
    public void virarDireita() {
        
        System.out.println("Fusca virou a direita");
        System.out.println("Fusca conversível");

    }

    @Override
    public void acelerar() {
        
        System.out.println("Fusca acelerou");
        System.out.println("Perdeu o motor");
     
    }

    @Override
    public double getPreco() {
        
        double imposto = 40000;
        
        return(40000+imposto);
       
    }
    
    
    
}
