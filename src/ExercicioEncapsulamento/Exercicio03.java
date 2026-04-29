package ExercicioEncapsulamento;

public class Exercicio03 {
	
	private String titular;
	private double saldo;
	
	public Exercicio03(String titular, double saldo) {
		
		this.titular = titular;
		this.saldo = saldo;
		
		
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	void depositar (double valor) {
		saldo+= valor;
		System.out.println("Voce depositou R$"+valor+", seu saldo agora é de R$" + saldo);
	}
	
	void sacar(double saque) {
		if(saldo <=0) {
			System.out.println("Saldo negativo");
		}else {
			saldo -= saque;
			System.out.println("Voce sacou R$" + saque );
			}
		}
	void MostrarSaldo() {
		System.out.println("Seu saldo atual é de R$" +saldo);
	
	}
}
