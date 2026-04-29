package heranca;

public class herancaMoto extends herancaVeiculo {
	
	private int cilindradas;

	public herancaMoto(String marca, String modelo, int ano, int cilindradas) {
		super(marca, modelo, ano);
		this.cilindradas = cilindradas;
	}

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}
	
	@Override //indica que o metodo esta sendo sobrescrito
	public void ExibirDados() {
		super.ExibirDados();
		System.out.println("Cilindradas: " + cilindradas);
	}
	
}
