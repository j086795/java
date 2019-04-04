
package Ex2;

import java.util.ArrayList;
import java.util.Iterator;


public class Ex2 {


    public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno("Julio",29,9f);
        aluno1.imprimir();
        aluno1.imprimirNota();
        
        Professor professor1 = new Professor("João",35,1500f);
        professor1.imprimir();
        professor1.imprimirSalario();
        
    
    ArrayList <Pessoa> cadastroCotil = new ArrayList();
        
        cadastroCotil.add(aluno1);
        cadastroCotil.add(professor1);

    
    Iterator <Pessoa> it = cadastroCotil.iterator();
    while(it.hasNext()){
    
       Pessoa p = it.next();
       if (p instanceof Professor){
       
           System.out.println("======");
           p.imprimir();

       }
    }
    
    }
}
