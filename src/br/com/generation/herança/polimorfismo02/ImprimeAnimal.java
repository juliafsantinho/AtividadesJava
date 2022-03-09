package br.com.generation.herança.polimorfismo02;

public class ImprimeAnimal {

	public static void main(String[] args) {
		
		TestaAnimal ta = new TestaAnimal();
		ta.conhecendoOsSons(new Cachorro());
		ta.conhecendoOsSons(new Cavalo());
		ta.conhecendoOsSons(new Preguica());

	}

}
