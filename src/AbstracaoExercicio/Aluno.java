package AbstracaoExercicio;

public class Aluno extends Pessoa{
	
	private String curso;

	public Aluno(String nome, String curso) {
		super(nome);
		this.curso = curso;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public void Apresentar() {
		System.out.println("\nSou aluno do curso de " + curso);
	}

}
