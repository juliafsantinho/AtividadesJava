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
		int maiorValor = 0, soma = 0, quantidadeMaiorResultado = 0;
		double media = 0;
				
			System.out.println("Os n�meros que sa�ram nos dados foram: ");
			
			for(int i =0; i < 9; i++) {
				System.out.println("Digite o " + (i+1)+ "� resultado do dado: ");
				valor[i] = entrada.nextInt();
					if (maiorValor < valor[i]) {
						maiorValor = valor[i];
					}
			}
			
			for(int i = 0; i <= 9; i++) {
				System.out.print(valor[i] + " | ");
				soma+=valor[i];
					if(maiorValor == valor[i]) {
						quantidadeMaiorResultado += 1;
					}
			
			}
			
			media=soma/10;
			
			System.out.println("A maior pontua��o foi: " + maiorValor);
			System.out.println("A quantidade de vezes que ela foi atingida: " + quantidadeMaiorResultado);
			System.out.println("A m�dia dos resultados foi de: " + media);
			
				
		
			entrada.close();
	}

}
