package br.com.generation.orientacaoObjeto04;

import java.util.Scanner;

/*
EXERCICIO 04 ORIENTAÇÃO AO OBJETO
JULIA FONSECA
DATA: 07/03/2022
*/
//Crie uma classe funcionário e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto funcionário, defina as instancias deste objeto e apresente as informações deste objeto no console.

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o nome do(a) funcionário(a): ");
		String nome = entrada.next();
		
		System.out.println("Informe o sexo: ");
		String sexo = entrada.next();
		
		System.out.println("Digite a matrícula do(a) funcionário(a): ");
		String matricula = entrada.next();
		
		System.out.println("Digite o salário do(a) funcionário(a): ");
		double salario = entrada.nextDouble();
		
		
		Funcionario01 f1 = new Funcionario01();
		
		f1.setNome(nome);
		f1.setSexo(sexo);
		f1.setMatricula(matricula);
		f1.setSalario(salario);
		
		System.out.println();
		System.out.println("Nome: " + f1.getNome());
		System.out.println("Sexo: " + f1.getSexo());
		System.out.println("Matrícula: " + f1.getMatricula());
		System.out.println("Salário: " + f1.getSalario());
		
		f1.atender();
		f1.baterMeta();
		
		
		entrada.close();
		
	}

}
