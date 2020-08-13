//importa o scanner de dados, para que este possa ser usado
import java.util.Scanner;

/*
 * Funcionamento de operação ternário, S/N ... 1/0
 */
public class Exemplo1 {//declaração da classe
	
	public static void main(String[] args) {//declaração do método principal, o que será invocado ao executar a classe
		//inicia a variavel de leitura de entrada de escrita
		Scanner sc = new Scanner(System.in);
		//escreve com quebra de linha 'ln'
		System.out.println("Oi, tudo bem? S/N");
		//pega texto escrito pelo usuário
		String resposta = sc.next();

		//texto que recebe um valor conforme a operação ternária
		String textoExibicao = resposta.equalsIgnoreCase("S") ? "fico feliz por vc" : "espero que melhore";
		//String textoExibicao = resposta.equalsIgnoreCase("S") ? "fico feliz por vc" : resposta.equalsIgnoreCase("N") ? "espero que melhore" : "vc digitou errado hehe";

		//escreve o resultado da operação ternária
		System.out.println(textoExibicao);
		//fecha o scanner
		sc.close();
	}
}
