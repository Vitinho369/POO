package visao;
import aplicacao.RepositorioImplementado;
import aplicacao.PessoaImplementada;
import aplicacao.Utilitarios;

public class Questao9 {
	
	public static void main(String args[]) {
		RepositorioImplementado A = new RepositorioImplementado();
		RepositorioImplementado B = new RepositorioImplementado();
		RepositorioImplementado C = new RepositorioImplementado();
	
		Utilitarios utilitario = new Utilitarios();
		PessoaImplementada p1 = new PessoaImplementada();
	
		p1.setNome("Dani");
		p1.setCPF("1213131");
		A.guarda(p1);
		p1 = new PessoaImplementada();
		p1.setNome("Andre");
		p1.setCPF("1213132");
		A.guarda(p1);
		p1 = new PessoaImplementada();
		p1.setNome("Inacio");
		p1.setCPF("1213133");
		B.guarda(p1);
		A.guarda(p1);
		for(int a=0; a < B.getPessoas().size();a++) {
			System.out.println("Pessoas de B antes de dupliacadas por B: " + B.getPessoas().get(a).getCPF());
		}
		utilitario.duplica(A, B);
		for(int a=0; a < B.getPessoas().size();a++) {
			System.out.println("Pessoas de B apos dupliacadas por B: " + B.getPessoas().get(a).getCPF());
		}
		
		utilitario.diferenca(A, B, C);
		
		for(int a=0; a < C.getPessoas().size();a++) {
			System.out.println("Pessoas de A que nao estao em B: " + C.getPessoas().get(a).getCPF());
		}
	
		System.out.println(A.recupera("1213133").getNome());
	}
}