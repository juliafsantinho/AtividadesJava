package br.com.generation.heran�a.polimorfismo02;
//SUPERCLASSE
public abstract class Animal {// 	Com a classe abstrata quem tem acesso ao ImprimeAnimal, n�o consegue ter acesso a raiz do c�digo que � o Animal., para a seguran�a do software.

	String nome;

	public void somAnimal() {
		System.out.println("Animal emite o som... ");
	}

}


