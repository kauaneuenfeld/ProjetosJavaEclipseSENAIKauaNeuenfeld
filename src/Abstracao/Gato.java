package Abstracao;

public class Gato extends AnimalExemplo{

	public Gato(String nome) {
		super(nome);
	}
	
	public void emitirSom() {
		System.out.println(getNome() + " miau, miau");
	}

}
