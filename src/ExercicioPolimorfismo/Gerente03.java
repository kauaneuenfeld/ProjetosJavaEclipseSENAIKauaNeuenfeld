package ExercicioPolimorfismo;

public class Gerente03 extends Funcionario03{

	private double bonusFixo;

	public Gerente03(String nome, double salarioBase, double bonusFixo) {
		super(nome, salarioBase);
		this.bonusFixo = bonusFixo;
	}

	public double getBonusFixo() {
		return bonusFixo;
	}

	public void setBonusFixo(double bonusFixo) {
		this.bonusFixo = bonusFixo;
	}
	
	public double calcularSalario() {
        return getSalarioBase() + bonusFixo;
    }
	
	 public void exibirContracheque() {
	        System.out.println("\n===CONTRACHEQUE - VENDEDOR===");
	        System.out.println("Nome: " + getNome());
	        System.out.println("Salário Base: R$ " + getSalarioBase());
	        System.out.println("Bônus Fixo: R$ " + bonusFixo);
	        System.out.println("Salário Total: R$ " + calcularSalario());
	    }
	
}
