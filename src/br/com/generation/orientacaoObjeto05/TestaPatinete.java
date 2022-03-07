package br.com.generation.orientacaoObjeto05;

/*
EXERCICIO 05 ORIENTAÇÃO AO OBJETO
JULIA FONSECA
DATA: 07/03/2022
*/
//Crie uma classe patinete e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto patinete, defina as instancias deste objeto e apresente as informações deste objeto no console.

public class TestaPatinete {

	public static void main(String[] args) {
	
		
		Patinete01 p1 = new Patinete01();
		
		p1.setMarca("Atrio");
		p1.setModelo("Unicorn");
		p1.setCor("Rosa");
		p1.setVelocidade(0);
		
		System.out.println("A Marca do Patinete é: " + p1.getMarca());
		System.out.println("O Modelo do Patinete é: " + p1.getModelo());
		System.out.println("A Cor do Patinete é: " + p1.getCor());
		System.out.println("A velocidade inicial do Patinete é: " + p1.getVelocidade());
		
		p1.kilometragem(20);
			System.out.println("\nO patinete pode chegar até a " + p1.getVelocidade() + " km/h. Por isso devemos tomar cuidado com as crianças brincando em lugares íngremes.");
			
		p1.freiar(15);
			System.out.println("O freio pode chegar a " + p1.getVelocidade() + " km/h.");
		
		
	}

}
