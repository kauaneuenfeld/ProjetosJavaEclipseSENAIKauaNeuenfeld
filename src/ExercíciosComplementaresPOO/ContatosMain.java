package ExercíciosComplementaresPOO;

import java.util.*;

public class ContatosMain {

	public static void main(String[] args) {
		
		ArrayList<Contatos> contatos = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		int opcao;
		
		do {
			
			System.out.println("\n=== AGENDA DE CONTATOS ===");
			System.out.println("1. Adicionar contato");
			System.out.println("2. Listar contatos");
			System.out.println("3. buscar por nomes");
			System.out.println("4. Remover contato");
			System.out.println("0. Sair");
			System.out.print("Escolha: ");
		
			opcao =sc.nextInt();
			sc.nextLine();
		
		switch(opcao) {
			
		case 1:
			
			System.out.print("\nNome: ");
            String nome = sc.nextLine();
            System.out.print("Telefone: ");
            String telefone = sc.nextLine();
            
            Contatos NovoContato = new Contatos(nome, telefone);
            contatos.add(NovoContato);
            System.out.println("\nCONTATO ADICIONADO COM SUCESSO");
		break;
		
		case 2:
			
			if(contatos.isEmpty()) {
				System.out.println("LISTA VAZIA");
			}else {
				System.out.println("Contatos cadastrados -> " + contatos.size());
				int i = 0;
				for (Contatos c : contatos) {
				    i++;
				    System.out.println(i + " - " + c.getNome() + " - " + c.getTelefone());
				    
				}

			}
		break;
		
		case 3:
			
		    System.out.println("Digite um nome para buscar: ");
		    String buscar = sc.nextLine();

		    boolean encontrado = false;

		    for (Contatos c : contatos) {
		        if (c.getNome().contains(buscar)) {
		            c.ExibirDados();
		            encontrado = true;
		        }
		    }

		    if (!encontrado) {
		        System.out.println("Nenhum contato encontrado");
		    }
		    break;

		case 4:
			
			int i = 0;
			for (Contatos c : contatos) {
			    i++;
			    System.out.println(i + " - " + c.getNome() + " - " + c.getTelefone());
			}
			
			System.out.println("Que numero deseja remover? ");
			int remover = sc.nextInt();
			sc.nextLine();
			if (remover >= 1 && remover <= contatos.size()) {
				contatos.remove(remover -1);
				System.out.println("CONTATO REMOVIDO COM SUCESSO");
			}else {
				System.out.println("Contato não existe");
			}
		break;
		
		case 0: 
	
            System.out.println("Saindo...");
            break;

        default:
            System.out.println("❌ Opção inválida!");
		}
		
		}while (opcao !=0);
		
		sc.close();
	}

}
