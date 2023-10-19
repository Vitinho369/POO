package aplicacao;
import aplicacao.Data;

public class VooMarcado extends Voo{
	private int numFumantes;
	private int vagas[];
	
	public VooMarcado(int numVoo, Data data, int numFumantes) {
		super(numVoo, data);
		this.numFumantes = numFumantes;
		
		for(int i=0; i < vagas.length;i++) {
			vagas[i] = 1;
		}
	}
	
	public void maxVagas(int max) {
		this.vagas = new int[max];
	}

	public int proximoLivre() {
		for(int i=0; i < vagas.length;i++) {
			if(vagas[i] == 0)
				return i+1;
		}
		return 0;
	}
	
	public boolean ocupa(int cadeira) {
		if(this.verifica(cadeira)) {
			return false; 
		}else {
			this.vagas[cadeira-1] = this.vagas[cadeira-1]*2;
			return true;
		}
	}
	
	public boolean verifica(int cadeira) {
		
		for(int i=0; i < vagas.length;i++) {
			if(vagas[i] != 0 && cadeira == i)
				return true;
		}
		return false;
	} 

	public String tipo(int num) {
		if(num > numFumantes) {
			return "F";		
		}else {
			return "N";
		}
	}
	
	public void cadeirasFumantes(){
		
	}
}
