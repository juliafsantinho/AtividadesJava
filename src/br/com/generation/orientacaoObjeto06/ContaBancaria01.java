package br.com.generation.orientacaoObjeto06;

/*
EXERCICIO 06 ORIENTA��O AO OBJETO
JULIA FONSECA
DATA: 07/03/2022
*/
//Crie uma classe conta bancaria e apresente os atributos e m�todos referentes esta classe, em seguida crie um objeto conta bancaria, defina as instancias deste objeto e apresente as informa��es deste objeto no console.
		
public class ContaBancaria01 {

			//Atributos -> Variaveis
			private String nome;
			private String CPF;
			private int agencia;
			private int conta;
			private int d�gito;
			private int senha;
			
			
			public String getNome() {
				return nome;
			}

			public void setNome(String nome) {
				this.nome = nome;
			}

			public String getCPF() {
				return CPF;
			}

			public void setCPF(String cPF) {
				CPF = cPF;
			}

			public int getAgencia() {
				return agencia;
			}

			public void setAgencia(int agencia) {
				this.agencia = agencia;
			}

			public int getConta() {
				return conta;
			}

			public void setConta(int conta) {
				this.conta = conta;
			}

			public int getD�gito() {
				return d�gito;
			}

			public void setD�gito(int d�gito) {
				this.d�gito = d�gito;
			}

			public int getSenha() {
				return senha;
			}

			public void setSenha(int senha) {
				this.senha = senha;
			}

			//M�todos -> A��es ->Verbos
			
			
			void pagar() {
				System.out.println("Em d�bito o valor de R$ 589,00 em nosso cheque especial.");	
			}
			
			void receber() {
				System.out.println("Seu pagamento caiu hoje, " + nome + "!");
			}
			
			
}
