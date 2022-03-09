package br.com.generation.herança01;
/*
EXERCICIO 01/02 HERANÇA
JULIA FONSECA
DATA: 08/03/2022
*/
//Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as características de forma que tudo o que for comum a todos os animais fique na classe Animal.

public class Cachorro extends Animal{

	//Métodos -> Ações -> Verbos
		void emitirSom () {
			System.out.println(getNome() + ", gosta muito de latir e se comunicar com os outros cachorros da rua que mora com seu dono.");
		}
		
		void correr() {
			System.out.println(getNome() + " tem " + getIdade() + " anos. Isso nos mostra de onde vem sua energia.");
		}
}
