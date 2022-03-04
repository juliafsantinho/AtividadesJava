package br.com.generation.repeticao;

import java.util.Scanner;

/*EXERCICIO 03 - LA�O DE REPETI��O
 * JULIA SANTINHO DA FONSECA
 * 04/03/2022
 Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas psicol�gicas dos indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as op��es
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
* o n�mero de pessoas calmas;
* o n�mero de mulheres nervosas;
* o n�mero de homens agressivos;
* o n�mero de outros calmos;
* o n�mero de pessoas nervosas com mais de 40 anos;
* o n�mero de pessoas calmas com menos de 18 anos.
*/

public class Atividade04Repeticao {

	public static void main(String[] args) {
		
			
		Scanner entrada = new Scanner(System.in);
		
		int idade, sexo, caracPsicologica, entradas = 1, pessoaCalma = 0, outrosCalmo = 0, calmoMenor18 = 0,
				mulherNervosa = 0, nervosoMaior40 = 0, homemAgressivo = 0;

		while (entradas <= 150) {
			System.out.println("Informe a idade: ");
			idade = entrada.nextInt();

			System.out.println("Informe o sexo:\n1 - FEMININO \n2 - MASCULINO \n3 - OUTROS");
			sexo = entrada.nextInt();

			switch (sexo) {
			case 1:
				break;

			case 2:
				break;

			case 3:
				break;
			default:
				break;
			}

			System.out.println("Em qual das op��es a pessoa se encaixa: (Informe o n�mero relacionado a op��o!");
			System.out.println("\n1 - CALMA \n2 - NERVOSA \n3 - AGRESSIVA");
			caracPsicologica = entrada.nextInt();

			switch (caracPsicologica) {
			case 1:
				pessoaCalma++;
				if (idade < 18) {
					calmoMenor18++;
				}
				if (sexo == 3) {
					outrosCalmo++;
				}
				break;

			case 2:
				if (sexo == 1) {
					mulherNervosa++;
				}
				if (idade > 40) {
					nervosoMaior40++;
				}
				break;

			case 3:
				if (sexo == 2) {
					homemAgressivo++;
				}
				break;
			default:
				break;
			}
			entradas++;

		}

		entrada.close();

		System.out.println("PESSOAS CALMAS | QUANTIDADE: " + pessoaCalma + "\n" + "\nMULHERES NERVOSAS | QUANTIDADE: "
				+ mulherNervosa + "\n" + "\nHOMENS AGRESSIVOS | QUANTIDADE: " + homemAgressivo + "\n"
				+ "\nOUTROS CALMOS | QUANTIDADE: " + outrosCalmo + "\n"
				+ "\nPESSOAS NERVOSAS COM MAIS DE 40 ANOS | QUANTIDADE: " + nervosoMaior40 + "\n"
				+ "\nPESSOAS CALMAS COM MENOS DE 18 ANOS | QUANTIDADE: " + calmoMenor18);

				
			}
			

	}

