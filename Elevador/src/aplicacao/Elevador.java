package aplicacao;

public class Elevador {
	private int andarAtual;
	private int totAndares;
	private int capacidade;
	private int qtdPessoas;
	
	public void inicilia(int capacidade, int totAndares) {
		this.capacidade = capacidade;
		this.totAndares = totAndares;
		this.andarAtual = 0;
		this.qtdPessoas = 0;
	}
	
	public boolean entra() {
		if(this.qtdPessoas < this.capacidade) {
			this.qtdPessoas++;
			return true;
		}
		
		return false;
	}
	
	public boolean sai() {
		if(this.qtdPessoas > 0) {
			this.qtdPessoas--;
			return true;
		}
	
		return false;
	}
	
	public boolean sobe() {
		if(this.andarAtual < this.totAndares) {
			this.andarAtual++;
			return true;
		}
		
		return false;
	}
	
	public boolean desce() {
		if(this.andarAtual > 0) {
			this.andarAtual--;
			return true;
		}
		
		return false;
	}
}
