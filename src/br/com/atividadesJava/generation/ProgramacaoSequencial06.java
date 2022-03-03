package br.com.atividadesJava.generation;

/*
EXERCICIO 06 - PROGRAMAÇÃO SEQUENCIAL
JULIA FONSECA
DATA: 25/02/2022
*/
// Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula que efetua tal cálculo da lista.

import java.util.Scanner;

public class ProgramacaoSequencial06 {

	public static void main(String[] args) {
		
		
		double x1, x2, y1, y2, d, x, y;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe a localização do ponto 1 (x,y): ");
		System.out.println("\nX1 = ");
		x1 = leia.nextDouble();
		System.out.println("Y1 = ");
		y1 = leia.nextDouble();
		System.out.println("\n");
		System.out.println("Informe a localização do ponto 2 (x,y): ");
		System.out.println("\nX2 = ");
		x2 = leia.nextDouble();
		System.out.println("Y2 = ");
		y2 = leia.nextDouble();
		
		x = Math.pow(x2-x1, 2);
		y = Math.pow(y2-y1, 2);
		
		d = Math.sqrt((x+y));
		
		System.out.println("A distância entre os pontos é: " + d);
		
		leia.close();
		
		
		
		
	}

}
