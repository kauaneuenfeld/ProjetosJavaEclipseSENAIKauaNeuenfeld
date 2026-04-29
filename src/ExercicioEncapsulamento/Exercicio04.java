package ExercicioEncapsulamento;

public class Exercicio04 {
	
	private String modelo;
	private int ano;
	private int velocidade;
	
	public Exercicio04(String modelo, int ano, int velocidade) {
		
		this.modelo = modelo;
		this.ano =ano;
		this.velocidade = velocidade;
		
		
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

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	void acelerar(double aumentovelocidade) {
		velocidade += aumentovelocidade;
		System.out.println("Você esta acelerando, sua velocidade atula é de " + velocidade + "Km/h");
	}
	
	void frear (double freando) {
		if(velocidade <=0) {
			System.out.println("Você parou");
		}else {
			velocidade -= freando;
			System.out.println("Você esta freiando, sua velocidade diminuiu para " + velocidade + "Km/h");
		}
	}
	
	void VelocidadeAtual() {
		System.out.println("Sua velocidade atual do " + modelo + " " + ano + " é de " + velocidade + "Km/h");
	}
	
}
