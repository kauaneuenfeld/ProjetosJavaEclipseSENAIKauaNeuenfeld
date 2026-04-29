package ExemploConexaoBancoCRUD;

public class pessoas {

	private int id;
	private String nome;
	private int idade;
	private String cpf;
	
	//construtor sem id
	public pessoas(String nome, int idade, String cpf) {
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
	}
	
	//construtor para leitura 
	public pessoas(int id, String nome, int idade, String cpf) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;

	}
	
	//getter e setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "pessoas [id: " + id + ", nome: " + nome + ", idade: " + idade + ", cpf: " + cpf + "]";
		}
	}
