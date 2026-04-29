package ExercicioEncapsulamento;

public class Exercicio03Main {

	public static void main(String[] args) {
		
		Exercicio03 ex3 = new Exercicio03("Kauã", 5000);
		
		ex3.depositar(1000);
		ex3.sacar(4000);
		
		ex3.MostrarSaldo();
	}

}
