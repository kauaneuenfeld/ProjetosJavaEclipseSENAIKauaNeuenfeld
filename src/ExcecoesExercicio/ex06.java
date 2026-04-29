package ExcecoesExercicio;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite sua senha: ");
            String senha = sc.nextLine();

            if (senha.length() < 6) {
                throw new Exception("Senha inválida: deve ter pelo menos 6 caracteres.");
            } else {
                System.out.println("Senha válida");
            }

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            System.out.println("Programa encerrado.");
            sc.close();
        }
    }
}

