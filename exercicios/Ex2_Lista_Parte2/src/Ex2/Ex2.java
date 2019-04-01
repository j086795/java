
package Ex2;


public class Ex2 {


    public static void main(String[] args) {
        
        Item item1 = new Item(1349,"sapato",10,5.5f);
        System.out.println("Codigo do produto: "+item1.getCodigo()+"\nDescrição: "+item1.getDescricao()+
                           "\nQuantidade comprada: "+item1.getQuantidadeItem()+"\nPreço(R$): "+item1.getPrecoItem()+"\nTotal a pagar(R$): "+item1.getTotal());

            
    }
    
}
