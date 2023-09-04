package aplicacao;

public class Robo {
	private int linha;
	private int coluna;
	private int passo;
	
	public Robo() {
		this.linha = 0;
		this.coluna = 0;
		this.passo = 1;
	}
	
	public int getLinha() {
		return this.linha;
	}
	
	public int getColuna() {
		return this.coluna;
	}
	
	public int[] mostrarPosicaoAtual() {
		int [] posicao = {linha, coluna};
		return posicao;
	}
	
	public void andarDireita() {
		if(this.coluna + this.passo < 40)
			this.coluna += this.passo;
		else
			this.coluna = (-1)*(40 - (this.coluna + this.passo));
	}
	
	public void andarEsquerda() {
		if(this.coluna - this.passo > 0)
			this.coluna -= this.passo;
		else
			this.coluna = 40 + (this.coluna - this.passo);
	}
	
	public void andarFrente() {
		if(this.linha + this.passo < 20)
			this.linha += this.passo;
		else
			this.linha = (-1)*(20 - (this.linha + this.passo));
	}
	
	public void andarTras() {
		if(this.linha - this.passo > 0)
			this.linha -= this.passo;
		else
			this.linha = 20 + (this.linha - this.passo);
	}
}