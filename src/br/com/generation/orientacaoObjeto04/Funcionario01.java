package br.com.generation.orientacaoObjeto04;

/*
EXERCICIO 04 ORIENTAÇÃO AO OBJETO
JULIA FONSECA
DATA: 07/03/2022
*/
//Crie uma classe funcionário e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto funcionário, defina as instancias deste objeto e apresente as informações deste objeto no console.

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
			
			
	//Métodos -> Ações - > Verbos
			
		public	void atender() {
				System.out.println("O funcionário é um exemplo em atendimento!");
				
			}
			
		public void baterMeta() {
				System.out.println("O funcionário sempre está com as metas batidas.");
			}
		
				
						
			
}
