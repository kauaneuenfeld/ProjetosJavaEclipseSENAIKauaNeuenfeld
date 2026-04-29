package heranca;

public class HerancaCarro extends herancaVeiculo{
	
	private int quantidadePortas;

	public HerancaCarro(String marca, String modelo, int ano, int quantidadePortas) {
		super(marca, modelo, ano);
		this.quantidadePortas = quantidadePortas;
	}

	public int getQuantidadePortas() {
		return quantidadePortas;
	}

	public void setQuantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}
	
	@Override
	public void ExibirDados() {
		super.ExibirDados();
		System.out.println("Quantidade: " + quantidadePortas);
	}
	
}
