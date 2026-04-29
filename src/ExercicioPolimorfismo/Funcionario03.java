package ExercicioPolimorfismo;

public class Funcionario03 {

	private String nome;
	private double salarioBase;
	
	public Funcionario03(String nome, double salarioBase) {
		this.nome = nome;
		this.salarioBase = salarioBase;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	public double calcularSalario() {
        return salarioBase;
        
	}
	
	 public void exibirContracheque() {
		 System.out.println("Contracheque");
		 System.out.println("Nome: " + nome);
		 System.out.println("Salário: R$ " + calcularSalario());
	 }
}
