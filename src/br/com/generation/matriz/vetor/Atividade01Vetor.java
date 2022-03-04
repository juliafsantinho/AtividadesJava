package br.com.generation.matriz.vetor;

import java.util.Scanner;

/*
EXERCICIO 01 VETORES E MATRIZES
JULIA FONSECA
DATA: 04/03/2022
*/
//Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente.

public class Atividade01Vetor {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int[] valor = new int [5];
		int maiorValor = 0;
		
		System.out.println("Digite os valores das atividades");
			for(int i = 0; i <= 4; i++) {
				System.out.println("\nInsira o " + (i+1) + "� valor: ");
				valor[i] = entrada.nextInt();
					if(valor[i] > maiorValor) {
						maiorValor = valor[i];
					}
						System.out.println();			
			}
			for(int i = 0; i <= 4; i++) {
				System.out.print(valor[i] + " | ");
			}
			
			System.out.println("\n\nSeu maior valor em atividades foi: " + maiorValor);
			
			entrada.close();
	}

}
