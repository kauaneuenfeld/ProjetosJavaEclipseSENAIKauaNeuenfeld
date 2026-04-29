package prova;

import java.util.*;

public class AgendaContatosMain {

	public static void main(String[] args) {
		
		ArrayList<Contato> contatos = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		int opcao;
		
		do {
			
			System.out.println("\n1. Adicionar contato");
			System.out.println("2. Listar Contato");
			System.out.println("3. Buscar por nome");
			System.out.println("4. Remover contato");
			System.out.println("5. Sair");
			System.out.println("Escolha: ");
			opcao = sc.nextInt();
			sc.nextLine();
			
			switch(opcao) {
			
			case 1:
				
				System.out.println("\n===ADICIONAR CONTATO===");
				System.out.println("\nQual o tipo de contato? (1)Pessoal ou (2)COMERCIAL");
				System.out.println("\nOpção 1 ou 2? ");
				int tipo = sc.nextInt();
				sc.nextLine();
				
				if(tipo == 1) {
					
					System.out.println("Nome: ");
					String nomeDig = sc.nextLine();
					
					System.out.println("Telefone: ");
					int telefoneDig = sc.nextInt();
					sc.nextLine();
					
					Contato pessoal = new Contato(nomeDig, telefoneDig);
					contatos.add(pessoal);
					
					System.out.println("\nContato pessoal adicionado com sucesso");
					
				}else if(tipo == 2) {
					
					System.out.println("Nome: ");
					String nomeDig2 = sc.nextLine();
					
					System.out.println("Telefone: ");
					int telefoneDig2 = sc.nextInt();
					sc.nextLine();
					
					System.out.println("Empresa: ");
					String empresaDig = sc.nextLine();
					
					System.out.println("E-mail: ");
					String emailDig = sc.nextLine();
					
					ContatoComercial comercial = new ContatoComercial(nomeDig2, telefoneDig2, empresaDig, emailDig);
					contatos.add(comercial);
					
					System.out.println("\nContato comercial adicionado com sucesso");
					
				}else {
					System.out.println("\nOpcao invalida");
				}
				
				break;
				
			case 2:
				
				if(contatos.isEmpty()) {
					System.out.println("\nLista vazia");
					
				}else {
				    for (int i = 0; i < contatos.size(); i++) {
                        System.out.print("\n[" + i + "] "); 
                        contatos.get(i).exibirDados();
						
					}
					System.out.println("\nA quantidade de contatos registrados é de " + contatos.size() + "\n");
				}
				
				break;
				
			case 3:
                System.out.println("\n===BUSCA POR NOME===");
                System.out.print("\nQual nome deseja encontrar? ");
                String pesquisa = sc.nextLine();
                boolean encontrado = false; 
                
                for (Contato c : contatos) {
                    if (c.getNome().equalsIgnoreCase(pesquisa)) { 
                        c.exibirDados();
                        encontrado = true;
                    }
                }
                
                if (!encontrado) {
                    System.out.println("\nContato não encontrado.");
                }
                break;
                
            case 4:
                System.out.println("\n===CONTATOS CADASTRADOS===");
                if (contatos.isEmpty()) {
                    System.out.println("\nLista vazia.");
                } else {
                    for (int i = 0; i < contatos.size(); i++) {
                        System.out.print("\n[" + i + "] "); 
                        contatos.get(i).exibirDados();
                    }
                    
                    System.out.println("\n===REMOVER CONTATO===");
                    System.out.print("\nQual contato deseja remover(por numero de registro, Ex: 0, 1, 2)? ");
                    int indexRemover = sc.nextInt();
                    sc.nextLine(); 
                    
                    if (indexRemover >= 0 && indexRemover < contatos.size()) {
                        contatos.remove(indexRemover);
                        System.out.println("\ncontato removido com sucesso!");
                    } else {
                        System.out.println("\nNúmero inválido!");
                    }
                }
                break;
                
            case 5:
                System.out.println("\nSaindo...");
                break;
                
            default:
                System.out.println("\nOpção Inválida...");
			
			}
			
		}while(opcao !=5);
	
		sc.close();
		
	}

}
