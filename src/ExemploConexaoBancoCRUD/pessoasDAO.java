package ExemploConexaoBancoCRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class pessoasDAO {

	//create
	public void inserir(pessoas p) throws SQLException{
		String sql = "INSERT INTO pessoas(nome, idade, cpf) VALUES(?, ?, ?)";
		
		//try com recursos
		try(Connection conn = conexao.conectar();
				PreparedStatement stmt = conn.prepareStatement(sql)){
			
			stmt.setString(1, p.getNome());
			stmt.setInt(2, p.getIdade());
			stmt.setString(3, p.getCpf());
			
			stmt.executeUpdate();
			System.out.println("Pessoa inserida com SUCESSO!");
		}
	}
		//read listae todas as pessoas
		
		public List<pessoas> listar() throws SQLException{
			
			List<pessoas> lista = new ArrayList<>();
			String sql = "SELECT * FROM pessoas";
			
			try(Connection conn = conexao.conectar();
					Statement stmt = conn.prepareStatement(sql);
					ResultSet rs = stmt.executeQuery(sql)){
				
				while(rs.next()) {
					lista.add(new pessoas(
							rs.getInt("id"),
							rs.getString("nome"),
							rs.getInt("idade"),
							rs.getString("cpf")));
				}
				
			}
			
			return lista;
		
		}
		
		//update (atualizar) nome, idade e cpf pelo ID
		
		public void atualizar(pessoas p) throws SQLException{
			String sql = "UPDATE pessoas SET nome = ?, idade = ?, cpf = ?, WHERE id = ?";
			
			try(Connection conn = conexao.conectar();
					PreparedStatement stmt = conn.prepareStatement(sql)){
				
				stmt.setString(1, p.getNome());
				stmt.setInt(2, p.getIdade());
				stmt.setString(3, p.getCpf());
				stmt.setInt(4, p.getId());
				
				stmt.executeUpdate();
				System.out.println("DADOS ATUALIZADOS.");
			}
			
		}
		
		//delete
		public void excluir(int id) throws SQLException{
			String sql = "DELETE from pessoas WHERE id = ?";
			
			try(Connection conn = conexao.conectar();
					PreparedStatement stmt = conn.prepareStatement(sql)){
				
				stmt.setInt(1, id);
				
				stmt.executeUpdate();
				System.out.println("DADOS EXCLUIDOS.");
			}
		}
	}
	
