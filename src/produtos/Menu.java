package produtos;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;



import produtos.model.Produtos;
import produtos.model.FaixaEtaria;

public class Menu {

	public static void main(String[] args) {
		
		
		Produtos p1 = new Produtos(1,"Chupeta","Acessório",10.99f,40);
		p1.visualizar();
		p1.adicionarEstoque(50);
		p1.visualizar();
		p1.removerEstoque(10);
		p1.visualizar();
		
		FaixaEtaria b1 = new FaixaEtaria(2,"Pirâmide de Argolas","Brinquedo",89.99f,10,"6 meses");
		b1.visualizar();
		b1.adicionarEstoque(3);
		b1.visualizar();
		b1.removerEstoque(4);
		b1.visualizar();
		
		
		
		Scanner leia = new Scanner(System.in);
		
		int opcao; 
		
		while (true) {
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                PEQUENINOS SONHADORES                ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Produto                        ");
			System.out.println("            2 - Listar todos os Produtos             ");
			System.out.println("            3 - Atualizar Produto             		 ");
			System.out.println("            4 - Apagar Produto                       ");
			System.out.println("            5 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");
			
			try {
				opcao = leia.nextInt();
			}catch(InputMismatchException e){
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao=0;
			}
			
			
			if (opcao == 5) {
				System.out.println("\n Pequeninos Sonhadores - O melhor para o seu bebê!");
				sobre();
				leia.close();
				System.exit(0);
			}
			
			switch (opcao) {
			case 1:
				System.out.println("Criar Produto\n\n");
				
				KeyPress();
				break;
			case 2:
				System.out.println("Listar todos os Produtos\n\n");
				
				
				KeyPress();
				break;
			case 3:
				System.out.println("Atualizar Produto\n\n");
				
				KeyPress();
				break;
			case 4:
				System.out.println("Apagar Produto\n\n");
				
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
