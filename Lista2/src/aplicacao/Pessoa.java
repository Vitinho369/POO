package aplicacao;

public class Pessoa {
	private String nome;
	private String telefone;
	private String email;
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTelefone() {
		return this.telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String returnData() {
		return "Nome: " + this.nome + "\nTelefone: " + this.telefone + "\nE-mail:" + this.email;
	}
}
