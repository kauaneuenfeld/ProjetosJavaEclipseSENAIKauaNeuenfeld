package ExcecoesExercicio;

public class ex03 {

	public static void main(String[] args) {
		
        int num1 = 3;

        int num2 = 0;

        try {
            int resultado = num1 / num2;
            System.out.println("Resultado da divisão: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: divisão por zero não é permitida.");
        } finally {
            System.out.println("Execução finalizada!");
        }

       
	}

}
