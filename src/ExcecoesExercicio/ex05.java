package ExcecoesExercicio;

import java.util.Scanner;

public class ex05 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite sua idade: ");
            int idade = scanner.nextInt();

            if (idade < 18) {
                // Lançando uma exceção manualmente
                throw new Exception("Erro: idade menor que 18. Acesso negado.");
            }

            System.out.println("Acesso permitido.");
        } catch (Exception e) {
            // Tratando a exceção lançada
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Programa encerrado.");
            scanner.close();
        }
    }
}
	
	
