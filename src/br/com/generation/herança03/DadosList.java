package br.com.generation.heran�a03;
/*
EXERCICIO 03 HERAN�A
JULIA FONSECA
DATA: 08/03/2022
Crie uma um programa para trabalhar com estoque de uma loja, o programa dever� trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o programa dever� atender as seguintes funcionalidades:
* Armazenar dados da List
* Remover dados da list;
* Atualizar dados da list.
* Apresentar todos os dados da list.
*/
public class DadosList {

	public static void main(String[] args) {
		
		Armazenamento ar = new Armazenamento();
		Quantidade qnt = new Quantidade();
		
		ar.setPe�a01("Shorts Feminino");
		ar.setPe�a02("Camiseta Unissex");
		ar.setPe�a03("Cal�a Feminina e Masculina");
		qnt.setQuantidadePe�as01(0);
		
		System.out.println("Temos op��es de em v�rias cores de " + ar.getPe�a01() + ".");
		System.out.println("Temos op��es de em v�rias cores de " + ar.getPe�a02() + ".");
		System.out.println("Temos op��es de em v�rias cores de " + ar.getPe�a03() + ".");
		System.out.println();
		
		
		
		//EM PROCESSO DE FINALIZA��O

		
	}

}
