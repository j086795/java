
package Ex;

import java.util.ArrayList;
import java.util.Iterator;


public class Ex {


    public static void main(String[] args) {
        
        Livro l1 = new Livro();
        Livro l2 = new Livro();
        Revista r1 = new Revista();
     
        ArrayList <Produto> catalogo = new ArrayList();
        catalogo.add(l1);
        catalogo.add(l2);
        catalogo.add(r1);

        
    Iterator <Produto> it = catalogo.iterator(); 
    while(it.hasNext()){
    
       Produto p = it.next();
       p.mostradados();
       if (p instanceof Revista){
       
           System.out.println("======");
           p.mostradados();
       }
    }
        
    }
    
}
