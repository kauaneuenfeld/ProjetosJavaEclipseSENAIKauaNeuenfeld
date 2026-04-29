package PolimorfismoExemplo;

public class Pagamento {

	private String titular;
	private double valor;
	
	public Pagamento(String titular, double valor) {
		this.titular = titular;
		this.valor = valor;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	//Classes filhas vao sobrescrever
	public void processarPagamento() {
		System.out.println("PROCESSANDO PAGAENTO\n");
		System.out.println("Titular: " + titular);
		System.out.println("Valor: R$" + String.format("%.2f", valor));
		System.out.println("Pagamento PROCESSADO!");
	}
	
	//Classes filhas vao sobrescrever
	//metodo sem void, deve teve ter return
	public double calcularTaxa() {
		return valor * 0.02;//taxa de 2%
		
	}
	
	public void exibirDados() {
		System.out.println("Titular: " + titular);
		System.out.println("Valor: R$" + String.format("%.2f", valor));
		
	}
	
}
