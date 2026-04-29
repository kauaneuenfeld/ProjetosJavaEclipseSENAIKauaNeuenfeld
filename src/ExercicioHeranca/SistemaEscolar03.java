package ExercicioHeranca;

import java.util.*;

public class SistemaEscolar03 {

	public static void main(String[] args) {
		
		ArrayList<Pessoa03> pessoa = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		int opcao;
		
		
		do {
			System.out.println("\n=== CADASTRO DE ALUNOS ===");
			System.out.println("1. Cadastrar aluno");
			System.out.println("2. Cadastrar professor");
			System.out.println("3. Listar todos");
			System.out.println("0. Sair");
			System.out.print("Escolha: ");
			opcao = sc.nextInt();
			sc.nextLine();
			
		switch(opcao) {
		
		case 1: 
			
			System.out.println("==CADASTRO ALUNO==");
			System.out.println("Nome: ");
			String nome = sc.nextLine();
			
			System.out.println("CPF: ");
			String cpf = sc.nextLine();
			
			System.out.println("Idade: ");
			int idd = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Matricula: ");
			int matricula = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Curso: ");
			String curso = sc.nextLine();
			
			Aluno03 al = new Aluno03 (nome, cpf, idd, matricula, curso);
			pessoa.add(al);
			
			break;
			
		case 2: 
			
			System.out.println("==CADASTRO PROFESSOR==");
			System.out.println("Nome: ");
			nome = sc.nextLine();
			
			System.out.println("CPF: ");
			cpf = sc.nextLine();
			
			System.out.println("Idade: ");
			idd = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Disciplina: ");
			String disciplina = sc.nextLine();
			
			System.out.println("Salário: ");
			double salario = sc.nextDouble();
			sc.nextLine();
			
			Professor03 prof = new Professor03(nome, cpf, idd, disciplina, salario);
			pessoa.add(prof);
			
			break;
			
		case 3:
			
			if(pessoa.isEmpty()) {
				System.out.println("\nLISTA VAZIA");
				
			}else {
				for(Pessoa03 p: pessoa) {
					p.ExibirDados();
				}
			}
			break;
			
		case 0:
			 System.out.println("Saindo...");
	            break;

	        default:
	            System.out.println("❌ Opção inválida!");
		}
			
			
		}while(opcao != 0);
		
		sc.close();
	}

}
