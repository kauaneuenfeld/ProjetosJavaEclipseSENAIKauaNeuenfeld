package ToStringTeste;

public class ToStringTeste {

	private String nome;
	private int idade;
	
	public ToStringTeste(String nome, int idade) {
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
	
	//metodo toString, sobreescreve o object do java
	public String toString() {
		return "\nnome: " + nome + "\nIdade: "+ idade;
		
	}
	
}
