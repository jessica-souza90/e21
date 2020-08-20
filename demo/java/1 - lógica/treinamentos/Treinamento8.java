import java.util.Scanner;

/**
 * Treinamento de seleção/teste
 */
public class Treinamento8 {
	public static void main(String[] args) {
		//'if' 'else if' 'else'
		int valor1 = 0;
		int valor2 = 0;
		int valor3 = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Escreva o primeiro valor inteiro:");
		valor1 = sc.nextInt();

		System.out.println("Escreva o segundo valor inteiro:");
		valor2 = sc.nextInt();

		System.out.println("Escreva o terceiro valor inteiro:");
		valor3 = sc.nextInt();

		if(valor1 == 1 && valor2 == 1 && valor3 == 1) {//&& liga testes, ou seja (teste1 && teste2),
		//ambos os teste são verdadeiros, true && true,
		//para executar esse conteudo
			System.out.println("Valor 1 com numero um");
			System.out.println("Valor 2 com numero um");
			System.out.println("Valor 3 com numero um");
		} else {//caso o teste acima seja falso, executa esse conteudo
			System.out.println("Valor 1, Valor 2 e Valor 3 com qualquer numero, ou apenas com um dos testes verdadeiros");
		}
		
		if(valor1 == 1 || valor2 == 1 || valor3 == 1) {//|| liga testes, ou seja (teste1 || teste2),
		//um dos teste deve ser verdadeiro, false || true,
		//para executar esse conteudo
			System.out.println("Valor 1 ou Valor 2 ou Valor 3 com numero um");
		} else {//caso o teste acima seja falso, executa esse conteudo
			System.out.println("Valor 1 ou Valor 2 ou Valor 3 com qualquer numero");
		}

		//2 testes por bloco
		//true && true = true
		//false && true = false
		//true && false = false
		//false && false = false
		
		//true || true = true
		//false || true = true
		//true || false = true
		//false || false = false

		//3 ou mais testes por bloco
		//true && true && true = true
		//false && true && true = false
		//true && false && false = false
		//false && false && false = false
		
		//true || true || true = true
		//false || true || true = true
		//true || false || true = true
		//false || false || false = false
	}
}
