package br.com.generation.orientacaoObjeto03;

/*
EXERCICIO 03 ORIENTAÇÃO AO OBJETO
JULIA FONSECA
DATA: 07/03/2022
*/
//Crie uma classe produto eletrônico e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto produto eletrônico, defina as instancias deste objeto e apresente as informações deste objeto no console.


public class TestaEletronico {

	public static void main(String[] args) {
		
		Eletronico01 e1 = new Eletronico01();
		Eletronico01 e2 = new Eletronico01();
		
		e1.marca = "Samsung";
		e1.modelo = "EA254";
		e1.tipo = "Celular";
		e1.ano = 2022;
		
		System.out.println(e1.tipo);
		System.out.println(e1.marca);
		System.out.println(e1.modelo);
		System.out.println(e1.ano);
				
		e1.entreter();
		e1.aprender();
		
		
		e2.marca = "LG";
		e2.modelo = "Linkx 0584";
		e2.tipo = "Tablet";
		e2.ano = 2022;
		
		System.out.println();
		System.out.println(e2.tipo);
		System.out.println(e2.marca);
		System.out.println(e2.modelo);
		System.out.println(e2.ano);
		
		e2.entreter();
		e2.aprender();
	}

}
