package br.com.generation.condicional;

/*EXERCICIO 04 - LA�O CONDICIONAL
 * JULIA SANTINHO DA FONSECA
 * 03/03/2022
 Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.
*/

import java.util.Scanner;

public class Atividade04Condicional {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int n; 
		
		System.out.println("Nos diga um n�mero qualquer, se o mesmo for par iremos fazer a raiz quadrada dele. Caso o n�mero for �mpar iremos elevar o mesmo ao quadrado.");
		System.out.println("Digite um n�mero: ");
		n = entrada.nextInt();
		
		if (n % 2 == 0) {
				System.out.println("O n�mero " + n + " � par!" + "\nA raiz quadrada dele �: " + Math.sqrt(n));
		} else {
				
				System.out.println("O n�mero " + n + " � �mpar!" + "\nElevando ele ao quadrado, fica: " + Math.pow(n, 2));
		}
			
					
		
		entrada.close();

	}

}
