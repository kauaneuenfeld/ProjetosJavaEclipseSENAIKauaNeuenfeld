package heranca;

import java.util.Scanner;

public class herancaVeiculoMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==CADASTRO DE CARRO==");
		System.out.println("Marca: ");
		String marca = sc.nextLine();
		
		System.out.println("Modelo: ");
		String modelo = sc.nextLine();
		
		System.out.println("Ano: ");
		int ano = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Quantidade de portas: ");
		int quantidade = sc.nextInt();
		sc.nextLine();
		
		//transformando classe em objeto
		
		HerancaCarro car = new HerancaCarro(marca, modelo, ano, quantidade);
		
		System.out.println("==CADASTRO De MOTO==");
		System.out.println("Marca: ");
		marca = sc.nextLine();
		System.out.println("Modelo: ");
		modelo = sc.nextLine();
		System.out.println("Ano: ");
		ano = sc.nextInt();
		sc.nextLine();
		System.out.println("Cilindradas: ");
		int cilindradas = sc.nextInt();
		sc.nextLine();
		
		herancaMoto dt = new herancaMoto(marca, modelo, ano, cilindradas);
		
		System.out.println("\n");
		car.ExibirDados();
		
		System.out.println("\n");
		dt.ExibirDados();
		
		
		sc.close();
		
	}

}
