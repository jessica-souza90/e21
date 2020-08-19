import java.util.Scanner;

/**
 * Treinamento 4
 * Convenção Java, declaração de variáveis
 */
public class VisualizarProduto {
	public static void main(String[] args) {
        //certo
        String nomeProduto = "";
        Double precoProduto = 0.0;
        int quantidadeProduto = 0;

        //errado
        /*String nomeProduto;
        Double precoProduto;
        int quantidadeProduto;*/

        /*
        int vaiDarErro;
        if(1 == 2){
            vaiDarErro = 1;
        }
		System.out.println(vaiDarErro);
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("Deseja informar o produto da vitrine? S/N");
        String cadastrarProduto = sc.next();

        //maneira  errada
        //Double valorTotalEstoque;
        if(cadastrarProduto.equalsIgnoreCase("S")) {
            System.out.println("Escreva o nome do produto:");
            nomeProduto = sc.next();
            System.out.println("Escreva o preco do produto:");
            precoProduto = sc.nextDouble();
            System.out.println("Escreva a quantidade do produto:");
            quantidadeProduto = sc.nextInt();

            Double valorTotalEstoque = quantidadeProduto * precoProduto;

            System.out.println("Produto: " + nomeProduto);
            System.out.println("Valor: " + precoProduto);
            System.out.println("quantidade em estoque: " + quantidadeProduto);
            System.out.println("valor total em estoque: " + valorTotalEstoque);
        }
        //daria erro
        //System.out.println("valor total em estoque: " + valorTotalEstoque);

        
        
	}
}
