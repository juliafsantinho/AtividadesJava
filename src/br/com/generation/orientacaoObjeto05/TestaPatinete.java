package br.com.generation.orientacaoObjeto05;

/*
EXERCICIO 05 ORIENTA��O AO OBJETO
JULIA FONSECA
DATA: 07/03/2022
*/
//Crie uma classe patinete e apresente os atributos e m�todos referentes esta classe, em seguida crie um objeto patinete, defina as instancias deste objeto e apresente as informa��es deste objeto no console.

public class TestaPatinete {

	public static void main(String[] args) {
	
		
		Patinete01 p1 = new Patinete01();
		
		p1.setMarca("Atrio");
		p1.setModelo("Unicorn");
		p1.setCor("Rosa");
		p1.setVelocidade(0);
		
		System.out.println("A Marca do Patinete �: " + p1.getMarca());
		System.out.println("O Modelo do Patinete �: " + p1.getModelo());
		System.out.println("A Cor do Patinete �: " + p1.getCor());
		System.out.println("A velocidade inicial do Patinete �: " + p1.getVelocidade());
		
		p1.kilometragem(20);
			System.out.println("\nO patinete pode chegar at� a " + p1.getVelocidade() + " km/h. Por isso devemos tomar cuidado com as crian�as brincando em lugares �ngremes.");
			
		p1.freiar(15);
			System.out.println("O freio pode chegar a " + p1.getVelocidade() + " km/h.");
		
		
	}

}
