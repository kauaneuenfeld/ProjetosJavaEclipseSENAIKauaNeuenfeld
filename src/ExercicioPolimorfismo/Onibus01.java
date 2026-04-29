package ExercicioPolimorfismo;

public class Onibus01 extends Transporte01{

	private int NumeroLinhas;

	public Onibus01(double distancia, int passageiro, int numeroLinhas) {
		super(distancia, passageiro);
		NumeroLinhas = numeroLinhas;
	}

	public int getNumeroLinhas() {
		return NumeroLinhas;
	}

	public void setNumeroLinhas(int numeroLinhas) {
		NumeroLinhas = numeroLinhas;
	}
	@Override
	public double CalcularCusto() {
		return getDistancia() * 0.80;
		
	}
	@Override
	public void ExibirDados() {
		System.out.println("==ONIBUS==");
		System.out.println("Distância: " + getDistancia() + " km");
	    System.out.println("Passageiros: " + getPassageiro());
	    System.out.println("Número da linha: " + NumeroLinhas);
	    System.out.println("Custo total: R$ " + CalcularCusto());
	
	}
}
