package br.com.generation.orientacaoObjeto04;

/*
EXERCICIO 04 ORIENTA��O AO OBJETO
JULIA FONSECA
DATA: 07/03/2022
*/
//Crie uma classe funcion�rio e apresente os atributos e m�todos referentes esta classe, em seguida crie um objeto funcion�rio, defina as instancias deste objeto e apresente as informa��es deste objeto no console.

public class Funcionario01 {

	//Atributos -> Variaveis
			 private String nome;
			 private String sexo;
			 private String matricula;
			 private double salario;
			public String getNome() {
				return nome;
			}
			public void setNome(String nome) {
				this.nome = nome;
			}
			public String getSexo() {
				return sexo;
			}
			public void setSexo(String sexo) {
				this.sexo = sexo;
			}
			public String getMatricula() {
				return matricula;
			}
			public void setMatricula(String matricula) {
				this.matricula = matricula;
			}
			public double getSalario() {
				return salario;
			}
			public void setSalario(double salario) {
				this.salario = salario;
			}
			
			
	//M�todos -> A��es - > Verbos
			
		public	void atender() {
				System.out.println("O funcion�rio � um exemplo em atendimento!");
				
			}
			
		public void baterMeta() {
				System.out.println("O funcion�rio sempre est� com as metas batidas.");
			}
		
				
						
			
}
