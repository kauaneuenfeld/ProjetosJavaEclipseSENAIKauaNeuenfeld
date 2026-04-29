package PolimorfismoExemplo;

public class Boleto extends Pagamento{

	private String CodigoBarras;

	public Boleto(String titular, double valor, String codigoBarras) {
		super(titular, valor);
		CodigoBarras = codigoBarras;
	}

	public String getCodigoBarras() {
		return CodigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		CodigoBarras = codigoBarras;
	}
	
	@Override
	public void processarPagamento() {
		System.out.println("PROCESSANDO BOLETO\n");
		System.out.println("Titular: " + getTitular());
		System.out.println("Valor: R$" + String.format("%.2f", getValor()));
		System.out.println("Codigo de barras: " + CodigoBarras);
		
		System.out.println("Taxa: R$" + String.format("%.2f", calcularTaxa()));
		System.out.println("Total: R$" + String.format("%.2f", getValor() + calcularTaxa()));
		System.out.println("Boleto gerado! vencimento 3 dias!");
	
	}
	
	@Override
	public double calcularTaxa() {
		return 2.50;
	}
}
