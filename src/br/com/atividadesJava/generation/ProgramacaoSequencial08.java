package br.com.atividadesJava.generation;

/*
EXERCICIO 08 - PROGRAMA��O SEQUENCIAL
JULIA FONSECA
DATA: 25/02/2022
*/
//O custo ao consumidor de um carro novo � a soma do custo de f�brica com a percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica). Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao consumidor.

import java.util.Scanner;

public class ProgramacaoSequencial08 {

	public static void main(String[] args) {
	
		
		double cF, cC, cD, vI;
		
		Scanner leia = new Scanner(System.in);
		

		System.out.println("Calculo do custo de um novo carro ao consumidor\n");
		System.out.println("Informe o custo de f�brica: \n");
		cF = leia.nextDouble();
		
		vI = cF + (cF * 0.45);
		cD = cF + (cF * 0.28);
		
		cC = cF + cD+ vI;
		
		System.out.println("Custo ao consumidor = R$" + cC);
		
		leia.close();
		
	}

}
