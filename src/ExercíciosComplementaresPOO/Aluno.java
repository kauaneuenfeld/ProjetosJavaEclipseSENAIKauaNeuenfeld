package ExercíciosComplementaresPOO;

public class Aluno {

	private String nome;
	private double nota1;
	private double nota2;
	
	public Aluno(String nome, double nota1, double nota2) {
		
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome
			) {
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
	        return (nota1 + nota2) / 2;
	  }
	  
	  public String ObterSituacao() {
	        double media = calcularMedia();		  
	        if(media >= 7) {
	        	return "APROVADO!";
	        	
	        }else {
	        	return "REPROVADO!";
	        }
	  }
	
	  public void ExibirDados() {
		  System.out.println("\nNome: " + nome);
		  System.out.println("Nota 1: " + nota1);
	      System.out.println("Nota 2: " + nota2);
	      System.out.println("Média: " + calcularMedia());
	      System.out.println("Situação: " + ObterSituacao());
	  }
}
