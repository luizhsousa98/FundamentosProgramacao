package br.com.lh.fundamentos.repeticao;

public class Aplicacao2 {

	public static void main(String[] args) {

		int x = 0;

		// Primeiro executa tudo, depois repete
		do {
			System.out.println(x);
			x++;
		} while (x <= 10);

	}

}
