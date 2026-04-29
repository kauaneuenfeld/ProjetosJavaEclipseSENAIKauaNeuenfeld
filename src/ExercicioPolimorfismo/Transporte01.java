package ExercicioPolimorfismo;

public class Transporte01 {

	private double distancia;
	private int passageiro;
	
	public Transporte01(double distancia, int passageiro) {
		this.distancia = distancia;
		this.passageiro = passageiro;
	}

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}

	public int getPassageiro() {
		return passageiro;
	}

	public void setPassageiro(int passageiro) {
		this.passageiro = passageiro;
	}
	
	public double CalcularCusto() {
		return distancia;
		
	}
	
	public void ExibirDados() {
		System.out.println("A distancia é de " + distancia + " km");
		System.out.println("Passageiros: " + passageiro);
	}
	
}
