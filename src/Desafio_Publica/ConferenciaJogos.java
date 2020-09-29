/*
 * Desenvolvido por David de Jesus Oliveira
 * data 27/09/2020
 */

package Desafio_Publica;

import java.util.Scanner;

public class ConferenciaJogos {

	public static void main(String[] args) {

		Temporada primeira = new Temporada();
		// @SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);

		System.out.printf("\nOlá Maria! \nO que você deseja fazer? \n");
		String opcao = "0";
		String placar;

		while (opcao == "0") {
			System.out.println("\nEscolha Uma das Opções: ");
			System.out.println("\t1 - Atualizar Dados da Temporada;");
			System.out.println("\t2 - Consultar Dados da temporada;");
			System.out.println("\t3 - Fechar o programa.");
			System.out.print("Digite sua escolha: ");
			opcao = leia.next();
			boolean v = false;
			
			switch (opcao) {
			case "1":
				do {
					System.out.print("\tDigite o placar: ");
					placar = leia.next();

					try {
						if(Integer.parseInt(placar) >= 0 && Integer.parseInt(placar) <= 1000) {
						primeira.NovoJogo();
						primeira.setPlacar(Integer.parseInt(placar));
						v = true;
						System.out.println("Placar adicionado com sucesso!");

					}else {
						System.out.println("Informe um número entre 0 e 1000!\n");
						}  
		            }catch(NumberFormatException e){
		            	System.out.println("Informe apenas números!\n");	
		            	}
				} while (v == false);

				opcao = "0";
				break;

			case "2":
				System.out.printf(" %50s%n", "TABELA DA TEMPORADA ATUAL");
				primeira.statusTabela();

				if (primeira.getRecordesMinimos() == 1) {
					System.out.println("O recorde Mínimo foi quebrado: " + primeira.getRecordesMinimos() + " vez.");
				} else {
					System.out.println("O recorde Mínimo foi quebrado: " + primeira.getRecordesMinimos() + " vezes.");
				}
				if (primeira.getRecordesMaximos() == 1) {

					System.out.println("O recorde Máximo foi quebrado: " + primeira.getRecordesMaximos() + " vez.");
				} else {
					System.out.println("O recorde Máximo foi quebrado: " + primeira.getRecordesMaximos() + " vezes.");
				}
				opcao = "0";
				break;

			case "3":
				System.out.println("Programa finalizado!");
				break;
			default:
				System.out.println("Opção inválida! Informe outra opção:\n");
				opcao = "0";
				break;
			}
		}
		leia.close();
	}
}
