package br.com.generation.heran�a01e02;
/*
EXERCICIO 01/02 HERAN�A
JULIA FONSECA
DATA: 08/03/2022
*/
//Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as caracter�sticas de forma que tudo o que for comum a todos os animais fique na classe Animal.

public class Cavalo extends Animal{

	//M�todos -> A��es -> Verbos
		void emitirSom () {
			System.out.println(getNome() + ", sempre relincha quando est� feliz ou quando quer uma cenoura.");
		}
	
		void correr() {
			System.out.println(getNome() + " tem " + getIdade() + " anos, ama cavalgar e correr pelo pasto.");
		}
}
