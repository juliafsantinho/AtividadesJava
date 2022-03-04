package br.com.generation.repeticao;

/*EXERCICIO 02 - LAÇO DE REPETIÇÃO
 * JULIA SANTINHO DA FONSECA
 * 04/03/2022
 Ler 10 números e imprimir quantos são pares e quantos são ímpares.
*/

import java.util.Scanner;

public class Atividade02Repeticao {

	public static void main(String[] args) {
		
		  Scanner entrada = new Scanner(System.in);
	        int numero, par = 0, impar = 0;
	        
	        for(int i = 1; i <= 10; i++){
	            System.out.println("Digite o " + i + "º número");
	            numero = entrada.nextInt();
	            		
	            		// para informar números pares
	            if(numero % 2 == 0){
	                par++;
	            }

	            		// para informar números ímpares
	             if(numero % 2 == 1){
	              impar++;
	            }
	            
	        }
	        
	        System.out.println("Foram digitados " + par + " números pares. \n");
	        System.out.println("Foram digitados " + impar + " números ímpares.");
		
		entrada.close();
	}

}
