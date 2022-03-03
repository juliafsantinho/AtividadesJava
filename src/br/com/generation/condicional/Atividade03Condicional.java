package br.com.generation.condicional;

/*EXERCICIO 03 - LA�O CONDICIONAL
 * JULIA SANTINHO DA FONSECA
 * 03/03/2022
 Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual categoria ela se encontra:
 	* 10-14 infantil
 	* 15-17 juvenil
 	* 18-25 adulto
*/

import java.util.Scanner;

public class Atividade03Condicional {

	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
		
		int idade;
		
		
		System.out.println("Digite sua idade: ");
		idade = entrada.nextInt();
		
		
		if ((idade >= 10) && (idade <= 14)) {
			System.out.println("Voc� tem " + idade + " anos, est� classificado na categoria infantil!");
		} else if ((idade >= 15) && (idade <= 17)) {
			System.out.println("Voc� tem " + idade + " anos, est� classificado na categoria juvenil!");
		} else if ((idade >= 18) && (idade <= 25)) {
			System.out.println("Voc� tem " + idade + " anos, est� classificado na categoria adulto!");
		} else if ((idade <= 9) || (idade >= 26)) {
			System.out.println("Desculpe, voc� n�o se classifica em nenhuma das categorias!");
		}
			
		
	entrada.close();
		
	}

}
