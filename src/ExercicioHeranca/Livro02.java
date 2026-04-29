package ExercicioHeranca;

public class Livro02  extends Produto02{

	private String autor;

	public Livro02(String nome, double preco, int quantidade, String autor) {
		super(nome, preco, quantidade);
		this.autor = autor;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	@Override
	public void ExibirDados() {
		super.ExibirDados();
		System.out.println("Autor: " + autor);
	}
}
