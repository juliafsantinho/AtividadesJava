package br.com.generation.orientacaoObjeto06;

import java.util.Scanner;

/*
EXERCICIO 06 ORIENTA��O AO OBJETO
JULIA FONSECA
DATA: 07/03/2022
*/
//Crie uma classe conta bancaria e apresente os atributos e m�todos referentes esta classe, em seguida crie um objeto conta bancaria, defina as instancias deste objeto e apresente as informa��es deste objeto no console.

public class TestaContaBancaria {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = entrada.next();
		
		System.out.println("Digite seu CPF (sem ponto ou tra�o): ");
		String CPF = entrada.next();
		
		System.out.println("Digite sua ag�ncia: ");
		int agencia = entrada.nextInt();
		
		System.out.println("Digite sua conta (sem o d�gito): ");
		int conta = entrada.nextInt();
		
		System.out.println("Digite o d�gito: ");
		int digito = entrada.nextInt();
		
		System.out.println("Digite sua senha: ");
		int senha = entrada.nextInt();
		
		
		ContaBancaria01 cb = new ContaBancaria01();
		
		cb.setNome(nome);
		cb.setCPF(CPF);
		cb.setAgencia(agencia);
		cb.setConta(conta);
		cb.setD�gito(digito);
		cb.setSenha(senha);
		
		System.out.println();
		System.out.println(cb.getNome()); 
		System.out.println(cb.getCPF());
		System.out.println(cb.getAgencia());
		System.out.println(cb.getConta());
		System.out.println(cb.getD�gito());
		
		System.out.println();
		cb.receber();
		cb.pagar();
		
		
		
		
		
		
		
		entrada.close();
	}

}
