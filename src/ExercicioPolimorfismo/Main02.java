package ExercicioPolimorfismo;

import java.util.*;

public class Main02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		ArrayList<Animais02> zoo = new ArrayList<>();
		
		int opcao;
		
		do {
			
			System.out.println("\n===ZOO===");
            System.out.println("1. Adicionar Leão");
            System.out.println("2. Adicionar Elefante");
            System.out.println("3. Adicionar Papagaio");
            System.out.println("4. Listar todos os animais");
            System.out.println("5. Fazer todos os animais emitirem som");
            System.out.println("6. Mostrar dieta de todos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); 
			
            
            switch(opcao) {
            	
            	case 1: 
            		
            		System.out.println("\n===ADICIOANNDO LEÃO===");
            		System.out.print("Nome do leão: ");
            		String nomeLeao = sc.nextLine();
                	System.out.print("Idade: ");
                	int idadeLeao = sc.nextInt();
                	sc.nextLine();
                	System.out.print("Peso: ");
                	double pesoLeao = sc.nextDouble();
                	sc.nextLine();
                	
                	Animais02 l = new Leao02(nomeLeao, idadeLeao, pesoLeao);
                	l.ExibirInfo();
                	zoo.add(l);
                	System.out.println("Leão adicionado!");
            		
            		break;
            		
            	case 2: 
            		
            		System.out.println("\n===ADICIOANNDO ELEFANTE===");
            		System.out.print("Nome do elefante: ");
            		String nomeElefante = sc.nextLine();
                	System.out.print("Idade: ");
                	int idadeElefante = sc.nextInt();
                	sc.nextLine();
                	System.out.print("Peso: ");
                	double pesoElefante = sc.nextDouble();
                	sc.nextLine();
                	System.out.println("Comprimento: ");
                	double comprimentoElefante = sc.nextDouble();
                	sc.nextLine();
                	
                	Animais02 e = new Elefante02(nomeElefante, idadeElefante, pesoElefante, comprimentoElefante);
                	e.ExibirInfo();
                	zoo.add(e);
                	System.out.println("Elefante adicionado!");
            		
            		break;
            		
            	case 3: 
            		
            		System.out.println("\n===ADICIOANNDO PAPAGAIO===");
            		System.out.print("Nome do papagaio: ");
            		String nomePapagaio = sc.nextLine();
                	System.out.print("Idade: ");
                	int idadePapagaio = sc.nextInt();
                	sc.nextLine();
                	System.out.print("Peso: ");
                	double pesoPapagaio = sc.nextDouble();
                	sc.nextLine();
                	System.out.println("Cor: ");
                	String corPapagaio = sc.nextLine();
                
            		
                	Animais02 p = new Papagaio02(nomePapagaio, idadePapagaio, pesoPapagaio, corPapagaio);
                	p.ExibirInfo();
                	zoo.add(p);
                	System.out.println("Papagaio adicionado!");

            		break;
            		
            	case 4: 
            		
            		if(zoo.isEmpty()) {
            			System.out.println("\nNenhum animal cadastrado");
            		}else {
            			
            		
            		System.out.println("\n===LISTA DOS ANIMAIS===");
            		for(Animais02 z : zoo) {
            			z.ExibirInfo();
            			
            			}
            		}
            		break;
            		
            	case 5: 
            		
            		  System.out.println("\n===SONS===");
                      for (Animais02 som : zoo) {
                          som.emitirSom();
                      }
            		
            		break;
            		
            	case 6: 
            		
            		System.out.println("\n--- Dieta dos Animais ---");
            		for (Animais02 diet : zoo) {
            			System.out.println(diet.getNome() + ": " + diet.getTipoAlimento());
                    }
            		break;
            		
            	case 0: 
            		 System.out.println("Encerrando programa...");
                     break;

                 default:
                     System.out.println("Opção inválida!");
                     
        }
			
		}while(opcao!=0);
		
		sc.close();
		
	}

}
