package aplicacao;

public class Dependente {
	private int id;
	private String nome_d;
	private int idade;
	
	public Dependente() {
		
	}
	
	public Dependente(int id, String nome_d, int idade) {
		this.id = id;
		this.nome_d = nome_d;
		this.idade = idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setNome_d(String nome_d) {
		this.nome_d = nome_d;
	}
	
	public int getId() {
		return this.id;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public String getNome_d() {
		return this.nome_d;
	}
	
}
