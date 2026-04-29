package ExercicioHeranca;

public class Animais01 {

	private String nome;
	private int idade;
	
	public Animais01(String nome, int idade) {
		this.nome = nome;
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
	
	public void ExibirDados() {
		System.out.println("==DADOS DO ANIMAL==");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
	}
	
}
