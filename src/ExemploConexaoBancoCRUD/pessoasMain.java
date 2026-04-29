package ExemploConexaoBancoCRUD;

import java.util.List;
import java.util.Scanner;

public class pessoasMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		pessoasDAO pessoasDAO = new pessoasDAO();
		
		int opcao;
		
		do {
			
			System.out.println("\n===MENU CRUD===");
			System.out.println("1. Inserir pessoa");
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
					System.out.println("Informe seu nome: ");
					String nomeDig = sc.nextLine();
					
					System.out.println("Informe sua idade: ");
					int idadeDig = sc.nextInt();
					sc.nextLine();
					
					System.out.println("Digite seu cpf: ");
					String cpfDig = sc.nextLine();
					
					pessoas natalino = new pessoas(nomeDig, idadeDig, cpfDig);
					
					pessoasDAO.inserir(natalino);
			
			}catch(Exception e) {
				System.out.println("Erro ao inserir: " + e.getMessage());
			}
			break;	
			
			case 2:
				try {
					
				List<pessoas> lista = pessoasDAO.listar();
				
				if(lista.isEmpty()) {
					System.out.println("Nenhuma pessoa cadastrada");
				}else {
					System.out.println("===LISTA DE PESSOAS===");
					for(pessoas p : lista) {
					System.out.println(p);
					}
				}
				
				}catch(Exception e) {
					System.out.println("Erro ao listar: " + e.getMessage());
				}
				break;
				
			case 3:
				try {
					System.out.println("ID da pessoa: ");
					int idAtualizaR = sc.nextInt();
					sc.nextLine();
					
					System.out.println("Novo nome: ");
					String novoNome = sc.nextLine();
					
					System.out.println("Nova idade: ");
					int novaIdade = sc.nextInt();
					sc.nextLine();
					
					System.out.println("Novo cpf: ");
					String novoCpf = sc.nextLine();
					
					pessoas pessoasAtualizada = new pessoas(idAtualizaR, novoNome, novaIdade, novoCpf);
					pessoasDAO.atualizar(pessoasAtualizada);
				
				}catch(Exception e) {
					System.out.println("Erro ao atualizar: " + e.getMessage());
				}
				
				break;
				
			case 4: 
				try {
					
				System.out.println("Id para excluir: ");
				int idExcluir = sc.nextInt();
				sc.nextLine();
				
				pessoasDAO.excluir(idExcluir);
					
				}catch(Exception e) {
					System.out.println("Erro ao excluir: " + e.getMessage());
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

