
package Ex2;

import java.util.ArrayList;
import java.util.Iterator;


public class Ex2 {


    public static void main(String[] args) {
        
        Novo imovel1 = new Novo("Rua 1",150000f);
        Novo imovel2 = new Novo("Rua 2",250000f);
        Antigo imovel3 = new Antigo("Rua 5",300000f);
        Antigo imovel4 = new Antigo("Rua 10",180000f);
        
        System.out.println("Dados do imóvel: \n");
        
        imovel1.imprimir();
        imovel2.imprimir();
        imovel3.imprimir();
        imovel4.imprimir();
        
        
        ArrayList <Imovel> lista = new ArrayList();
        
        lista.add(imovel1);
        lista.add(imovel2);
        lista.add(imovel3);
        lista.add(imovel4);
        
        Iterator<Imovel> it = lista.iterator();

        System.out.println("\n====");
        while(it.hasNext()){
            
            Imovel p = it.next();
           if(p instanceof Novo){
           
               p.imprimir();
           }
            
            
        
        }
        System.out.println("\n");
    }
    
}
