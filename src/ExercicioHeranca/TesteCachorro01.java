package ExercicioHeranca;

import java.util.Scanner;

public class TesteCachorro01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("==CADASTRO==");
		System.out.println("Nome: ");
		String nome = sc.nextLine();
		
		System.out.println("Idade: ");
		int idd = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Raca: ");
		String raca = sc.nextLine();
		
		
		
		Cachorro01 dog = new Cachorro01(nome, idd, raca);
		
		dog.ExibirDados();
		
		sc.close();
		
	}

}
