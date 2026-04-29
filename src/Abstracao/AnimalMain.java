package Abstracao;

public class AnimalMain {

	public static void main(String[] args) {
		
		AnimalExemplo c = new Cachorro("BOLINHA");
		
		AnimalExemplo g = new Gato("MORUGUEICHON");
		
		c.emitirSom();
		g.emitirSom();
		c.dormi();
		
	}

}
