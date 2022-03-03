package br.com.atividadesJava.generation;

/*
EXERCICIO 03 - PROGRAMAÇÃO SEQUENCIAL
JULIA FONSECA
DATA: 25/02/2022
*/
// Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em segundos e mostre-o expresso em horas, minutos e segundos.

import java.util.Scanner;

public class ProgramacaoSequencial03 {

	public static void main(String[] args) {
		
		int horas, minutos, segundos, tempo = 0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe o tempo do evento em segundos");
		segundos = leia.nextInt();
		
		horas = segundos / 3600;
		minutos = (segundos % 3600) / 60;
		tempo = (segundos % 3600) % 60;
		
		System.out.println("O evento teve: " + horas + " horas, " + minutos + " minutos e " + segundos + " segundos.");
		System.out.println(tempo);
		
		leia.close();	
	}
	
}
