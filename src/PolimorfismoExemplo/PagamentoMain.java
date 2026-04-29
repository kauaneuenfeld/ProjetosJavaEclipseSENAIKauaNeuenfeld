package PolimorfismoExemplo;

import java.util.*;

public class PagamentoMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Pagamento> pagamentos = new ArrayList<>();
		
		int opcao;
		
		do {
			
			System.out.println("==MENU PRINCIPAL==");
			
			System.out.println("1. Pagar com cartão de crédito");
			System.out.println("2. Pagar com PIX");
			System.out.println("3. Pagar com boleto");
			System.out.println("4. Listar todos os pagamentos");
			System.out.println("5. Calcular total de taxas");
			System.out.println("0. Sair");
			System.out.println("Escolha: ");
			opcao = sc.nextInt();
			sc.nextLine();
			
			switch(opcao) {
			
			case 1:
				
				System.out.println("==PAGAMENTO COM CARTÃO==");
				System.out.println("Titular: ");
				String titular = sc.nextLine();
				System.out.println("Valor: R$");
				double valor = sc.nextDouble();
				sc.nextLine();
				System.out.println("Numero do cartão(16 digitos): ");
				String numero = sc.nextLine();
				
				//Poliformismo: Tipo pagamento, objeto CartaoCredito
				Pagamento c = new CartaoCredito(titular, valor, numero);
				c.processarPagamento();
				c.calcularTaxa();
				pagamentos.add(c);
				
				break;
				
			case 2:
				
				System.out.println("==PAGAMENTO COM PIX==");
				System.out.println("Titular: ");
				String titularPIX = sc.nextLine();
				System.out.println("Valor: R$");
				double valorPIX = sc.nextDouble();
				sc.nextLine();
				System.out.println("Chave PIX: ");
				String numeroPIX = sc.nextLine();
				
				Pagamento p = new Pix(titularPIX, valorPIX, numeroPIX);
				p.processarPagamento();
				p.calcularTaxa();
				pagamentos.add(p);
				
				break;
				
			case 3:
				
				System.out.println("==PAGAMENTO COM BOLETO==");
				System.out.println("Titular: ");
				String titularBoleto = sc.nextLine();
				System.out.println("Valor: R$");
				double valorBoleto = sc.nextDouble();
				sc.nextLine();
				System.out.println("Codigo de barras: ");
				String numeroBoleto = sc.nextLine();
				
				Pagamento b = new Boleto(titularBoleto, valorBoleto, numeroBoleto);
				b.processarPagamento();
				b.calcularTaxa();
				pagamentos.add(b);
				
				break;
				
			case 4:
				
				if (pagamentos.isEmpty()) {
                    System.out.println("\nNenhum pagamento realizado ainda!");
                } else {
                    System.out.println("\n═══ TODOS OS PAGAMENTOS ═══");
                    for (int i = 0; i < pagamentos.size(); i++) {
                        System.out.println("\n--- Pagamento #" + (i + 1) + " ---");
                        // POLIMORFISMO EM AÇÃO!
                        // Cada objeto chama SUA versão do método!
                        pagamentos.get(i).processarPagamento();
                    }
                }
				
				break;
				
			case 5:
				
				 if (pagamentos.isEmpty()) {
                     System.out.println("\nNenhum pagamento realizado ainda!");
                 } else {
                     double totalTaxas = 0;
                     System.out.println("\n═══ TAXAS POR PAGAMENTO ═══");
                     for (int i = 0; i < pagamentos.size(); i++) {
                         // POLIMORFISMO EM AÇÃO!
                         // Cada classe calcula sua taxa de forma diferente!
                         double taxa = pagamentos.get(i).calcularTaxa();
                         totalTaxas += taxa;
                         System.out.println("Pagamento #" + (i + 1) + ": R$ " + 
                                          String.format("%.2f", taxa));
                     }
                     System.out.println("\nTOTAL DE TAXAS: R$ " + 
                                      String.format("%.2f", totalTaxas));
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
