package br.com.generation.orientacaoObjeto07;

/*
EXERCICIO 07 ORIENTAÇÃO AO OBJETO
JULIA FONSECA
DATA: 07/03/2022
*/
//Crie uma classe paciente e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto paciente, defina as instancias deste objeto e apresente as informações deste objeto no console.

public class TestaPaciente {

	public static void main(String[] args) {
		
			Paciente01 p1 = new Paciente01();
			
			p1.setNome("Anna Fernandes");
			p1.setCPF("23563596589");
			p1.setCelular(1196358523);
			p1.setTempoUltimaConsulta(30);
			
			System.out.println("Paciente: " + p1.getNome());
			System.out.println("CPF: " + p1.getCPF());
			System.out.println("Celular: " + p1.getCelular());
			System.out.println("O tempo de sua última consulta é de: " + p1.getTempoUltimaConsulta() + " dias.");
			System.out.println();
			
			
			p1.examinar();
			p1.proximaConsulta();
			
	}

}
