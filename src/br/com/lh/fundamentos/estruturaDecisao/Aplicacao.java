package br.com.lh.fundamentos.estruturaDecisao;

/**
 * 
 * @author lhsousa: Estrutura condicional
 * 
 *         Condi��es l�gicas != : diferen�a: x != 0 == : igualdade || : ou pode
 *         ser sim ou n�o.
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
			System.out.println("Verdadeiro, o valor de x � igual a: " + x);
		} else if (x > 1) {
			System.out.println("Verdadeiro, o valor de x � maior que 1: " + x);
		} else if (x < 0) {
			System.out.println("Verdadeiro, o valor de x � negativo: " + x);
		} else {
			System.out.println("Verdadeiro, o valor de x � igual a 0: " + x);
		}

		/**
		 * @author lhsousa: Switch semelhante ao else if por�m limitado, s� suporta no
		 *         switch inteiros, enums e chars
		 */
		int dias = 3;

		switch (dias) {

		case 1:
			System.out.println("Hoje �: " + Dias.DOMINGO);
			break;
		case 2:
			System.out.println("Hoje �: " + Dias.SEGUNDA);
			break;
		case 3:
			System.out.println("Hoje �: " + Dias.TERCA);
			break;
		case 4:
			System.out.println("Hoje �: " + Dias.QUARTA);
			break;
		case 5:
			System.out.println("Hoje �: " + Dias.QUINTA);
			break;
		case 6:
			System.out.println("Hoje �: " + Dias.SEXTA);
			break;
		case 7:
			System.out.println("Hoje �: " + Dias.SABADO);
			break;

		// Default � um else do switch e case um monte de ifs
		default:
			System.out.println("Nenhum dos dias acima");
			break;
		}
		
		/**
		 * Condi��o tern�ria igual um if else
		 */
		int resultado;
		int a = 2;
		
		//Se "a" for menor que 3, me retorna 0 se for menor retorna 1
		resultado = a < 3 ? 0 : 1;
		
		System.out.println(resultado);

	}

}
