package br.com.generation.orientacaoObjeto01;

/*
EXERCICIO 01 ORIENTA��O AO OBJETO
JULIA FONSECA
DATA: 07/03/2022
*/
//Crie uma classe cliente e apresente os atributos e m�todos referentes esta classe, em seguida crie um objeto cliente, defina as instancias deste objeto e apresente as informa��es deste objeto no console.


public class TestaCliente {

	public static void main(String[] args) {
		
		
		Cliente01 c1 = new Cliente01();
		Cliente01 c2 = new Cliente01();
		
		c1.nome = "Alice Soares";
		c1.CPF = "896.986.548-58";
		c1.endere�o = "Rua Alabama, n 5-89";
		
		
		System.out.println(c1.nome);
		System.out.println(c1.CPF);
		System.out.println(c1.endere�o);
		
		c1.comprar();
		c1.pagar();
		
		c2.nome = "Marcio Carvalho";
		c2.CPF = "369.896.575-89";
		c2.endere�o = "Avenida Duque de Caxias, n 7-63";
		
		System.out.println();
		System.out.println(c2.nome);
		System.out.println(c2.CPF);
		System.out.println(c2.endere�o);
		
		c2.comprar();
		c2.pagar();
		

	}

}
