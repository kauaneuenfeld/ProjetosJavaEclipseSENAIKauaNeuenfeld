package ExercicioConexaoBd;

import java.util.List;
import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("Informe o titulo do jogo: ");
			String TituloDig = sc.nextLine();
			
			System.out.println("Qual é a plataforma do jogo? ");
			String PlataformaDig = sc.nextLine();
			
			System.out.println("Qual o genero do jogo? ");
			String GeneroDig = sc.nextLine();
			
			System.out.println("Qual o ano lançamento do jogo? ");
			int anoLancamentoDig = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Qual o preço do jogo? ");
			Double precoAluguelDig = sc.nextDouble();
			sc.nextLine();
			
			Game g = new Game(TituloDig, PlataformaDig, GeneroDig, anoLancamentoDig, precoAluguelDig);
			
			GameDAO gDAO = new GameDAO();
			
			gDAO.inserir(g);
			
			List<Game> lista = gDAO.listar();
			
			for(Game G : lista) {
				System.out.println(G);
			}
			
		}catch(Exception e) {
			System.out.println("Erro no banco: " + e.getMessage());
		}finally {
			System.out.println("FINALIZADO");
		}
		
		sc.close();
		
	}

}
