package POO;

import java.util.ArrayList;

public class ListaNomes {

	private ArrayList<String> nomes = new ArrayList<>();
	
	public void adicionarNome(String nome) {
		nomes.add(nome);
		System.out.println("Adicionado.");
	}
	
	public void ListasNomes() {
		if(nomes.isEmpty()) {
			System.out.println("Lista VAZIA.");
			
		}else {
			System.out.println("Nomes Cadastrados");
			for(String total: nomes) {
				
				System.out.println(total);
			}
		}
	}
	
	public void removernome(String nome) {
		if(nomes.remove(nome)) {
			System.out.println("Nomes removidos");
		}else {
			System.out.println("Não encontrado");
		}
		
	}
	
	public void BuscarNomes(String nome) {
		if(nomes.contains(nome)) {
			int posicao = nomes.indexOf(nome);
			System.out.println("Encontrar na posicao" + (posicao+1));
		}else {
			System.out.println("Nome não encontrado");
		}
	}
	
}
