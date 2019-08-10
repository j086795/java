
package model.bean;


public class Aluno {

    
    private String nome;
    private int ra;

    public Aluno(int ra, String nome) {
        this.ra = ra;
        this.nome = nome;
    }

   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRA() {
        return ra;
    }

    public void setRA(int RA) {
        this.ra = RA;
    }
  
}
