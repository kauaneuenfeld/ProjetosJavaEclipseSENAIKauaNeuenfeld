package ExercicioPolimorfismo;

public class Carro01 extends Transporte01{

	private String TipoCombustivel;

	public Carro01(double distancia, int passageiro, String tipoCombustivel) {
		super(distancia, passageiro);
		TipoCombustivel = tipoCombustivel;
	}

	public String getTipoCombustivel() {
		return TipoCombustivel;
	}

	public void setTipoCombustivel(String tipoCombustivel) {
		TipoCombustivel = tipoCombustivel;
	}
	
	@Override 
	public double CalcularCusto() {
		return getDistancia() * 1.50;
	}
	
	@Override
	public void ExibirDados() {
		System.out.println("==CARRO==");
		System.out.println("Distância: " + getDistancia() + " km");
		System.out.println("Passageiros: " + getPassageiro());
		System.out.println("Tipo de combustível: " + TipoCombustivel);
		System.out.println("Custo total: R$ " + CalcularCusto());
		}

	}
	

