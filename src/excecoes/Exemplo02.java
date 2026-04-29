package excecoes;

public class Exemplo02 {

	public static void main(String[] args) {
		
		try {
			int idade = 15;
			if(idade < 18) {
				throw new Exception("Idade invalida");
			}
			
		}catch(Exception e) {
			System.out.println("erro: " + e.getMessage());
			
		}
			
		System.out.println("O sistema continua");
		//throw Cria o ERRO
		//catch resolveo erro
		}
	
	}


