package br.com.generation.heran�a01e02;
/*
EXERCICIO 01/02 HERAN�A
JULIA FONSECA
DATA: 08/03/2022
*/
//Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as caracter�sticas de forma que tudo o que for comum a todos os animais fique na classe Animal.

public class Pregui�a extends Animal{

	
	//M�todos -> A��es -> Verbos
			void emitirSom () {
				System.out.println(getNome() + ", emite sons de alta frequ�ncia pelas narinas quando se sente amea�ada.");
			}
		
			void subirArvores() {
				System.out.println(getNome() + " tem " + getIdade() + " anos. Por isso que ama subir em �rvores e ficar descansando.");
			}
}
