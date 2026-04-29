package ExercicioPolimorfismo;

import java.util.*;

public class Main03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Funcionario03> funcionarios = new ArrayList<>();
		
		int opcao;
		
		do {
			 System.out.println("\n===MENU===");
			 System.out.println("1. Cadastrar Gerente");
			 System.out.println("2. Cadastrar Vendedor");
			 System.out.println("3. Cadastrar Programador");
			 System.out.println("4. Listar todos os contracheques");
			 System.out.println("5. Calcular folha de pagamento total");
			 System.out.println("6. Buscar funcionário por nome");
			 System.out.println("0. Sair");
			 System.out.print("Escolha uma opção: ");
			 opcao = sc.nextInt();
			 sc.nextLine(); 

			 switch (opcao) {
			 	case 1:
			 		
			 		System.out.println("\n===CADASTRO GERENTE===");
			 		System.out.print("Nome: ");
			 		String nomeGerente = sc.nextLine();
			 		System.out.print("Salário Base: ");
			 		double salarioGerente = sc.nextDouble();
			 		System.out.print("Bônus Fixo: ");
			 		double bonusGerente = sc.nextDouble();
			 		
			 		Funcionario03 g = new Gerente03(nomeGerente, salarioGerente, bonusGerente);
			 		g.exibirContracheque();
			 		funcionarios.add(g);
			 		System.out.println("Gerente cadastrado com sucesso!");
			 		break;

			 	case 2:
			 		
			 		System.out.println("\n===CADASTRO VENDEDOR===");
			 		System.out.print("Nome: ");
			 		String nomeVendedor = sc.nextLine();
			 		System.out.print("Salário Base: ");
			 		double salarioVendedor = sc.nextDouble();
			 		System.out.print("Total de Vendas: ");
			 		double vendas = sc.nextDouble();
			 		System.out.print("Comissão (%): ");
			 		double comissao = sc.nextDouble() / 100;

			 		Funcionario03 v = new Vendedor03(nomeVendedor, salarioVendedor, vendas, comissao);
			 		v.exibirContracheque();
			 		funcionarios.add(v);
			 		System.out.println("Vendedor cadastrado com sucesso!");
			 		break;

			 	case 3:
			 		
			 		System.out.println("\n===CADASTRO PROGRAMADOR===");
			 		System.out.print("Nome: ");
			 		String nomeProgramador = sc.nextLine();
			 		System.out.print("Salário Base: ");
			 		double salarioProgramador = sc.nextDouble();
			 		System.out.print("Horas Extras: ");
			 		int horas = sc.nextInt();
			 		System.out.print("Valor Hora Extra: ");
			 		double valorHora = sc.nextDouble();

			 		Funcionario03 p = new Programador03(nomeProgramador, salarioProgramador, horas, valorHora);
			 		p.exibirContracheque();
			 		funcionarios.add(p);
			 		System.out.println("Programador cadastrado com sucesso!");
			 		break;

			 	case 4:
	                	
			 		if(funcionarios.isEmpty()) {
	                		System.out.println("\nNenhum funcionario cadastrado");
	                	}else {
	                		
	                    System.out.println("\n=== CONTRACHEQUES ===");
	                    for (Funcionario03 c : funcionarios) {
	                        c.exibirContracheque();
	                    		}
	                    }
	                    break;

	                case 5:
	                    double totalFolha = 0;
	                    for (Funcionario03 f : funcionarios) {
	                        totalFolha += f.calcularSalario();
	                    }
	                    System.out.println("Folha de pagamento total: R$ " + totalFolha);
	                    break;

	                case 6:
	                    System.out.print("Digite o nome do funcionário: ");
	                    String busca = sc.nextLine();
	                    boolean encontrado = false;
	                    for (Funcionario03 nome : funcionarios) {
	                        if (nome.getNome().equalsIgnoreCase(busca)) {
	                            nome.exibirContracheque();
	                            encontrado = true;
	                        }
	                    }
	                    if (!encontrado) {
	                        System.out.println("Funcionário não encontrado.");
	                    }
	                    break;

	                case 0:
	                    System.out.println("Encerrando o programa...");
	                    break;

	                default:
	                    System.out.println("Opção inválida!");
	            }
			
			
		}while(opcao!=0);
		
		sc.close();
	}

}
