package br.com.generation.orientacaoObjeto02;

/*
EXERCICIO 02 ORIENTAÇÃO AO OBJETO
JULIA FONSECA
DATA: 07/03/2022
*/
//Crie uma classe avião e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto avião, defina as instancias deste objeto e apresente as informações deste objeto no console.

public class TestaAvião {

	public static void main(String[] args) {
		
		Avião01 a1 = new Avião01();
		
		a1.modelo = "HU5897";
		a1.ano = 2018;
		a1.velocidade = 200;
		
		
		System.out.println(a1.modelo);
		System.out.println(a1.ano);
		System.out.println(a1.velocidade);
		
		
		a1.voar(80);
			System.out.println("No vôo a velocidade do avião varia entre a 200 a " + a1.velocidade);

		a1.pousar(40);
			System.out.println("No pouso a velocidade do avião varia entre a 270 a " + a1.velocidade);
	}

}
