package PolimorfismoExemplo;

public class Pix extends Pagamento{

	private String ChavePix;

	public Pix(String titular, double valor, String chavePix) {
		super(titular, valor);
		ChavePix = chavePix;
	}

	public String getChavePix() {
		return ChavePix;
	}

	public void setChavePix(String chavePix) {
		ChavePix = chavePix;
	}
	
	@Override
	public void processarPagamento() {
		System.out.println("PROCESSANDO PIX\n");
		System.out.println("Titular: " + getTitular());
		System.out.println("Valor: R$" + String.format("%.2f", getValor()));
		System.out.println("Chave PIX: " + ChavePix);
		
		System.out.println("Taxa: R$" + String.format("%.2f", calcularTaxa()));
		System.out.println("Total: R$" + String.format("%.2f", getValor() + calcularTaxa()));
		System.out.println("Transferencia PIX realizada!");
		
	}
	
	@Override
	public double calcularTaxa() {
		return 0.0;
		
	}
}
