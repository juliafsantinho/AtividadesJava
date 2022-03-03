package br.com.generation.condicional;
	
/*EXERCICIO 01 - LAÇO CONDICIONAL
 * JULIA SANTINHO DA FONSECA
 * 03/03/2022
 Faça um programa que receba três inteiros e diga qual deles é o maior.
*/

import java.util.Scanner;

public class Atividade01Condicional {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("Olá, me diga três números que te direi qual é o maior!\n");
		
		System.out.println("Digite o primeiro número: ");
		n1 = entrada.nextInt();
		
		System.out.println("Digite o segundo número: ");
		n2 = entrada.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		n3 = entrada.nextInt();
		
		
		  if((n1 > n2) && (n1 > n3)) {
			System.out.println("O primeiro número, valor " + n1 + " é o de maior valor.");
		} else if ((n2 > n1) && (n2 > n3)) {
			System.out.println("O segundo número, valor " + n2 + " é o de maior valor.");
		} else if ((n3 > n1) && (n3 > n2)) {
			System.out.println("O terceiro número, valor " + n3 + " é o de maior valor.");
		} else {
			System.out.println("Os três números são iguais!");
		}
		
		
				
		entrada.close();
		
		

	}

}
