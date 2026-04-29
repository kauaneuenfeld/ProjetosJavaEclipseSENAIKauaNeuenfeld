package ExercicioConexaoBd;

import java.sql.Connection;
import java.sql.DriverManager;

public class TesteConexaoProdutos {

	public static void main(String[] args) {
		 try {
		 Connection conn = DriverManager.getConnection(
           
		"jdbc:mysql://localhost:3306/CadastroDeProdutos?useSSL=false&serverTimezone=UTC",
		 "root",                                                                
		 "root"
		 );
		 System.out.println("Conectado com sucesso!");

		} catch (Exception e) {
		 System.out.println("Erro: " + e.getMessage());
		 }
		 }
		}
