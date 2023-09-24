package aplicacao;

public class Musica {
	private String nome;
	private String cantor;
	private int duracaoTotal;
	private int duracaoMinutos;
	private int duracaoSegundos;
	
	public Musica(String nome, String cantor, int duracaoMin, int duracaoSeg) {
		this.nome = nome;
		this.cantor = cantor;
		this.duracaoMinutos = duracaoMin;
		this.duracaoSegundos = duracaoSeg;
		this.duracaoTotal = (duracaoMin * 60) + duracaoSeg;
	}
	
	public boolean equals(Musica m) {
		if(m.getNome() == this.nome && m.getCantor() == this.cantor)
			return true;
		else
			return false;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getCantor() {
		return this.cantor;
	}
	
	public int getDuracaoTotal() {
		return this.duracaoTotal;
	}
	
	public int getDuracaoMin() {
		return this.duracaoMinutos;
	}
	
	public int getDuracaoSeg() {
		return this.duracaoSegundos;
	}
}
