package br.com.generation.herança01;
/*
EXERCICIO 01/02 HERANÇA
JULIA FONSECA
DATA: 08/03/2022
*/
//Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as características de forma que tudo o que for comum a todos os animais fique na classe Animal.

public class Animal {

	//Atributos
		private String nome;
		private int idade;
	
	//Métodos de acessos e modificação de dados(private/encapsulamento)
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public int getIdade() {
			return idade;
		}
		public void setIdade(int idade) {
			this.idade = idade;
		}
	
}
