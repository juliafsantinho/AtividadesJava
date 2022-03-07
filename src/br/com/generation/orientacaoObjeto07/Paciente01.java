package br.com.generation.orientacaoObjeto07;
/*
EXERCICIO 07 ORIENTA��O AO OBJETO
JULIA FONSECA
DATA: 07/03/2022
*/
//Crie uma classe paciente e apresente os atributos e m�todos referentes esta classe, em seguida crie um objeto paciente, defina as instancias deste objeto e apresente as informa��es deste objeto no console.

public class Paciente01 {

	
			//Atributos -> Variaveis
			private String nome;
			private String CPF;
			private int celular;
			private int tempoUltimaConsulta;
			
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

			public int getCelular() {
				return celular;
			}

			public void setCelular(int celular) {
				this.celular = celular;
			}

			public int getTempoUltimaConsulta() {
				return tempoUltimaConsulta;
			}

			public void setTempoUltimaConsulta(int tempoUltimaConsulta) {
				this.tempoUltimaConsulta = tempoUltimaConsulta;
			}

			//M�todos -> A��es ->Verbos
			
			void proximaConsulta () {
				System.out.println("A data da pr�xima consulta � daqui " + (40 - tempoUltimaConsulta) + " dias.");
			}
			
			void examinar () {
				System.out.println("Passar exames para paciente.");
			}
			
	
	
	
	
	
}			