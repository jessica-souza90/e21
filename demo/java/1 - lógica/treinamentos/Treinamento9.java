import java.util.Scanner;

/**
 * Treinamento de seleção/teste
 */
public class Treinamento9 {
	public static void main(String[] args) {
		//'if' 'else if' 'else'
		int valor1 = 0;
		int valor2 = 0;
		int valor3 = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Escreva o primeiro valor inteiro:");
		valor1 = sc.nextInt();//1

		System.out.println("Escreva o segundo valor inteiro:");
		valor2 = sc.nextInt();//2

		System.out.println("Escreva o terceiro valor inteiro:");
		valor3 = sc.nextInt();//3

		if(valor1 == 1 && valor2 == 2) {//&& liga testes, ou seja (teste1 && teste2),
		//ambos os teste são verdadeiros, true && true,
		//para executar esse conteudo
			System.out.println("Valor 1 com numero um e Valor 2 com numero dois");	
		} else if (valor3 == 3) {
			System.out.println("Valor 3 com numero três");
		} else {//caso o teste acima seja falso, executa esse conteudo
			System.out.println("Nenhum teste do bloco e verdadeiro");
		}
		
		if(valor1 == 1 || valor2 == 2) {//|| liga testes, ou seja (teste1 || teste2),
		//um dos teste deve ser verdadeiro, false || true,
		//para executar esse conteudo
			System.out.println("Valor 1 com numero um ou Valor 2 com numero dois");
		} else if (valor3 == 3) {
			System.out.println("Valor 3 com numero tres");
		} else {//caso o teste acima seja falso, executa esse conteudo
			System.out.println("Nenhum teste do bloco e verdadeiro");
		}
		//pegue o nome de 3 pessoas
		//com idade
		//endereço


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
