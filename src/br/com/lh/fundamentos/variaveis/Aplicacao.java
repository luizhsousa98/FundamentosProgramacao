package br.com.lh.fundamentos.variaveis;

/**
 *
 *
 * 20/11/2018
 * 
 * @author lhsousa criando variaveis tipo javascript a partir do jdk 10 foi,
 *         diferen�a se crio um var e passo um valor, ele s� pode ser atribu�do
 *         ao mesmo tipo.
 */
public class Aplicacao {

	public static void main(String[] args) {

		// inteiro
		var x2 = 20;

		x2 = 1;

		// boleano true/false
		var x3 = true;

		// String
		var x4 = "Ol�";

		// char
		var x5 = 'A';
		
		//double
		var x6 = 3.5;

		System.out.println(x2);
		System.out.println(x3);
		System.out.println(x4);
		System.out.println(x5);
		System.out.println(x6);
	}

}
