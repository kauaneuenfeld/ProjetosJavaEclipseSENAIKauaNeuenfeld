package AbstracaoExercicio;

public abstract class Pessoa {

	private String nome;

	public Pessoa(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public abstract void Apresentar();
	
	public void Saudacao() {
		System.out.println("\nOlá, meu nome é " + nome);
	}
	
}
