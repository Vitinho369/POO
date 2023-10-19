package aplicacao;

public class PessoaImplementada implements Pessoa{
	private String cpf;
	private String nome;
	
	public String getCPF() {
		return this.cpf;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setCPF(String cpf) {
		this.cpf = cpf;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}
