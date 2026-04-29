package ExercicioEncapsulamento;

public class Exercicio01 {
	
	private String nome;
	private int idade;
	
	public Exercicio01(String nome, int idade) {
		
		this.nome =nome;
		this.idade = idade;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	void Apresentar() {
		System.out.println("Olá, meu nome é " + nome + " e tenho " + idade +" anos.");
	}
	
}
