package br.com.generation.orientacaoObjeto05;

/*
EXERCICIO 05 ORIENTA��O AO OBJETO
JULIA FONSECA
DATA: 07/03/2022
*/
//Crie uma classe patinete e apresente os atributos e m�todos referentes esta classe, em seguida crie um objeto patinete, defina as instancias deste objeto e apresente as informa��es deste objeto no console.

public class Patinete01 {

	//Atributos -> Variaveis
		private String marca;
		private String modelo;
		private String cor;
		private int velocidade;
					
		void kilometragem (int acelera�ao) {
			velocidade += acelera�ao;
		}
		
		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public String getCor() {
			return cor;
		}

		public void setCor(String cor) {
			this.cor = cor;
		}

		public int getVelocidade() {
			return velocidade;
		}

		public void setVelocidade(int velocidade) {
			this.velocidade = velocidade;
		}

		void freiar (int reducao) {
			velocidade -= reducao;
		}
		
}
