
package aula_23_04_1;


public class Ferrari implements Carro, ItemCaro{

    @Override
    public void abrirPorta() {
        
        System.out.println("Ferrari abriu porta");
    }

    @Override
    public void virarEsquerda() {
 
        System.out.println("Ferrari virou a esquerda");
    }

    @Override
    public void virarDireita() {

        System.out.println("Ferrari virou a direita");
    }

    @Override
    public void acelerar() {
        
        System.out.println("Ferrari acelerou");
 
    }

    @Override
    public double getPreco() {
 
        return(1500000);
    }
    
}
