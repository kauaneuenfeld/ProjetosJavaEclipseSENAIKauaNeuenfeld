package ExcecoesExercicio;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Digite o numero: ");
			int n1 = sc.nextInt();
			sc.nextLine();
			
			System.out.println("O numero é: " + n1);
			
			
		}catch(Exception e) {
			System.out.println("Erro! Digite apenas numeros inteiros");
			
			
		}
		System.out.println("Programa finalizado");
		
		sc.close();
		
	}

}




