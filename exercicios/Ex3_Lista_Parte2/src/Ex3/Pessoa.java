
package Ex3;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Pessoa {

    private int idade;
    private int dia;
    private int mes;
    private int anoNascimento;
    private String nome;
    
    

    public int getIdade() {
        return idade;
    }


    public void setIdade(int idade) {
        this.idade = idade;
    }


    public int getDia() {
        return dia;
    }

  
    public void setDia(int dia) {
        this.dia = dia;
    }


    public int getMes() {
        return mes;
    }

 
    public void setMes(int mes) {
        this.mes = mes;
    }

 
    public int getAnoNascimento() {
        return anoNascimento;
    }


    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    //Construtor
    
    public Pessoa(int d,int m,int a,String n){
    
        if(d>=1 && d<=31)
            dia = d;
        else
            System.out.println("Dia inválido!");
        
        if(m>=1 && m<=12)
            mes = m;
        else
            System.out.println("Mês Inválido");
        
        if(a>=1000)
            anoNascimento = a;
        else
            System.out.println("Ano Inválido");
        nome = n;
    }
    
    public Pessoa(int m,int a,String n){
    
        dia = 0;
        if(m>=1 && m<=12)
            mes = m;
        else
            System.out.println("Mês Inválido");
        
        if(a>=1000)
            anoNascimento = a;
        else
            System.out.println("Ano Inválido");
        nome = n;
    }
    
    //Métodos
    
    public int calculaIdade(){
        
        Date data = new Date();
        SimpleDateFormat formatar = new SimpleDateFormat("d");
        String diaAtual1 = formatar.format(data);
        int diaAtual = Integer.parseInt(diaAtual1);
        
        SimpleDateFormat formatar1 = new SimpleDateFormat("m");
        String mesAtual1 = formatar1.format(data);
        int mesAtual = Integer.parseInt(mesAtual1);
        
        SimpleDateFormat formatar2 = new SimpleDateFormat("y");
        String anoAtual1 = formatar2.format(data);
        int anoAtual = Integer.parseInt(anoAtual1);
                
        if(dia==diaAtual && mes==mesAtual)
            idade = (anoAtual-anoNascimento);
        else
            if(dia>diaAtual && mes>=mesAtual) 
                idade = (anoAtual-anoNascimento)-1;
        else
            if(dia==diaAtual && mes>mesAtual)    
                idade = (anoAtual-anoNascimento)-1;
        else
            if(dia<diaAtual && mes<=mesAtual) 
                idade = (anoAtual-anoNascimento);
        else
            if(dia<diaAtual && mes>mesAtual) 
                idade = (anoAtual-anoNascimento)-1;
        else
            if(dia>diaAtual && mes<mesAtual) 
                idade = (anoAtual-anoNascimento);
                
        return 0;
                  
    }
    
    public int informaIdade(){
    
        System.out.println("Idade: "+idade+" anos");
        
        return idade;
    }
    
    public String informaNome(){
    
        System.out.println("Nome: "+nome);
        
        return nome;
    }
    
}
