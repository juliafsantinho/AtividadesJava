package br.com.atividadesJava.generation;

/*
EXERCICIO 05 - PROGRAMAÇÃO SEQUENCIAL
JULIA FONSECA
DATA: 25/02/2022
*/
// Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente.

import java.util.Scanner;

public class ProgramacaoSequencial05 {

	public static void main(String[] args) {
		
		double media;
		int nota1, nota2, nota3;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a sua primeira nota: ");
		nota1 = leia.nextInt();
		
		System.out.println("Digite a sua segunda nota: ");
		nota2 = leia.nextInt();
		
		System.out.println("Digite a sua terceira nota: ");
		nota3 = leia.nextInt();
		
		media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;
		
		System.out.println("Sua média final é: " + media);
		
		
		leia.close();	
		
	}

}
