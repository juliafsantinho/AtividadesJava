package br.com.atividadesJava.generation;

/*
EXERCICIO 07 - PROGRAMA��O SEQUENCIAL
JULIA FONSECA
DATA: 25/02/2022
*/
//Um sistema de equa��es lineares, conforme o exemplo, pode ser resolvido. Escreva um sistema que l� os coeficientes a,b,c,d,e e f e calcula e mostra os valores de x e y.

import java.util.Scanner;

public class ProgramacaoSequencial07 {

	public static void main(String[] args) {
		

		double a, b, c, d, e, f, x, y;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe o valor de A: ");
		a = leia.nextDouble();
		
		System.out.println("Informe o valor de B: ");
		b = leia.nextDouble();
		
		System.out.println("Informe o valor de C: ");
		c = leia.nextDouble();
		
		System.out.println("Informe o valor de D: ");
		d = leia.nextDouble();
		
		System.out.println("Informe o valor de E: ");
		e = leia.nextDouble();
		
		System.out.println("Informe o valor de F: ");
		f = leia.nextDouble();
		
		x = ((c*e) - (b*f) / (a*e) - (b*d));
		y = ((a*f) - (c*d) / (a*e) - (b*d));
		
		System.out.println("X = " + x + " e Y = " + y);
		
		leia.close();
		
	}

}
