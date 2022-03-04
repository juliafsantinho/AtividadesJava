package br.com.generation.repeticao;

/*EXERCICIO 02 - LA�O DE REPETI��O
 * JULIA SANTINHO DA FONSECA
 * 04/03/2022
 Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares.
*/

import java.util.Scanner;

public class Atividade02Repeticao {

	public static void main(String[] args) {
		
		  Scanner entrada = new Scanner(System.in);
	        int numero, par = 0, impar = 0;
	        
	        for(int i = 1; i <= 10; i++){
	            System.out.println("Digite o " + i + "� n�mero");
	            numero = entrada.nextInt();
	            		
	            		// para informar n�meros pares
	            if(numero % 2 == 0){
	                par++;
	            }

	            		// para informar n�meros �mpares
	             if(numero % 2 == 1){
	              impar++;
	            }
	            
	        }
	        
	        System.out.println("Foram digitados " + par + " n�meros pares. \n");
	        System.out.println("Foram digitados " + impar + " n�meros �mpares.");
		
		entrada.close();
	}

}
