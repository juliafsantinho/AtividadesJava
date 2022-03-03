package br.com.atividadesJava.generation;

/*
EXERCICIO 04 - PROGRAMAÇÃO SEQUENCIAL
JULIA FONSECA
DATA: 25/02/2022
*/
// Escreva um sistema que leia três números inteiros e positivos (A, B, C) e calcule a expressão em que a lista mostra.

import java.util.Scanner;

public class ProgramacaoSequencial04 {

	
	public static void main(String[] args) {
		
		double d, r, s;
		int a, b, c;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o A: ");
		a = leia.nextInt();
		
		System.out.println("Digite o B: ");
		b = leia.nextInt();
		
		System.out.println("Digite o C: ");
		c = leia.nextInt();
		
		r = Math.pow((a+b), 2);
		s = Math.pow((b+c), 2);
		d = (r+s) / 2;
		
		System.out.println("A resposta de D é: " + d);
		
		leia.close();	

		
		
	}

}
