package ExercicioHeranca;

public class Eletronico02 extends Produto02{

	private int GarantiaMeses;

	public Eletronico02(String nome, double preco, int quantidade, int garantiaMeses) {
		super(nome, preco, quantidade);
		GarantiaMeses = garantiaMeses;
	}

	public int getGarantiaMeses() {
		return GarantiaMeses;
	}

	public void setGarantiaMeses(int garantiaMeses) {
		GarantiaMeses = garantiaMeses;
	}
	
	@Override
	public void ExibirDados() {
		super.ExibirDados();
		System.out.println("Garantia(meses): " + GarantiaMeses);
	}
	
}
