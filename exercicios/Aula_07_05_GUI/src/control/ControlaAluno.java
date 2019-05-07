
package control;

import java.util.ArrayList;
import model.Aluno;


public class ControlaAluno {
    
    //arrayList - atributo
    private ArrayList lista;
    
    //construtor
    
    public ControlaAluno(){
    
        lista = new ArrayList();
    }
    
    //método
    
    public Aluno adicionaNaLista(String nome, int idade){
    
        Aluno al1 = new Aluno();
        al1.setNome(nome);
        al1.setIdade(idade);
        
        //adicionando aluno na ArrayList
        
        lista.add(al1);
        
        return al1;
    }
    
}
