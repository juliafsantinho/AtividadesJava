package br.com.generation.repeticao;

/*EXERCICIO 01 - LAÇO DE REPETIÇÃO
 * JULIA SANTINHO DA FONSECA
 * 04/03/2022
 Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5.
*/

public class Atividade01Repeticao {

	public static void main(String[] args) {
		
		for(int i = 1000; i < 2000; i++) {
		    if (i % 11==5) {
		        System.out.println(i);
		    }
		}
	}

}
