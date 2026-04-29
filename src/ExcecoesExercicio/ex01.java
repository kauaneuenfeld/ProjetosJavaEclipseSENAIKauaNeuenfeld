package ExcecoesExercicio;

public class ex01 {

	public static void main(String[] args) {
		
		int n1 = 66;
		int n2 = 2;
		
		try {
            int resultado = n1 / n2;
            System.out.println("Resultado da divisão: " + resultado);
        } catch (Exception e) {
            System.out.println("Erro: divisão por zero não é permitida.");
        }
		
	}

}
