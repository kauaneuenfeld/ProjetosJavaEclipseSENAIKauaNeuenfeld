package ExercicioPolimorfismo;

public class Programador03 extends Funcionario03{

	private int horaExtra;
	private double valorHoraExtra;
	
	public Programador03(String nome, double salarioBase, int horaExtra, double valorHoraExtra) {
		super(nome, salarioBase);
		this.horaExtra = horaExtra;
		this.valorHoraExtra = valorHoraExtra;
	}

	public int getHoraExtra() {
		return horaExtra;
	}

	public void setHoraExtra(int horaExtra) {
		this.horaExtra = horaExtra;
	}

	public double getValorHoraExtra() {
		return valorHoraExtra;
	}

	public void setValorHoraExtra(double valorHoraExtra) {
		this.valorHoraExtra = valorHoraExtra;
	}
	
	public double calcularSalario() {
        return getSalarioBase() + (horaExtra * valorHoraExtra);
	}
	
	public void exibirContracheque() {
	
        System.out.println("\n===CONTRACHEQUE - PROGRAMADOR===");
        System.out.println("Nome: " + getNome());
        System.out.println("Salário Base: R$ " + getSalarioBase());
        System.out.println("Horas Extras: " + horaExtra);
        System.out.println("Valor Hora Extra: R$ " + valorHoraExtra);
        System.out.println("Salário Total: R$ " + calcularSalario());
		}
}
