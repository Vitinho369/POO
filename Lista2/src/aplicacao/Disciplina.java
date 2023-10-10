package aplicacao;
import java.util.ArrayList;
import aplicacao.Aluno;

public class Disciplina {
	private ArrayList<Aluno> alunos;
	private int codDisciplina;
	private String titulo;
	private int cargaH;
	private String nomeProf;
	
	public Disciplina(int codDisciplina) {
		this.codDisciplina = codDisciplina;
		this.alunos = new ArrayList<Aluno>();
	}
	
	public String melhorAluno() {
		float media = -1;
		String nomeAluno = "";
		for(int i=0; i < this.alunos.size();i++) {
			if(this.alunos.get(i).media() > media) {
				nomeAluno = this.alunos.get(i).getNome();
				media = this.alunos.get(i).media();
			}
		}
		
		return nomeAluno;
	}
	
	public float media() {
		float mediaDisciplina=0;
		
		for(int i=0; i < this.alunos.size();i++) {
			mediaDisciplina += this.alunos.get(i).media();
		}
		mediaDisciplina /= this.alunos.size();
		
		return mediaDisciplina;
	}
	
	public void inserirDisciplina(String nomeProf, String titulo, int cargaH) {
		this.nomeProf = nomeProf;
		this.titulo = titulo;
		this.cargaH = cargaH;
	}
	
	public void inserirAluno(Aluno aluno) {
		this.alunos.add(aluno);
	}
	
	public Aluno consultarAluno(int matricula) {
		Aluno dados = null;
		for(int i=0; i < alunos.size();i++) {
			if(this.alunos.get(i).getMatricula() == matricula) {
				dados = alunos.get(i);
			}
		}
		return dados;
	}
	
	public String getDados() {
		return "\nCodigo da disciplina: " + this.codDisciplina + "\nNome do professor: " + this.nomeProf+
				"\nTitulo do professor: " + this.titulo;
	}
	
	public void alterarProfessor(String nomeProf, String titulo) {
		this.nomeProf = nomeProf;
		this.titulo = titulo;
	}
	
	public int getcodDisciplina() {
		return this.codDisciplina;
	}
}
