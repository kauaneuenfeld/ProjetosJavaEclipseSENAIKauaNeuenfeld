package ExercicioPolimorfismo;

import java.util.*;

public class Main01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Transporte01> transporte = new ArrayList<>();
		
		int opcao;
		
		do {
			
			System.out.println("==MENU==");
			System.out.println("1. Adicionar carro");
			System.out.println("2. Adicionar Onibus");
			System.out.println("3. Adicionar bicicleta");
			System.out.println("4. Listar todos os transportes");
			System.out.println("5. Calcular custo de todos");
			System.out.println("0. Sair");
			System.out.println("Escolha: ");
			opcao = sc.nextInt();
			sc.nextLine();
			
			switch(opcao) {
			
			case 1:
				
				System.out.println("\n==CARRO==");
				System.out.println("Qual a distancia percorrida(em km)? ");
				double Distancia = sc.nextDouble();
				sc.nextLine();
				System.out.println("Qual a quantidade de passageiros(Max. 5)? ");
				int passageiro = sc.nextInt();
				sc.nextLine();
				System.out.println("Qual tipo de combustivel? ");
				String combustivel = sc.nextLine();
				
				Transporte01 car = new Carro01(Distancia, passageiro, combustivel);
				car.CalcularCusto();
				car.ExibirDados();
				transporte.add(car);
				
				break;
				
			case 2:
				

				System.out.println("\n==ONIBUS==");
				System.out.println("Qual a distancia percorrida(em km)? ");
				Distancia = sc.nextDouble();
				sc.nextLine();
				System.out.println("Qual a quantidade de passageiros? ");
				passageiro = sc.nextInt();
				sc.nextLine();
				System.out.println("Qual o numero da linha? ");
				int Linha = sc.nextInt();
				sc.nextLine();
				
				Transporte01 busao = new Onibus01(Distancia, passageiro, Linha);
				busao.CalcularCusto();
				busao.ExibirDados();
				transporte.add(busao);
				
				break;
				
			case 3:
				

				System.out.println("\n==BICICLETA==");
				System.out.println("Qual a distancia percorrida(em km)? ");
				Distancia = sc.nextDouble();
				sc.nextLine();
				System.out.println("Qual a quantidade de passageiros(Max. 2)? ");
				passageiro = sc.nextInt();
				sc.nextLine();
				System.out.println("Qual tipo de freio? ");
				String freio = sc.nextLine();
				
				Transporte01 gios = new Bicicleta01(Distancia, passageiro, freio);
				gios.ExibirDados();
				transporte.add(gios);
				
				break;
				
			case 4:
				
				if(transporte.isEmpty()) {
					System.out.println("\nLISTA VAZIA!");
					
				}else {
					System.out.println("\n==TODOS OS TRANSPORTES==");
					for (int i = 0; i < transporte.size(); i++) {
                        System.out.println("\n--- Transporte #" + (i + 1) + " ---");
                        transporte.get(i).ExibirDados();
                    }
                }
				
				break;
				
			case 5:
			    if (transporte.isEmpty()) {
			        System.out.println("\nLISTA VAZIA!");
			    } else {
			        double total = 0;
			        System.out.println("\n==CUSTO DE TODOS OS TRANSPORTES==");
			        for (int i = 0; i < transporte.size(); i++) {
			            double custo = transporte.get(i).CalcularCusto();
			            total += custo;
			            System.out.println("Transporte #" + (i + 1) + ": R$ " + String.format("%.2f", custo));
			        }
			        System.out.println("\nCUSTO TOTAL: R$ " + String.format("%.2f", total));
			    }
			    break;
				
			case 0:
				
				System.out.println("Saindo...");
	            break;

	        default:
	            System.out.println("❌ Opção inválida!");
	            
			}
			
			
			
		}while(opcao !=0);
		
		sc.close();
	}

}
