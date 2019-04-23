
package aula_23_04_1;


public class Aula_23_04_1 {


    public static void main(String[] args) {
        
        Ferrari f1 = new Ferrari();
        f1.acelerar();
        double preco = f1.getPreco();
        System.out.println("A ferrari custa "+preco);
        
        Fusca f2 = new Fusca();
        f2.virarEsquerda();
        f2.abrirPorta();
        double precof = f2.getPreco();
        System.out.println("O preco do fusca é "+precof);

    }
    
}
