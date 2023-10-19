package aplicacao;
import java.util.ArrayList;

public class RepositorioImplementado implements Repositorio{
	private ArrayList<Pessoa> pessoas;
	private int proxima;
	
	public RepositorioImplementado() {
		pessoas = new ArrayList<Pessoa>();
		proxima = 0;
	}
	
	public ArrayList<Pessoa> getPessoas(){
		return pessoas;
	}
	
	public void guarda(Pessoa nova) {
		pessoas.add(nova);
	}
	
	public Pessoa recupera(String cpf) {
		Pessoa p = null;
		for(int i=0; i < pessoas.size();i++) {
			if(pessoas.get(i).getCPF().equals(cpf)) {
				p = pessoas.get(i);
			}
		}
		
		return p;
	}
	
	public Pessoa primeiro() {
		proxima = 0;
		return pessoas.get(proxima);
	}
	
	public Pessoa proximo() {
		proxima++;
		return pessoas.get(proxima);
	}
}
