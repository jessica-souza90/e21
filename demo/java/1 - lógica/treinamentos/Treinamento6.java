import java.util.Scanner;

/**
 * Treinamento de seleção/teste
 */
public class Treinamento6 {
	public static void main(String[] args) {
		//'if' 'else if' 'else'
		int valor = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Escreva um valor inteiro:");
		valor = sc.nextInt();

		//errado
		/*
		if(valor == 1) {//faco algo que demora
			System.out.println("Numero um");
		}
		if(valor == 2) {//faco algo que demora
			System.out.println("Numero dois");
		}
		if(valor == 3) {//faco algo que demora
			System.out.println("Numero tres");
		}
		else {
			System.out.println("qualquer numero");
		}
		*/

		//certo
		//caso 1
		if(valor == 1) {//faz um teste
			System.out.println("Numero um");
		} else if (valor == 2) {//se não caio em nenhu teste até o momento, faz um teste
			System.out.println("Numero dois");
		} else if (valor == 3) {//se não caio em nenhu teste até o momento, faz um teste
			System.out.println("Numero tres");
		} else if (valor == 4) {//se não caio em nenhu teste até o momento, faz um teste
			System.out.println("Numero quatro");
		} else if (valor == 5) {//se não caio em nenhu teste até o momento, faz um teste
			System.out.println("Numero cinco");
		} else {//executa se não cair em nenhum teste
			System.out.println("qualquer numero");
		}
		//vou pra cá

	}
}
