package aplicacao;

public class Cachorro {

	private String nome;
	private String raca;
	private int idade;
	
	public Cachorro(String nome, String raca, int idade) {
		this.nome = nome;
		this.raca = raca;
		this.idade = idade;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getRaca() {
		return this.raca;
	}
	
	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String informarEstado() {
		return "Nome: " + this.nome + 
				"\nRaca: " + this.raca + 
				"\nIdade: " + this.idade;
	}

	public Cachorro clonarCachorro() {
		Cachorro clone = new Cachorro(this.nome,this.raca, this.idade);		
		return clone;
	}
}