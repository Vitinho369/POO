package aplicacao;

public class Utilitarios {
	
	public void duplica(RepositorioImplementado A, RepositorioImplementado B) {
		for(int i=0; i < A.getPessoas().size(); i++) {
				B.getPessoas().add(A.getPessoas().get(i));
		}
	}
	
	public void diferenca(RepositorioImplementado  A, RepositorioImplementado B, RepositorioImplementado C) {
		for(int i=0; i < A.getPessoas().size(); i++) {
			for(int j=0; j < B.getPessoas().size(); j++) {
				if(A.getPessoas().get(i).getCPF().equals(B.getPessoas().get(j).getCPF())) {
					C.getPessoas().add(A.getPessoas().get(i));
				}
			}
		}
	}
}
