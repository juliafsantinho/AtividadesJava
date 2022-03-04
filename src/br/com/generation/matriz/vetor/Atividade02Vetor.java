package br.com.generation.matriz.vetor;

import java.util.Scanner;

/*
EXERCICIO 02 VETORES E MATRIZES
JULIA FONSECA
DATA: 04/03/2022
*/
//Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e imprima a média aritmética dos lançamentos, contabilize e apresente também quantas foram as ocorrências da maior pontuação.

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
		
			System.out.println("Os números que saíram nos dados foram: ");
			
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
			
			System.out.println("\nA média dos valores do dado é de: " + media + ".\nJá o maior valor retirado no dado foi o número: " + maiorValor);
			System.out.println("\nA quantidade de vezes que ela foi atingida foi " + quantidadeMaiorResultado);
			
			}
				
		
			entrada.close();
	}

}
