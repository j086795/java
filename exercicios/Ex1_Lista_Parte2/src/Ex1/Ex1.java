
package Ex1;


public class Ex1 {

 
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario("Julio","Cesar",1000f);
        Funcionario funcionario2 = new Funcionario("Lucas","Teixeira",1500f);
        System.out.println("Nome: "+funcionario1.getNome()+"\nSobrenome: "+funcionario1.getSobrenome()+"\nSalário anual R$ "+funcionario1.salarioAnual()+"\nSalário Anual com aumento de 10% R$ "+funcionario1.salarioAnualAumento());
        System.out.println("\nNome: "+funcionario2.getNome()+"\nSobrenome: "+funcionario2.getSobrenome()+"\nSalário anual R$ "+funcionario2.salarioAnual()+"\nSalário Anual com aumento de 10% R$ "+funcionario2.salarioAnualAumento());
    }
    
}
