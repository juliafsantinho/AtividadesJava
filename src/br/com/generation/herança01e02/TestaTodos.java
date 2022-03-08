package br.com.generation.herança01e02;
/*
EXERCICIO 01/02 HERANÇA
JULIA FONSECA
DATA: 08/03/2022
*/
//Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as características de forma que tudo o que for comum a todos os animais fique na classe Animal.

public class TestaTodos {

	public static void main(String[] args) {
		
		Cachorro ca = new Cachorro ();
		Cavalo cv = new Cavalo();
		Preguiça pr = new Preguiça();
		
		ca.setNome("Luke");
		ca.setIdade(3);
		
		System.out.println("Nome do doguinho: " + ca.getNome());
		System.out.println("Idade do doguinho: " + ca.getIdade());
				
		ca.emitirSom();
		ca.correr();
		
		
		cv.setNome("Poco");
		cv.setIdade(10);
		
		System.out.println();
		System.out.println("Nome do cavalo: " + cv.getNome());
		System.out.println("Idado do cavalo: " + cv.getIdade());
		
		
		cv.emitirSom();
		cv.correr();
		
		
		pr.setNome("Soneca");
		pr.setIdade(36);
		
		System.out.println();
		System.out.println("Nome da preguiça: " + pr.getNome());
		System.out.println("Idade da preguiça: " + pr.getIdade());
		
		pr.emitirSom();
		pr.subirArvores();
		
		

	}

}
