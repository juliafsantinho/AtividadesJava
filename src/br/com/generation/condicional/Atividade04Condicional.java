package br.com.generation.condicional;

/*EXERCICIO 04 - LAÇO CONDICIONAL
 * JULIA SANTINHO DA FONSECA
 * 03/03/2022
 Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.
*/

import java.util.Scanner;

public class Atividade04Condicional {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int n; 
		
		System.out.println("Nos diga um número qualquer, se o mesmo for par iremos fazer a raiz quadrada dele. Caso o número for ímpar iremos elevar o mesmo ao quadrado.");
		System.out.println("Digite um número: ");
		n = entrada.nextInt();
		
		if (n % 2 == 0) {
				System.out.println("O número " + n + " é par!" + "\nA raiz quadrada dele é: " + Math.sqrt(n));
		} else {
				
				System.out.println("O número " + n + " é ímpar!" + "\nElevando ele ao quadrado, fica: " + Math.pow(n, 2));
		}
			
					
		
		entrada.close();

	}

}
