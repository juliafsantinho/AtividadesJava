package br.com.generation.condicional;

/*EXERCICIO 02 - LA�O CONDICIONAL
 * JULIA SANTINHO DA FONSECA
 * 03/03/2022
 Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
*/

import java.util.Scanner;

public class Atividade02Condicional {

	public static void main(String[] args) {
					
			Scanner entrada = new Scanner(System.in);			
	       
	        int a, b, c;
	        
	        System.out.println("Ol�, me diga tr�s n�meros que te direi em ordem crescente\n");
	        
	        System.out.println("Digite o primeiro n�mero: ");
			a = entrada.nextInt();
			
			System.out.println("Digite o segundo n�mero: ");
			b = entrada.nextInt(); 
			
			System.out.println("Digite o terceiro n�mero: ");
			c = entrada.nextInt();
	                 
			if(a < b) {
				if(b < c) {
					System.out.println(a + ", " + b + ", " + c);
				} else if (a < c) {
					System.out.println(a + ", " + c + ", " + b);
				} else {
					System.out.println(c + ", " + a + ", " + b);
				}
			} else if (b < c) {
				if(a < c) {
					System.out.println(b + ", " + a + ", " + c);
				} else {
					System.out.println(b + ", " + c + ", " + a);
				}
				
			} else {
				    System.out.println(c + ", " + b + ", " + a);
			}

					        
	        
	        entrada.close();
	}

}
