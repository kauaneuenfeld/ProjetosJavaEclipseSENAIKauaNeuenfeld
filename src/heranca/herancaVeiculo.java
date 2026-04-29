package heranca;

public class herancaVeiculo {
	
	private String marca;
	private String modelo;
	private int ano;
	
	//construtor
	public herancaVeiculo(String marca, String modelo, int ano) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	
	}
	// getter e setter

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public void ExibirDados() {
		System.out.println("--DADOS--");
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Ano: " + ano);
	}
	
}
