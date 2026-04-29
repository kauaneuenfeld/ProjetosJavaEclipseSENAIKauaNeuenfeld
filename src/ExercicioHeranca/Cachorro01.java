package ExercicioHeranca;

public class Cachorro01 extends Animais01{

	private String raca;

	public Cachorro01(String nome, int idade, String raca) {
		super(nome, idade);
		this.raca = raca;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	@Override
	public void ExibirDados() {
		super.ExibirDados();
		System.out.println("Raça: " + raca);
	}
	
}
