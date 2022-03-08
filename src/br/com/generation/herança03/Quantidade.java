package br.com.generation.herança03;
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

import java.util.ArrayList;

public class Quantidade extends Estoque {
	 
		//Métodos -> Ações -> Verbos
				public void Contagem() {
					
					ArrayList<String> quantidadePeças01 = new ArrayList<>();
					quantidadePeças01.add(5, "Shorts feminino Azul");
					quantidadePeças01.add(3, "Shorts  feminino Rosa");
					quantidadePeças01.add(5, "Shorts  feminino Preto");
					quantidadePeças01.add(2, "Shorts  feminino Laranja");
					
					ArrayList<String> quantidadePeças02 = new ArrayList<>();
					quantidadePeças02.add(10, "Camiseta unissex Preta");
					quantidadePeças02.add(5,  "Camiseta unissex Cinza");
					quantidadePeças02.add(8,  "Camiseta unissex Rosa");
					quantidadePeças02.add(6,  "Camiseta unissex Azul");
					
					ArrayList<String> quantidadePeças03 = new ArrayList<>();
					quantidadePeças03.add(8,  "Calça feminina Azul");
					quantidadePeças03.add(10, "Calça feminina Preta");
					quantidadePeças03.add(9,  "Calça masculina Azul");
					quantidadePeças03.add(9,  "Calça masculina Preta");
					
					
					
				//EM PROCESSO DE FINALIZAÇÃO
	}
	
}
