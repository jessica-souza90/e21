//importa o scanner de dados, para que este possa ser usado
import java.util.Scanner;

/*
 * Funcionamento do bloco de seleção ('if', 'else if' e 'else') e do bloco 'switch case'
 */
public class Exemplo1 {//declaração da classe
	
	public static void main(String[] args) {//declaração do método principal, o que será invocado ao executar a classe
		//inicia a variavel de leitura de entrada de escrita
		Scanner sc = new Scanner(System.in);
		//escreve com quebra de linha 'ln'
		System.out.println("Qual é seu gênero?");
		//faz a leitura de uma entrada do teclado, do tipo texto
		String genero = sc.next();

		//para comparar numeros você usa a operação.. 1 == 1
		//para comparar string você usa a função.. .equals() ou .equalsIgnoreCase()
		//bloco de condição 1
		if(genero.equalsIgnoreCase("M")) {//teste se o valor de gênero é igual 'equalsIgnoreCase' a 'M',
		//ou seja se o usuário escrever a letra 'M' maiusculo ou minusculo, vai entrar nesta condição
			System.out.println("Bem vindo");
		} else if (genero.equalsIgnoreCase("F")) {//teste se o valor de gênero é igual 'equalsIgnoreCase' a 'F'
			System.out.println("Bem vinda");
		} else {//caso não seja nenhuma das alternativas anteriores execute 
			System.out.println("Bem vindx");
		}

		//bloco de condição 2
		switch (genero.toUpperCase()) {//a função .toUpperCase() torna o valor de gênero maiusculo, ou seja ...independente do genero ser escrito em maiusculo ou minusculo, será enterpretado como maiusculo
			case "M"://se for 'M' maiusculo, faça:
				System.out.println("Bem vindo");
				break;//pare, não execute o próximo bloco
			case "F"://se for 'F' maiusculo, faça:
				System.out.println("Bem vinda");
				break;//pare, não execute o próximo bloco
			default://qualquer coisa que o usuário escreva que seja diferente de 'M' ou 'F', entra nessa condição:
				System.out.println("Bem vindx");
				break;//pare
		}

		//O BLOCO DE CONDIÇÃO 1 REPRESENTA A MESMA LÓGICA DO BLOCO DE CONDIÇÃO 2, A DIFERENÇA É QUE
		//O IF USAREMOS PARA TESTAR CONDIÇÕES COMPLEXAS, SIMPLESMENTE QUALQUER CONDIÇÃO
		//O SWITCH PARA CONDIÇÕES SIMPLES QUANDO QUEREMOS COMPARAR A MESMA VARIÁVEL EM CONDIÇÕES DIFERENTES

		//fecha o scanner pra não alocar recurso
		sc.close();
	}
}
