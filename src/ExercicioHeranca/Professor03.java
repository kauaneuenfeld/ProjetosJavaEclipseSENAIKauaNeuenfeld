package ExercicioHeranca;

public class Professor03 extends Pessoa03{
	
	private String diciplina;
	private double salario;
	
	public Professor03(String nome, String cpf, int idade, String diciplina, double salario) {
		super(nome, cpf, idade);
		this.diciplina = diciplina;
		this.salario = salario;
	}

	public String getDiciplina() {
		return diciplina;
	}

	public void setDiciplina(String diciplina) {
		this.diciplina = diciplina;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	@Override
	public void ExibirDados() {
		super.ExibirDados();
		System.out.println("PROFESSOR");
		System.out.println("Disciplina: " + diciplina);
		System.out.println("Salário: " + salario);
	}
	
}
