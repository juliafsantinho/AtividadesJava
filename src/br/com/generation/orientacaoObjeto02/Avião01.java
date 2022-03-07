package br.com.generation.orientacaoObjeto02;

/*
EXERCICIO 02 ORIENTAÇÃO AO OBJETO
JULIA FONSECA
DATA: 07/03/2022
*/
//Crie uma classe avião e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto avião, defina as instancias deste objeto e apresente as informações deste objeto no console.


public class Avião01 {


	//Atrivutos -> Variáveis
		String modelo;
		int ano;
		int velocidade;
		
				
	//Métodos -> Ações ->Verbos
		
		void voar(int aceleracao) {
			velocidade += aceleracao;
			
		}
		
		void pousar(int reducao) {
			velocidade -= reducao;
			
		}
		
}
