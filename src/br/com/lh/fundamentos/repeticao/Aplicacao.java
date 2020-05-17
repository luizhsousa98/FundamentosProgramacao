package br.com.lh.fundamentos.repeticao;

/**
 * 
 * @author lhsousa
 * @Data: 14/12/2018
 * 
 *        Estrutura de condi��o repetitiva while
 */
public class Aplicacao {

	public static void main(String[] args) {

		/*
		 * repetir determinado bloco de c�digo enquanto for verdadeiro, quando for falso
		 * ela se encerra, obs: aos iniciantes cuidado ao colocar => ou <=, que na
		 * linguagem java se inicia do 0 no do n�mero 1, ele se encerra no 10 no c�digo
		 * abaixo, mas tem 11 posi��es(0 a 10).
		 */
		
		System.out.println("Loop 1");
		int x = 0;
		
		while (x <= 10) {
			System.out.println(x);
			// incrementador
			x++;
			
		}
		
		System.out.println("Loop 2");
		int y = 0;
		while (y < 10) {
			y++;

			// for�ando novo teste
			if (y == 5) {
				// No momento que o x chega ao cinco ele volta a condi��o do while
				continue;
			}

			System.out.println(y);
		}
		
		System.out.println("Loop 3");
		
		int z = 20;
		/// A condi��o do loop infinito com true
		while (true) {

			System.out.println(z);
			// Destornando loop em infinito
			if (z == 10) {
				// elimina o loop, sai fora do loop
				break;
			}
			//Decrementador
			z--;
		}
	}

}
