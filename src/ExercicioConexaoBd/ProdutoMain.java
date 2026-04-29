package ExercicioConexaoBd;

import java.util.List;
import java.util.Scanner;

public class ProdutoMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ProdutoDAO pDAO = new ProdutoDAO();
		int opcao;
		
		do {
			
			System.out.println("\n===MENU CRUD===");
			System.out.println("1. Inserir produto");
			System.out.println("2. Listar");
			System.out.println("3. Atualizar");
			System.out.println("4. Excluir");
			System.out.println("0. Sair");
			System.out.println("Escolha: ");
			opcao = sc.nextInt();
			sc.nextLine();
			
			switch(opcao) {
			
			
			case 1:
				try {
					System.out.println("Informe o nome do produto: ");
					String nomeDig = sc.nextLine();
					
					System.out.println("Preco: ");
					Double precoDig = sc.nextDouble();
					sc.nextLine();
					
					System.out.println("Quantidade: ");
					int quantidadeDig = sc.nextInt();
					sc.nextLine();
					
					Produto p = new Produto(nomeDig, precoDig, quantidadeDig);
					
					pDAO.inserir(p);
					
					
				}catch(Exception e) {
					System.out.println("Erro no banco: " + e.getMessage());
				}
				break;
				
			case 2:
				try {
					
					List<Produto> lista = pDAO.Listar();
				
				if(lista.isEmpty()) {
					System.out.println("LISTA VAZIA");
					
				}else {
					System.out.println("lista de produtos");
					for(Produto p : lista) {
						System.out.println(p);
					}
				}
				}catch(Exception e) {
					System.out.println("Erro no banco: " + e.getMessage());
				}
				break;
				
			case 3:
				try {
				System.out.println("ID do produto: ");
				int Atualizar = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Novo nome: ");
				String novoN = sc.nextLine();
				
				System.out.println("Novo preco: ");
				Double novoP = sc.nextDouble();
				sc.nextLine();
				
				System.out.println("Nova Quantidade: ");
				int novoQ = sc.nextInt();
				sc.nextLine();
				
				Produto novoProduto = new Produto (Atualizar, novoN, novoP, novoQ);
				pDAO.atualizar(novoProduto);
				
				
			}catch(Exception e) {
				System.out.println("Erro no banco: " + e.getMessage());
			}
			break;
			
			case 4:
				try {
				
				System.out.println("ID para excluir: ");
				int excluir = sc.nextInt();
				sc.nextLine();
				
				pDAO.deletar(excluir);
				
				
				}catch(Exception e) {
					System.out.println("Erro no banco: " + e.getMessage());
				}
				break;
				
			case 0:
				System.out.println("\nSaindo...");
                break;
                
            default:
                System.out.println("\nOpção Inválida...");	
			}
			}while(opcao !=0);
			
	
		
		sc.close();
		
	}

}

