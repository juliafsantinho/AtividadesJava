package br.com.generation.condicional;
	
/*EXERCICIO 01 - LA�O CONDICIONAL
 * JULIA SANTINHO DA FONSECA
 * 03/03/2022
 Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
*/

import java.util.Scanner;

public class Atividade01Condicional {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("Ol�, me diga tr�s n�meros que te direi qual � o maior!\n");
		
		System.out.println("Digite o primeiro n�mero: ");
		n1 = entrada.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		n2 = entrada.nextInt();
		
		System.out.println("Digite o terceiro n�mero: ");
		n3 = entrada.nextInt();
		
		
		  if((n1 > n2) && (n1 > n3)) {
			System.out.println("O primeiro n�mero, valor " + n1 + " � o de maior valor.");
		} else if ((n2 > n1) && (n2 > n3)) {
			System.out.println("O segundo n�mero, valor " + n2 + " � o de maior valor.");
		} else if ((n3 > n1) && (n3 > n2)) {
			System.out.println("O terceiro n�mero, valor " + n3 + " � o de maior valor.");
		} else {
			System.out.println("Os tr�s n�meros s�o iguais!");
		}
		
		
				
		entrada.close();
		
		

	}

}
