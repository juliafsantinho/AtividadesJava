package br.com.atividadesJava.generation;

/*
EXERCICIO 08 - PROGRAMAÇÃO SEQUENCIAL
JULIA FONSECA
DATA: 25/02/2022
*/
//O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao consumidor.

import java.util.Scanner;

public class ProgramacaoSequencial08 {

	public static void main(String[] args) {
	
		
		double cF, cC, cD, vI;
		
		Scanner leia = new Scanner(System.in);
		

		System.out.println("Calculo do custo de um novo carro ao consumidor\n");
		System.out.println("Informe o custo de fábrica: \n");
		cF = leia.nextDouble();
		
		vI = cF + (cF * 0.45);
		cD = cF + (cF * 0.28);
		
		cC = cF + cD+ vI;
		
		System.out.println("Custo ao consumidor = R$" + cC);
		
		leia.close();
		
	}

}
