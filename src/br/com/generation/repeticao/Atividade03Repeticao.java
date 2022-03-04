package br.com.generation.repeticao;

import java.util.Scanner;

/*EXERCICIO 03 - LA�O DE REPETI��O
 * JULIA SANTINHO DA FONSECA
 * 04/03/2022
 Solicitar a idade de v�rias pessoas e imprimir: Total de pessoas com menos de 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99.
*/

public class Atividade03Repeticao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int idade = 0, cont21 = 0, cont50 = 0;
		
		
			while(idade != -99) {
				
					System.out.println("Digite as idades (S� ir� finalizar quando a idade for -99): ");
					idade = entrada.nextInt();
					if (idade < 21 && idade > 0) {
						cont21++;
					} else if (idade > 50) {
						cont50++;
				}
			}
			
		System.out.println("O total de pessoas com menos de 21 anos �: " + cont21);
		System.out.println("O total de pessoas com mais de 50 anos �: " + cont50);
		
		entrada.close();
	}

}
