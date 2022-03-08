package br.com.generation.herança03;

import java.util.ArrayList;

/*
EXERCICIO 03 HERANÇA
JULIA FONSECA
DATA: 08/03/2022
Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o programa deverá atender as seguintes funcionalidades:
* Armazenar dados da List
* Remover dados da list;
* Atualizar dados da list.
* Apresentar todos os dados da list.
*/
public class Armazenamento extends Estoque {
	
	
	//Métodos -> Ações -> Verbos
			public void armazenar() {
				
			
				ArrayList<String> peça01 = new ArrayList<>();
				peça01.add("Shorts feminino Azul");
				peça01.add("Shorts  feminino Rosa");
				peça01.add("Shorts  feminino Preto");
				peça01.add("Shorts  feminino Laranja");
				
				
				ArrayList<String> peça02 = new ArrayList<>();
				peça02.add("Camiseta unissex Preta");
				peça02.add("Camiseta unissex Cinza");
				peça02.add("Camiseta unissex Rosa");
				peça02.add("Camiseta unissex Azul");
				
				
				ArrayList<String> peça03 = new ArrayList<>();
				peça03.add("Calça feminina Azul");
				peça03.add("Calça feminina Preta");
				peça03.add("Calça masculina Azul");
				peça03.add("Calça masculina Preta");
				
		}													//EM PROCESSO DE FINALIZAÇÃO

}
