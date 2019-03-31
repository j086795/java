
package parte1_while;

import java.util.Scanner;

public class Parte1_while {


    public static void main(String[] args) {
        
        int idade;
        int soma=0;
        float media=0f;
        int i;
        
        Scanner input = new Scanner(System.in);
        
        for (i = 1;i <=10;i++){
            
            System.out.println("Digite a idade");
            idade = input.nextInt();
            soma += idade;
        
        }
        media = soma/10;
        
        System.out.println("A média das idades é "+media);

    }
    
}
