package br.com.generation.orientacaoObjeto02;

/*
EXERCICIO 02 ORIENTA��O AO OBJETO
JULIA FONSECA
DATA: 07/03/2022
*/
//Crie uma classe avi�o e apresente os atributos e m�todos referentes esta classe, em seguida crie um objeto avi�o, defina as instancias deste objeto e apresente as informa��es deste objeto no console.


public class Avi�o01 {


	//Atrivutos -> Vari�veis
		String modelo;
		int ano;
		int velocidade;
		
				
	//M�todos -> A��es ->Verbos
		
		void voar(int aceleracao) {
			velocidade += aceleracao;
			
		}
		
		void pousar(int reducao) {
			velocidade -= reducao;
			
		}
		
}
