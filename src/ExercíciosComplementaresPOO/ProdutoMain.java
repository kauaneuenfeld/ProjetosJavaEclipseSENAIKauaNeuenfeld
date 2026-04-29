package ExercíciosComplementaresPOO;

import java.util.*;

public class ProdutoMain {

	public static void main(String[] args) {
		
		ArrayList<Produto> produtos = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		int opcao;

        do {

        	System.out.println("\n=== CADASTRO DE PRODUTOS ===");
        	System.out.println("1. Adicionar produto");
        	System.out.println("2. Listar produtos");
        	System.out.println("3. Contar produtos");
        	System.out.println("0. Sair");
        	System.out.print("Escolha: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
            
            case 1:
            	
            	 System.out.print("\nDigite o nome do produto: ");
                 String nome = sc.nextLine();
                 System.out.print("Digite o preço do produto: ");
                 double preco = sc.nextDouble();
                 System.out.print("Digite a quantidade: ");
                 int quantidade = sc.nextInt();
                 
                 Produto NovoProduto = new Produto(nome, preco, quantidade);
                 produtos.add(NovoProduto);
                 System.out.println("\nO produto foi adicionado com sucesso");
                 break;
            
            case 2:
            	
            		if(produtos.isEmpty()) {
            			System.out.println("Nenhum produto foi cadastrado ainda");
            		}else {
            			System.out.println("\n---LISTA DE PRODUTOS---");
            			for(Produto p : produtos) {
            			p.exibirDados();
            			}
            		}
            		break;
            		
            case 3:
            	
            		System.out.println("O total de produtos cadastrados é de " + produtos.size());
            		break;
            		
            case 0:
                System.out.println("Saindo...");
                break;

            default:
                System.out.println("Opção inválida!");
        }

        } while (opcao != 0);
        
		sc.close();
		
	}

}


