package ExercicioHeranca;

public class Aluno03 extends Pessoa03{
	
	private int matricula;
	private String curso;
	
	public Aluno03(String nome, String cpf, int idade, int matricula, String curso) {
		super(nome, cpf, idade);
		this.matricula = matricula;
		this.curso = curso;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	@Override
	public void ExibirDados() {
		super.ExibirDados();
		System.out.println("ALUNO");
		System.out.println("Matricula: " + matricula);
		System.out.println("Curso: " + curso);
	}

}
