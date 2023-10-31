package aplicacao;

public class Socio {
	private int cpf_s;
	private String nome_s;
	private String data_adm;
	
	public Socio() {
		
	}
	
	public Socio(int cpf_s, String nome_s, String data_adm) {
		this.cpf_s = cpf_s;
		this.data_adm = data_adm;
		this.nome_s = nome_s;
	}
	
	public void setCpf(int cpf_s) {
		this.cpf_s = cpf_s;
	}
	
	public void setNome(String nome_s) {
		this.nome_s = nome_s;
	}
	
	public void setData_adm(String data_adm) {
		this.data_adm = data_adm;
	}
	
	public int getCpf_s() {
		return this.cpf_s;
	}
	
	public String getNome_s() {
		return this.nome_s;
	}
	
	public String getData_adm() {
		return this.data_adm;
	}
}
