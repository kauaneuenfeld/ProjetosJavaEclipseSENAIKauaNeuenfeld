package ExercicioPolimorfismo;

public class Papagaio02 extends Animais02{

	private String corPena;

	public Papagaio02(String nome, int idade, double peso, String corPena) {
		super(nome, idade, peso);
		this.corPena = corPena;
	}

	public String getCorPena() {
		return corPena;
	}

	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}
	
	public void emitirSom() {
        System.out.println("Olá! Quero biscoito!");
    }

    @Override
    public String getTipoAlimento() {
        return "Onívoro - Sementes e frutas";
    }

    //public void falar(String frase) {
        //System.out.println("Papagaio diz: " + frase);
   // }

    @Override
    public void ExibirInfo() {
    	System.out.println("\n===PAPAGAIO===");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade() + " anos");
        System.out.println("Peso: " + getPeso() + " kg");
        System.out.println("Dieta: " + getTipoAlimento());
        System.out.println("Cor das penas: " + corPena);
    }
}
