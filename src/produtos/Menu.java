package produtos;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import produtos.model.Produtos;
import produtos.controller.ProdutosController;
import produtos.model.FaixaEtaria;

public class Menu {

	public static void main(String[] args) {

		ProdutosController produtos = new ProdutosController();

		Scanner leia = new Scanner(System.in);

		int opcao, idProduto, quantidadeEstoque, tipo;
		String nomeProduto, categoriaProduto, faixaEtaria;
		float precoProduto;

		System.out.println("\nCriar Contas\n");

		Produtos p1 = new Produtos(produtos.gerarId(), "Chupeta", "Acessório", 5.99f, 80);
		produtos.cadastrar(p1);

		FaixaEtaria p2 = new FaixaEtaria(produtos.gerarId(), "Pirâmide de Argolas", "Brinquedo", 59.99f, 80, "6 meses");
		produtos.cadastrar(p2);

		produtos.listarTodos();
		System.out.println("");

		while (true) {
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                PEQUENINOS SONHADORES                ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Produto                        ");
			System.out.println("            2 - Listar todos os Produtos             ");
			System.out.println("            3 - Consultar Produto por Id             ");
			System.out.println("            4 - Atualizar Produto             		 ");
			System.out.println("            5 - Apagar Produto                       ");
			System.out.println("            6 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao = 0;
			}

			if (opcao == 6) {
				System.out.println("\n Pequeninos Sonhadores - O melhor para o seu bebê!");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("Criar Produto\n\n");
				System.out.println("Digite o Nome do Produto: ");
				leia.skip("\\R");
				nomeProduto = leia.nextLine();

				System.out.println("Digite a Categoria do Produto: ");
				categoriaProduto = leia.nextLine();

				do {
					System.out.println(
							"Digite (1) se a Categoria do Produto for BRINQUEDO ou Digite (2) para demais Categotoras: ");
					tipo = leia.nextInt();

				} while (tipo < 1 || tipo > 2);

				System.out.println("Digite o Preço do Produto: ");
				precoProduto = leia.nextFloat();

				System.out.println("Digite a Quantidade em Estoque: ");
				quantidadeEstoque = leia.nextInt();

				switch (tipo) {
				case 1 -> {

					System.out.println("Digite a Faixa Etária do Produto: ");
					leia.skip("\\R");
					faixaEtaria = leia.nextLine();
					produtos.cadastrar(new FaixaEtaria(produtos.gerarId(), nomeProduto, categoriaProduto, precoProduto,
							quantidadeEstoque, faixaEtaria));
				}
				case 2 -> {
					produtos.cadastrar(new Produtos(produtos.gerarId(), nomeProduto, categoriaProduto, precoProduto,
							quantidadeEstoque));

				}
				}
				KeyPress();
				break;
			case 2:
				System.out.println("Listar todos os Produtos\n\n");
				produtos.listarTodos();

				KeyPress();
				break;
			case 3:
				System.out.println("Consultar Produto por Id\n\n");

				System.out.println("Digite o Id do Produto: ");
				idProduto = leia.nextInt();

				produtos.procurarporId(idProduto);
				KeyPress();
				break;
			case 4:
				System.out.println("Atualizar Produto\n\n");

				System.out.println("Digite o Id do Produto: ");
				idProduto = leia.nextInt();

				var buscaProduto = produtos.buscarNaCollection(idProduto);

				if (buscaProduto != null) {
					System.out.println("Digite o Novo Nome do Produto: ");
					leia.skip("\\R");
					nomeProduto = leia.nextLine();

					System.out.println("Digite a Nova Categoria do Produto: ");
					categoriaProduto = leia.nextLine();

					do {
						System.out.println(
								"Digite (1) se a Categoria do Produto for BRINQUEDO ou Digite (2) para demais Categotoras: ");
						tipo = leia.nextInt();

					} while (tipo < 1 || tipo > 2);

					System.out.println("Digite o Novo Preço do Produto: ");
					precoProduto = leia.nextFloat();

					System.out.println("Digite a Nova Quantidade em Estoque: ");
					quantidadeEstoque = leia.nextInt();

					switch (tipo) {
					case 1 -> {

						System.out.println("Digite a Nova Faixa Etária do Produto: ");
						leia.skip("\\R");
						faixaEtaria = leia.nextLine();
						produtos.atualizar(new FaixaEtaria(idProduto, nomeProduto, categoriaProduto, precoProduto,
								quantidadeEstoque, faixaEtaria));
					}
					case 2 -> {
						produtos.atualizar(new Produtos(idProduto, nomeProduto, categoriaProduto, precoProduto,
								quantidadeEstoque));

					}
					default -> {
						System.out.println("Tipo de Produto Inválido!");
					}
					}

				} else {
					System.out.println("O Produto não foi encontrado!");
				}

				KeyPress();
				break;
			case 5:
				System.out.println("Apagar Produto\n\n");

				System.out.println("Digite o Id do Produto: ");
				idProduto = leia.nextInt();

				produtos.deletar(idProduto);

				KeyPress();
				break;
			default:
				System.out.println("\nOpção Inválida\n");

				KeyPress();
				break;
			}

		}

	}

	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Maria Xavier - maria.xxvier05@gmail.com");
		System.out.println("github.com/marii182");
		System.out.println("*********************************************************");
	}

	public static void KeyPress() {

		try {

			System.out.println("\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}

	}

}
