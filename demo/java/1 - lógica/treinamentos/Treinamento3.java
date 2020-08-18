/**
 *Cuidado
 */
//declaração de classe publica
public class Treinamento3 {
	//metodo que será invocado ao chamar a classe
	public static void main(String[] args) {
		System.out.println("2 + 3 * 2 = " + 2 + 3 * 2);//resultará em 26
		System.out.println("2 + 3 * 2 = " + (2 + 3 * 2));//resultará em 8 (correto)
		System.out.println("Mod 5 = " + (5%2));//resultará em 1
		System.out.println("Mod 6 = " + (6%2));//resultará em 0

		System.out.println((6%2) == 0 ? "par" : "impar");//com o ternário descubro se o valor é par ou impar

		int x = 7;//declaração de um número inteiro
		System.out.println((x%2) == 0 ? "par" : "impar");//com o ternário descubro se o numero X é par ou impar

		int y = 10;
		if(y > 0) {
			System.out.println("0");
			if(y == 1) {
				System.out.println("1");
				if(y == 2) {
					System.out.println("2");	
				}
				if(y == 10) {
					System.out.println("10");	
				}
			}
		}
		//esses comandos combinados limpam a tela
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}
}
