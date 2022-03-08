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
public class DadosList {

	public static void main(String[] args) {
		
		Armazenamento ar = new Armazenamento();
		Quantidade qnt = new Quantidade();
		
		ar.setPeça01("Shorts Feminino");
		ar.setPeça02("Camiseta Unissex");
		ar.setPeça03("Calça Feminina e Masculina");
		qnt.setQuantidadePeças01(0);
		
		System.out.println("Temos opções de em várias cores de " + ar.getPeça01() + ".");
		System.out.println("Temos opções de em várias cores de " + ar.getPeça02() + ".");
		System.out.println("Temos opções de em várias cores de " + ar.getPeça03() + ".");
		System.out.println();
		
		
		
		//EM PROCESSO DE FINALIZAÇÃO

		
	}

}
