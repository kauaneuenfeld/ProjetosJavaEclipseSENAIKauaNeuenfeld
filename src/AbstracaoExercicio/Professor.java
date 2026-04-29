package AbstracaoExercicio;

public class Professor extends Pessoa{

	private String disciplina;

	public Professor(String nome, String disciplina) {
		super(nome);
		this.disciplina = disciplina;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	public void Apresentar() {
		System.out.println("\nSou professor de " + disciplina);
	}
	
}
