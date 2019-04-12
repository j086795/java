
package Ex1;

import java.util.ArrayList;
import java.util.Iterator;


public class Ex1 {


    public static void main(String[] args) {

        Vip ingresso1 = new Vip(10.5f);
        Vip ingresso2 = new Vip(15.3f);
        Vip ingresso3 = new Vip(18.2f);
        Comum ingresso4 = new Comum(5.5f);
        Comum ingresso5 = new Comum(7.5f);
        Comum ingresso6 = new Comum(9.5f);
        
        ingresso1.imprimirValor();
        ingresso2.imprimirValor();
        ingresso3.imprimirValor();
        ingresso4.imprimirValor();
        ingresso5.imprimirValor();
        ingresso6.imprimirValor();

        
        ArrayList <Ingresso> faturamento = new ArrayList();
        
        faturamento.add(ingresso1);
        faturamento.add(ingresso2);
        faturamento.add(ingresso3);
        faturamento.add(ingresso4);
        faturamento.add(ingresso5);
        faturamento.add(ingresso6);
        
        System.out.println("====");
        
        Iterator <Ingresso> it = faturamento.iterator();
        float soma = 0;
        while(it.hasNext()){
            
            
            Ingresso fat = it.next();
            soma +=fat.getValor();
            
        }
       
        System.out.printf("\nO faturamento total é de R$ "+soma);
        System.out.printf("\n\n");
            
    }
     
    
}
