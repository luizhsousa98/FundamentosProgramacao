package br.com.lh.fundamentos.estruturaDecisao;

/**
 * 
 * @author lhsousa: Estrutura condicional
 * 
 *         Condições lógicas != : diferença: x != 0 == : igualdade || : ou pode
 *         ser sim ou não.
 * 
 * 
 * @data: 12/12/2018
 */
public class Aplicacao {

	public enum Dias {
		DOMINGO, SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO
	}

	public static void main(String[] args) {

		int x = 0;

		if (x == 1) {
			System.out.println("Verdadeiro, o valor de x é igual a: " + x);
		} else if (x > 1) {
			System.out.println("Verdadeiro, o valor de x é maior que 1: " + x);
		} else if (x < 0) {
			System.out.println("Verdadeiro, o valor de x é negativo: " + x);
		} else {
			System.out.println("Verdadeiro, o valor de x é igual a 0: " + x);
		}

		/**
		 * @author lhsousa: Switch semelhante ao else if porém limitado, só suporta no
		 *         switch inteiros, enums e chars
		 */
		int dias = 3;

		switch (dias) {

		case 1:
			System.out.println("Hoje é: " + Dias.DOMINGO);
			break;
		case 2:
			System.out.println("Hoje é: " + Dias.SEGUNDA);
			break;
		case 3:
			System.out.println("Hoje é: " + Dias.TERCA);
			break;
		case 4:
			System.out.println("Hoje é: " + Dias.QUARTA);
			break;
		case 5:
			System.out.println("Hoje é: " + Dias.QUINTA);
			break;
		case 6:
			System.out.println("Hoje é: " + Dias.SEXTA);
			break;
		case 7:
			System.out.println("Hoje é: " + Dias.SABADO);
			break;

		// Default é um else do switch e case um monte de ifs
		default:
			System.out.println("Nenhum dos dias acima");
			break;
		}
		
		/**
		 * Condição ternária igual um if else
		 */
		int resultado;
		int a = 2;
		
		//Se "a" for menor que 3, me retorna 0 se for menor retorna 1
		resultado = a < 3 ? 0 : 1;
		
		System.out.println(resultado);

	}

}
