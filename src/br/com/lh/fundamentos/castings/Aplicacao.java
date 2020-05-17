package br.com.lh.fundamentos.castings;

/**
 * 
 * @author lhsousa Conversão de um tipo para o outro
 * 
 * 03/12/2018
 *
 */
public class Aplicacao {

	public static void main(String[] args) {

		// casting implícito ocorre diretamente um tipo maior atribui o menor

		long l = 1;

		float y;

		// Casting explícito um tipo menor atribui a conversão do maior
		float x = (float) 40.0;

		// dica utilizar se tiver certeza que realmente caiba na variável de destino

		System.out.println(x);

	}

}
