package Encapsulamento;

import java.util.Scanner;

public class ExemploEncapsulamento01Main {

	public static void main(String[] args) {
		
		/*
		ExemploEncapsulamento01 ex1 = new ExemploEncapsulamento01("Natalino", 39, "123.456.789-10");
		
		System.out.println(ex1.getNome() + "\n" + ex1.getCpf() +"\n" +ex1.getIdade());
		
		ex1.setIdade(99);
		System.out.println(ex1.getIdade());
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = sc.nextLine();
		
		System.out.println("Digite sua idade: ");
		int idade = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Digite seu cpf: ");
		String cpf = sc.nextLine();
		
		ExemploEncapsulamento01 ex1 = new ExemploEncapsulamento01(nome, idade, cpf);
		
		System.out.println(ex1.getNome());
		
		sc.close();
	}
}

