package ExercicioPolimorfismo;

public class Elefante02 extends Animais02{

	private double comprimentoElefante;

	public Elefante02(String nome, int idade, double peso, double comprimentoElefante) {
		super(nome, idade, peso);
		this.comprimentoElefante = comprimentoElefante;
	}

	public double getComprimentoElefante() {
		return comprimentoElefante;
	}

	public void setComprimentoElefante(double comprimentoElefante) {
		this.comprimentoElefante = comprimentoElefante;
	}
	
	@Override
	public void emitirSom() {
		System.out.println("PRRUUUUUUU!!!");
	}
	
	@Override
	public String getTipoAlimento() {
        return "Herbívoro - Folhas e frutas";
	}
	
	@Override
	public void ExibirInfo() {
		System.out.println("\n===ELEFANTE===");
	    	System.out.println("Nome: " + getNome());
	    	System.out.println("Idade: " + getIdade() + " anos");
	    	System.out.println("Peso: " + getPeso() + " kg");
	    	System.out.println("Dieta: " + getTipoAlimento());
	    	System.out.println("Comprimento do elefante: " + comprimentoElefante + " metros");
	
	 }
}
