package br.com.generation.orientacaoObjeto02;

/*
EXERCICIO 02 ORIENTA��O AO OBJETO
JULIA FONSECA
DATA: 07/03/2022
*/
//Crie uma classe avi�o e apresente os atributos e m�todos referentes esta classe, em seguida crie um objeto avi�o, defina as instancias deste objeto e apresente as informa��es deste objeto no console.

public class TestaAvi�o {

	public static void main(String[] args) {
		
		Avi�o01 a1 = new Avi�o01();
		
		a1.modelo = "HU5897";
		a1.ano = 2018;
		a1.velocidade = 200;
		
		
		System.out.println(a1.modelo);
		System.out.println(a1.ano);
		System.out.println(a1.velocidade);
		
		
		a1.voar(80);
			System.out.println("No v�o a velocidade do avi�o varia entre a 200 a " + a1.velocidade);

		a1.pousar(40);
			System.out.println("No pouso a velocidade do avi�o varia entre a 270 a " + a1.velocidade);
	}

}
