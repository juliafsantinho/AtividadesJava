package br.com.generation.matriz.vetor;

import java.util.Scanner;

/*
EXERCICIO 02 VETORES E MATRIZES
JULIA FONSECA
DATA: 04/03/2022
*/
//Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m quantas foram as ocorr�ncias da maior pontua��o.

public class Atividade02Vetor {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int[] valor = new int [10];
		int maiorValor = 0, media = 0, soma = 0, quantidadeMaiorResultado = 0;
		
		valor[0]= 1;
		valor[1]= 8;
		valor[2]= 3;
		valor[3]= 9;
		valor[4]= 5;
		valor[5]= 6;
		valor[6]= 3;
		valor[7]= 0;
		valor[8]= 5;
		valor[9]= 6;
		
			System.out.println("Os n�meros que sa�ram nos dados foram: ");
			
			for(int i = 0; i <= 9; i++) {
				System.out.print(valor[i] + " | ");
				soma += valor[i];
				media = soma / 10;
					if(valor[i] > maiorValor) {
						maiorValor = valor[i];
					}
					
					soma+=valor[i];
				
			for(i = 0; i <= 9; i++) {
					if(maiorValor == valor[i]) {
						quantidadeMaiorResultado += 1;
					}
			}
			
			System.out.println("\nA m�dia dos valores do dado � de: " + media + ".\nJ� o maior valor retirado no dado foi o n�mero: " + maiorValor);
			System.out.println("\nA quantidade de vezes que ela foi atingida foi " + quantidadeMaiorResultado);
			
			}
				
		
			entrada.close();
	}

}
