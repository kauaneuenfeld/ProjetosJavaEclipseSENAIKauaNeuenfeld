package AbstracaoExercicio;

public class PessoaMain {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno("Kauã", "Engenharia de Software");
          
        Professor professor = new Professor("dede", "java");
        
        aluno.Saudacao();      
        aluno.Apresentar();
        
        System.out.println("\n");
        
        professor.Saudacao();   
        professor.Apresentar(); 
		
	}

}
