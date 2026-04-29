package ExercicioConexaoBd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {

	public void inserir(Produto p) throws SQLException{
		String sql = "INSERT INTO produto(nome, preco, quantidade) VALUES(?, ?, ?)";
		
		try(Connection conn = ProdutoConexao.conectar();
				PreparedStatement stmt = conn.prepareStatement(sql)){
			
			stmt.setString(1, p.getNome());
			stmt.setDouble(2, p.getPreco());
			stmt.setInt(3, p.getQuantidade());
			
			stmt.executeUpdate();
			System.out.println("produto inserido com SUCESSO!");
		}
	}
		
		public List<Produto> Listar() throws SQLException{
			
			List<Produto> lista = new ArrayList<>();
			String sql = "SELECT * FROM produto";
			
			try(Connection conn = ProdutoConexao.conectar();
					Statement stmt = conn.prepareStatement(sql);
					ResultSet rs = stmt.executeQuery(sql)){
				
				while(rs.next()) {
					lista.add(new Produto(
							rs.getInt("id"),
							rs.getString("nome"),
							rs.getDouble("preco"),
							rs.getInt("quantidade")));
							
				}
				
			}
			
			return lista;
		
		}
		public void atualizar(Produto p) throws SQLException{
			String sql = "UPDATE produto SET nome = ?, preco = ?, quantidade = ? WHERE id = ?";
			
			try(Connection conn = ProdutoConexao.conectar();
					PreparedStatement stmt = conn.prepareStatement(sql)){
				
				stmt.setString(1, p.getNome());
				stmt.setDouble(2, p.getPreco());
				stmt.setInt(3, p.getQuantidade());
				stmt.setInt(4, p.getId());
				
				stmt.executeUpdate();
				System.out.println("DADOS ATUALIZADO");
			}
		}
		
		public void deletar(int id) throws SQLException{
			String sql = "DELETE from produto WHERE id = ?";
			
			try(Connection conn = ProdutoConexao.conectar();
					PreparedStatement stmt = conn.prepareStatement(sql)){
				
				stmt.setInt(1, id);
				
				stmt.executeUpdate();
				System.out.println("DADOS EXCLUIDOS");
			}
		}
	}