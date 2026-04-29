package ExercicioEncapsulamento;

public class Exercicio04Main {

	public static void main(String[] args) {
		
		Exercicio04 ex4 = new Exercicio04("Jetta", 2011, 90);
		
		ex4.VelocidadeAtual();
		
		ex4.acelerar(50);
		ex4.frear(100);
		
		ex4.VelocidadeAtual();
	}

}
