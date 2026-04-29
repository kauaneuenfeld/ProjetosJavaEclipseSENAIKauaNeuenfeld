package ExercicioPolimorfismo;

public class Vendedor03 extends Funcionario03{

	private double totalVendas;
	private double comissao;
	
	public double getTotalVendas() {
		return totalVendas;
	}

	public void setTotalVendas(double totalVendas) {
		this.totalVendas = totalVendas;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public Vendedor03(String nome, double salarioBase, double totalVendas, double comissao) {
		super(nome, salarioBase);
		this.totalVendas = totalVendas;
		this.comissao = comissao;
	}
	
	 public double calcularSalario() {
	        return getSalarioBase() + (totalVendas * comissao);
	 }
	
	 
	  public void exibirContracheque() {
		  
	        System.out.println("\n===CONTRACHEQUE - VENDEDOR===");
	        System.out.println("Nome: " + getNome());
	        System.out.println("Salário Base: R$ " + getSalarioBase());
	        System.out.println("Total de Vendas: R$ " + totalVendas);
	        System.out.println("Comissão: " + (comissao * 100) + "%");
	        System.out.println("Salário Total: R$ " + calcularSalario());
	  }
}
