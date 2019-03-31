
package parte1_while_2;

import java.util.Scanner;

public class Parte1_while_2 {


    public static void main(String[] args) {
        
        float preco;
        float lucro;
        float precoFinal;
        int i;
        
        Scanner input = new Scanner(System.in);
        
        for (i = 1;i <=20;i++){
            
            System.out.println("\nDigite o preço de custo do produto");
            preco = input.nextFloat();
            
            if(preco<100){
                
                lucro = 20;
                
            }else{
                
                lucro = 50;
            }
            
            precoFinal = lucro+preco;
            
            System.out.println("Preço de custo: R$ "+ preco +" \nLucro: R$ "+ lucro +"\nPreço final: R$ "+precoFinal);

        }

    }
    
}
