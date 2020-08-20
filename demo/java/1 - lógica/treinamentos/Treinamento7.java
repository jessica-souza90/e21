import java.util.Scanner;

/**
 * Treinamento de seleção/teste
 */
public class Treinamento7 {
	public static void main(String[] args) {
		//'if' 'else if' 'else'
		int valor1 = 0;
		int valor2 = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Escreva um valor inteiro:");
		valor1 = sc.nextInt();

		System.out.println("Escreva outro valor inteiro:");
		valor2 = sc.nextInt();

		if(valor1 == 1 && valor2 == 1) {//&& liga testes, ou seja (teste1 && teste2),
		//ambos os teste são verdadeiros, true && true,
		//para executar esse conteudo
			System.out.println("Valor 1 com numero um");
			System.out.println("Valor 2 com numero um");
		} else {//caso o teste acima seja falso, executa esse conteudo
			System.out.println("Valor 1 e Valor 2 com qualquer numero, ou apenas com um dos testes verdadeiros");
		}
		
		if(valor1 == 1 || valor2 == 1) {//|| liga testes, ou seja (teste1 || teste2),
		//um dos teste deve ser verdadeiro, false || true,
		//para executar esse conteudo
			System.out.println("Valor 1 ou Valor 2 com numero um");
		} else {//caso o teste acima seja falso, executa esse conteudo
			System.out.println("Valor 1 ou Valor 2 com qualquer numero");
		}

		//true && true = true
		//false && true = false
		//true && false = false
		//false && false = false
		
		//true || true = true
		//false || true = true
		//true || false = true
		//false || false = false

		//ctrl + shift + p
		//para ver todos os comandos do visual studio code
	}
}
