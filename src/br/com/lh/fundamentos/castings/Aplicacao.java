package br.com.lh.fundamentos.castings;

/**
 * 
 * @author lhsousa Convers�o de um tipo para o outro
 * 
 * 03/12/2018
 *
 */
public class Aplicacao {

	public static void main(String[] args) {

		// casting impl�cito ocorre diretamente um tipo maior atribui o menor

		long l = 1;

		float y;

		// Casting expl�cito um tipo menor atribui a convers�o do maior
		float x = (float) 40.0;

		// dica utilizar se tiver certeza que realmente caiba na vari�vel de destino

		System.out.println(x);

	}

}
