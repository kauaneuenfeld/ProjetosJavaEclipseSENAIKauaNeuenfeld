package ExercíciosComplementaresPOO;

import java.util.*;

public class AlunoMain {

	public static void main(String[] args) {
		
		ArrayList<Aluno> alunos = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		int opcao;
		
		do {
			System.out.println("\n=== CADASTRO DE ALUNOS ===");
			System.out.println("1. Adicionar aluno");
			System.out.println("2. Listar alunos");
			System.out.println("3. Buscar aluno por nome");
			System.out.println("4. Mostrar aprovados");
			System.out.println("5. Mostrar reprovados");
			System.out.println("6. Calcular média da turma");
			System.out.println("0. Sair");
			System.out.print("Escolha: ");
			opcao = sc.nextInt();
			sc.nextLine();
			
			
		
		switch(opcao) {
			
		case 1:
			
			System.out.println("\nDigite seu nome: ");
			String nome = sc.nextLine();
			
			System.out.println("Nota 1(de 0 a 10): ");
			double nota1 = sc.nextDouble();
			
			System.out.println("Nota 2(de 0 a 10): ");
			double nota2 = sc.nextDouble();
			
			Aluno aluno = new Aluno(nome, nota1, nota2);
			alunos.add(aluno);
			System.out.println("Aluno criado com sucesso");
			
			break;
			
		case 2:
			
			if(alunos.isEmpty()) {
				System.out.println("\nLISTA VAZIA");
			}else {
				System.out.println("\nAlunos cadastrados -> " + alunos.size());
				int i = 0;
				for (Aluno a : alunos) {
				    i++;
				    
				    a.ExibirDados();
				}

			}
			break;
			
		case 3:
			
			 System.out.println("Digite um aluno para encontrar: ");
			 String buscar = sc.nextLine();

			 boolean encontrado = false;

			 for (Aluno a : alunos) {
				 if (a.getNome().contains(buscar)) {
			            a.ExibirDados();
			            encontrado = true;
			        }
			    }

			    if (!encontrado) {
			        System.out.println("Nenhum aluno encontrado");
			    }
			    break;
			    
		case 4:
			
				int aprovados = 0;
				for(Aluno a : alunos) {
					if(a.ObterSituacao().equals("APROVADO!")) {
						System.out.println("\n");
						a.ExibirDados();;
						aprovados ++;
					}
				}
				
				System.out.println("O total de alunos aprovados é de " + aprovados);
				break;
				
		case 5:
			
			int reprovados = 0;
			for(Aluno a : alunos) {
				if(a.ObterSituacao().equals("REPROVADO!")) {
					System.out.println("\n");
					a.ExibirDados();;
					reprovados ++;
				}
			}
			
			System.out.println("O total de alunos reprovados é de " + reprovados);
			break;
			
		case 6:
			
			if(alunos.isEmpty()) {
				System.out.println("\nLISTA VAZIA");
			}else {
				System.out.println("\nAlunos cadastrados -> " + alunos.size());
				int i = 0;
				for (Aluno a : alunos) {
				    i++;
				    
				    a.ExibirDados();
				}

			}
			
			double Soma = 0;
			for(Aluno a : alunos) {
				Soma += a.calcularMedia();
				
			}
			
			double MediaTurma = Soma / alunos.size();
			System.out.println("Media da turma -> " + MediaTurma);
			
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
