
package parte1;

import java.util.Scanner;


public class Parte1 {


    public static void main(String[] args) {
        
        String nome;
        float salario;
        float totalVendas;
        float totalReceber;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome do vendedor");
        nome = input.nextLine();
        System.out.println("Digite o salario fixo");
        salario = input.nextFloat();
        System.out.println("Digite o total de vendas do mes");
        totalVendas = input.nextFloat();
        
        totalReceber = (salario + (totalVendas*0.15f));
        System.out.println("O funcionário " +nome+ " com salário mensal de R$ "+salario+" receberá um total de R$ "+totalReceber);

    }
    
}
