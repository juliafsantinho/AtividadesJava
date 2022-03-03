package br.com.atividadesJava.generation;

/*
EXERCICIO 02 - PROGRAMAÇÃO SEQUENCIAL
JULIA FONSECA
DATA: 25/02/2022
*/
// Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias.

import java.util.Scanner;

public class ProgramacaoSequencial02 {

	public static void main(String[] args) {
		
		int d, m, a;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Escreva sua idade em dias: ");
		d = leia.nextInt();
		
		a = d / 365;
		d = 365 * a;
		m = d / 30;
				
		
		System.out.println("Sua idade em anos é: " + a + " anos!\n");
		System.out.println("Sua idade em meses é: " + m + " meses!\n");
		System.out.println("Sua idade em dias é: " + d + " dias!\n");
		
		
		leia.close();
		

	}

}
