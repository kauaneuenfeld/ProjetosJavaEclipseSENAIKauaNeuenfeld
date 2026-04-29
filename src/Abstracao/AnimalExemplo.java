package Abstracao;

public abstract class AnimalExemplo {

	private String nome;

	public AnimalExemplo(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//metodo abstrato, sem corpo e a classe filha é obrigada a implementar
	public abstract void emitirSom();
		
	
	//metodo normal ou concreto filha so herda
	public void dormi() {
		System.out.println(nome +" esta dormindo ");
	}
	
}
