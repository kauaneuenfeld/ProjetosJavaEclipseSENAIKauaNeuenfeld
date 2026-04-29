package ExercicioPolimorfismo;

public class Bicicleta01 extends Transporte01{

	private String TipoFreio;

	public Bicicleta01(double distancia, int passageiro, String tipoFreio) {
		super(distancia, passageiro);
		TipoFreio = tipoFreio;
	}

	public String getTipoFreio() {
		return TipoFreio;
	}

	public void setTipoFreio(String tipoFreio) {
		TipoFreio = tipoFreio;
	}
	@Override
	public double CalcularCusto() {
		return getDistancia() * 0.0;
		
	}
	@Override
	public void ExibirDados() {
		System.out.println("==BICICLETA==");
		System.out.println("Distância: " + getDistancia() + " km");
		System.out.println("Passageiros: " + getPassageiro());
		System.out.println("Tipo de freio: " + TipoFreio);
		System.out.println("GRATUITO!");
	}
}
