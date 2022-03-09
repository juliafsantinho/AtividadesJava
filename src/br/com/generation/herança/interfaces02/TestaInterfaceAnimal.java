package br.com.generation.herança.interfaces02;

public class TestaInterfaceAnimal {

	public static void main(String[] args) {
		
		Cachorro ch = new Cachorro();
		
		ch.somAnimal();
		System.out.println();
		
		Cavalo cv = new Cavalo();
		
		cv.somAnimal();
		System.out.println();
		
		Preguica pr = new Preguica();
		
		pr.somAnimal();

	}

}
