//importa o scanner de dados, para que este possa ser usado
import java.util.Scanner;

/*
 * Funcionamento do bloco 'do while'
 */
public class Exemplo2 {//declaração da classe
	
	public static void main(String[] args) {//declaração do método principal, o que será invocado ao executar a classe
		//inicia a variavel de leitura de entrada de escrita
		Scanner sc = new Scanner(System.in);
		//variável boolean inicializada com valor 'verdadeiro'
		boolean repetir = true;
		//escrevendo um texto
		System.out.println("Adivinhe... um numero de 1 a 10");
		//iniciando o bloco do while
		do {
			//escrevendo texto
			System.out.println("Digite seu numero:");
			//recolhendo uma resposta
			int numero = sc.nextInt();

			//testando se o número é diferente de 6
			if(numero != 6) {
				//caso seja diferente de 6, a variavel repetir recebe 'verdadeiro'
				repetir = true;
			} else {
				//caso não seja diferente de 6, a variavel repetir recebe 'falso'... e não executará o bloco outra vez
				repetir = false;
			}
			//outra maneira de atribuir 'verdadeiro' ou 'falso' para a variável repetir
			//repetir = numero != 6;
		} while(repetir);//enquanto precisa repetir a ordem, este bloco executa
		//escreve texto
		System.out.println("Finalmente!");		
		//fecha o scanner
		sc.close();
	}
}
