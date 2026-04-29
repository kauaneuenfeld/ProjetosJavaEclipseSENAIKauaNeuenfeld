package prova;

public class ContatoComercial extends Contato{

	private String empresa;
	private String email;
	
	public ContatoComercial(String nome, int telefone, String empresa, String email) {
		super(nome, telefone);
		this.empresa = empresa;
		this.email = email;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public void exibirDados() {
		System.out.println("\nNome: " + getNome() + " | Telefone: " + getTelefone() + " | Empresa: " + empresa + " | E-mail: " + email);
	}
	
}
