package br.com.generation.herança03;
/*
EXERCICIO 03 HERANÇA
JULIA FONSECA
DATA: 08/03/2022
Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o programa deverá atender as seguintes funcionalidades:
* Armazenar dados da List
* Remover dados da list;
* Atualizar dados da list.
* Apresentar todos os dados da list.
*/

public class Estoque {
		
	//Atributos
		private String peça01;
		private String peça02;
		private String peça03;
		private int quantidadePeças01;
		private int quantidadePeças02;
		private int quantidadePeças03;
		
		
	//Métodos de acessos e modificação de dados(private/encapsulamento)
		public int getQuantidadePeças01() {
			return quantidadePeças01;
		}
		public void setQuantidadePeças01(int quantidadePeças01) {
			this.quantidadePeças01 = quantidadePeças01;
		}
		public int getQuantidadePeças02() {
			return quantidadePeças02;
		}
		public void setQuantidadePeças02(int quantidadePeças02) {
			this.quantidadePeças02 = quantidadePeças02;
		}
		public int getQuantidadePeças03() {
			return quantidadePeças03;
		}
		public void setQuantidadePeças03(int quantidadePeças03) {
			this.quantidadePeças03 = quantidadePeças03;
		}
		
		public String getPeça01() {
			return peça01;
		}
		public void setPeça01(String peça01) {
			this.peça01 = peça01;
		}
		public String getPeça02() {
			return peça02;
		}
		public void setPeça02(String peça02) {
			this.peça02 = peça02;
		}
		public String getPeça03() {
			return peça03;
		}
		public void setPeça03(String peça03) {
			this.peça03 = peça03;
		}
		
		//EM PROCESSO DE FINALIZAÇÃO

	
		
}
