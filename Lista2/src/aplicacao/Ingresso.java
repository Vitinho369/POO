package aplicacao;

public class Ingresso {
	private int codigo;
	private String cpf;
	private String nomeFilme;
	private int numPoltrona;
	private int valorIngresso;

	public Ingresso(int codigo, String cpf, String nomeFilme, int numPoltrona, int valorIngresso) {
		this.codigo = codigo;
		this.cpf = cpf;
		this.nomeFilme = nomeFilme;
		this.numPoltrona = numPoltrona;
		
		if(valorIngresso == 1)
			this.valorIngresso = 8;
		else
			this.valorIngresso = 16;
		
	}
	
	
	public int getCodigo(){
		return this.codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getNomeFilme() {
		return this.nomeFilme;
	}
	
	public void setNomeFilme(String nomeFilme) {
		this.nomeFilme = nomeFilme;
	}
	
	public int getNumPoltrona() {
		return this.numPoltrona;
	}
	
	public void setNumPoltrona(int numPoltrona) {
		this.numPoltrona = numPoltrona;
	}

	public void setValorIngresso(int valorIngresso) {
		if(valorIngresso == 1)
			this.valorIngresso = 8;
		else
			this.valorIngresso = 16;
	}
	
	public int getValorIngresso() {
		return this.valorIngresso;
	}
}