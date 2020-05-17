package br.com.lh.fundamentos.repeticao;

public class Aplicacao3 {

	public static void main(String[] args) {
		
		//Ela é finita
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		
		System.out.println();
		System.out.println("Matrizes realizando uma tabuada");
		
		int x;
		for (int col = 1; col <= 10; col++) {
			for (int lin = 0; lin <= 10; lin++) {
				x = col * lin;
				System.out.println();
				System.out.println(col + "x" + lin + " = " + x);
			}
		}
	}

}
