package aplicacao;
import java.util.ArrayList;

public class Pais {
	private String nome;
	private String capital;
	private float dimensao;
	private ArrayList<Pais> fronteira = new ArrayList<Pais>();
	
	public Pais(String nome, String capital, float dimensao) {
		this.nome = nome;
		this.capital = capital;
		this.dimensao = dimensao;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getCapital() {
		return this.capital;
	}
	
	public float getDimensao() {
		return this.dimensao;
	}

	public boolean equals(Pais outro) {
		if(this.nome.equals(outro.getNome()) &&
		   this.capital.equals(outro.getCapital())) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean fazerFronteira(Pais pais) {
		if(!this.equals(pais)) {
			this.fronteira.add(pais);
			return true;
		}else {
			return false;
		}
	}
	
	public ArrayList<Pais> getFronteira(){
		return this.fronteira;
	}
	
	public ArrayList<Pais> vizinhosComuns(Pais pais){
		ArrayList<Pais> vizinhos = new ArrayList<Pais>();
		
		for(int i=0; i < this.fronteira.size();i++) {
			for(int j=0; j < pais.getFronteira().size();j++) {
				if(this.fronteira.get(i) == pais.getFronteira().get(j)) {
					vizinhos.add(this.fronteira.get(i));
				}
			}
		}
		
		return vizinhos;
	}
}
