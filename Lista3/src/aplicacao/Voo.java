package aplicacao;
import aplicacao.Data;

public class Voo {
	private Data date;
	private int passageiros[] = new int[100];
	private int numVoo;
	
	public Voo(int numVoo, Data data) {
		this.numVoo = numVoo;
		this.date = data;
		for(int i=0; i < passageiros.length;i++) {
			passageiros[i] = 0;
		}
	}
	
	public int proximoLivre() {
		for(int i=0; i < passageiros.length;i++) {
			if(passageiros[i] == 0)
				return i+1;
		}
		return 0;
	}
	
	public boolean verifica(int cadeira) {
		
		for(int i=0; i < passageiros.length;i++) {
			if(passageiros[i] != 0 && cadeira == i)
				return true;
		}
		return false;
	}
	
	public boolean ocupa(int cadeira) {
		if(this.verifica(cadeira)) {
			return false; 
		}else {
			this.passageiros[cadeira-1] = 1;
			return true;
		}
	}
	
	public int vagas() {
		int contVagas = 0;
		
		for(int i=0; i < passageiros.length;i++) {
			if(passageiros[i] == 0)
				contVagas++;
		}
		
		return contVagas;
	}
	
	public int getVoo() {
		return this.numVoo;
	}
	
	public Data getData() {
		return this.date;
	}
	
	public Voo clone() {
		Voo vooClone = new Voo(this.numVoo, this.date);
		return vooClone;
	}
}
