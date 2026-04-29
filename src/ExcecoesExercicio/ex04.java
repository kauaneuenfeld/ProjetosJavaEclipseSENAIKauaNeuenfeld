package ExcecoesExercicio;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
			try {
				System.out.print("Digite um número inteiro: ");
	            int numero = sc.nextInt();

	            if (numero > 0) {
	                System.out.println("Número válido: " + numero);
	            } else {
	                System.out.println("Erro: o número deve ser maior que zero.");
	            }
	        } catch (Exception e) {
	            System.out.println("Entrada inválida!");
	        } 
	            sc.close();
	       
	    }
	}