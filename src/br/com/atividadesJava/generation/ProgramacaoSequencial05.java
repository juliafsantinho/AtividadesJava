package br.com.atividadesJava.generation;

/*
EXERCICIO 05 - PROGRAMA��O SEQUENCIAL
JULIA FONSECA
DATA: 25/02/2022
*/
// Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5, respectivamente.

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
		
		System.out.println("Sua m�dia final �: " + media);
		
		
		leia.close();	
		
	}

}
