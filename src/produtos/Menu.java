package produtos;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
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
			
			opcao = leia.nextInt();
			
			if (opcao == 5) {
				System.out.println("\n Pequeninos Sonhadores - O melhor para o seu bebê!");
				sobre();
				leia.close();
				System.exit(0);
			}
			
			switch (opcao) {
			case 1:
				System.out.println("Criar Produto\n\n");
				
				break;
			case 2:
				System.out.println("Listar todos os Produtos\n\n");
				
				break;
			case 3:
				System.out.println("Atualizar Produto\n\n");
				
				break;
			case 4:
				System.out.println("Apagar Produto\n\n");
				
				break;
			default:
				System.out.println("\nOpção Inválida\n");
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


	

}
