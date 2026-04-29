package excecoes;

import java.util.Scanner;

public class Exemplo03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Digite o primeiro numero: ");
			int n1 = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Digite o segundo numero: ");
			int n2 = sc.nextInt();
			sc.nextLine();
			
			int soma = n1 + n2;
			
			System.out.println("A soma é: " + soma);
			
			
		}catch(Exception e) {
			System.out.println("Erro! Digite apenas numeros inteiros");
			
			
		}
		System.out.println("Programa finalizado");
		
		sc.close();
		
	}

}
