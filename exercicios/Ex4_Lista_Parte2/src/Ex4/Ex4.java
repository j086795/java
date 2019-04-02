
package Ex4;


public class Ex4 {


    public static void main(String[] args) {
        
        Estoque estoque1 = new Estoque("Impressora",13,6);
        estoque1.repor(0);
        estoque1.darBaixa(5);
        estoque1.mostra();
        System.out.println("Precisa repor? "+estoque1.precisaRepor());
        
        System.out.println("\n");
        
        Estoque estoque2 = new Estoque("Monitor",11,13);
        estoque2.repor(7);
        estoque2.darBaixa(0);
        estoque2.mostra();
        System.out.println("Precisa repor? "+estoque2.precisaRepor());
        
        System.out.println("\n");
        
        Estoque estoque3 = new Estoque("Mouse",6,2);
        estoque3.repor(0);
        estoque3.darBaixa(4);
        estoque3.mostra();
        System.out.println("Precisa repor? "+estoque3.precisaRepor());
    }
    
}
