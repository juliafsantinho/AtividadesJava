package br.com.generation.repeticao;

import java.util.Scanner;

/*EXERCICIO 05 - LA�O DE REPETI��O
 * JULIA SANTINHO DA FONSECA
 * 04/03/2022
Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. No final, mostre a soma dos n�meros digitados.(DO...WHILE)
*/

public class Atividade05Repeticao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero, soma = 0;
			 
				
		do {
			System.out.println("Digite os n�meros: ");
			numero = entrada.nextInt();
			
			System.out.printf("%d", numero);

			soma += numero;
		} 
			while(numero != 0);
		
		
		System.out.printf("\nA soma �: %d" , soma);
					
				
		
		entrada.close();
		
	}
																		//CORRIGIR
}
