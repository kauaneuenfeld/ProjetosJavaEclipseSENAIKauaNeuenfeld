package ExercicioEncapsulamento;

public class Exercicio05 {
	
	private String nome;
	private double nota1;
	private double nota2;
	
	public Exercicio05(String nome, double nota1, double nota2) {
		
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	
	public double calcularMedia() {
		return (nota1 + nota2)/2;
		
		
	}
	
	void MostrarSituacao() {
		double media = calcularMedia();
		
	
		if(media >=7) {
			System.out.println("Você está aprovado!!!!, sua média é de " + media);
		}else {
			System.out.println("Você foi reprovado, sua media foi de " + media);
		}
	}
}
