package ExercicioPolimorfismo;

public class Leao02 extends Animais02{

	public Leao02(String nome, int idade, double peso) {
		super(nome, idade, peso);
	}

	@Override
	public void emitirSom() {
		System.out.println("ROOOOOOAAARRRRRR");
	}
	
	@Override
	 public String getTipoAlimento() {
        return "Carnívoro - Carne";
    }
	
	public void Rugir() {
		System.out.println("O leão esta rugindo!!!!");
	}
	@Override
	public void ExibirInfo() {
	    System.out.println("\n==LEÃO==");
	    System.out.println("Nome: " + getNome());
	    System.out.println("Idade: " + getIdade() + " anos");
	    System.out.printf("Peso: ", getPeso());
	    System.out.println("Dieta: " + getTipoAlimento());
	}

}
