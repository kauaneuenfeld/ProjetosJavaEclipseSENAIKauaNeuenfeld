package ExercicioHeranca;

import java.util.Scanner;

public class TesteProdutos02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==CADASTRO LIVRO==");
		System.out.println("Nome: ");
		String nome = sc.nextLine();
		
		System.out.println("Preço: ");
		Double preco = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Quantidade: ");
		int quantidade = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Autor: ");
		String autor = sc.nextLine();
		
		Livro02 lv = new Livro02 ( nome, preco, quantidade, autor);
		
		System.out.println("==CADASTRAR ELETRONICO==");
		System.out.println("Nome: ");
		nome = sc.nextLine();
		
		System.out.println("Preço: ");
		preco = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Quantidade: ");
		quantidade = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Garantia(meses): ");
		int garantia = sc.nextInt();
		sc.nextLine();
		
		Eletronico02 el = new Eletronico02(nome, preco, quantidade, garantia);
		
		lv.ExibirDados();
		el.ExibirDados();
		
		sc.close();
	}

}
