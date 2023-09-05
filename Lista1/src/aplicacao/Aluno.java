package aplicacao;

public class Aluno {
	private String nome;
	private int matricula;
	private float nota1;
	private float nota2;
	private float nota3;
	private float media;
	private String situacao;
	
	public Aluno() {
		
	}
	
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	
	public void setMatricula(int novaMat) {
		this.matricula = novaMat;
	}
	
	public void setNotas(float n1, float n2, float n3) {
		this.nota1 = n1;
		this.nota2 = n2;
		this.nota3 = n3;
	}
	
	public void calcularMedia() {
		this.media = ((this.nota1*4)+(this.nota2*5)+(this.nota3*6))/15;
		
		if(this.media < 3) {
			this.situacao = "Reprovado";
		}else if(this.media >= 7) {
			this.situacao = "Aprovado";
		}else {
			this.situacao = "Recuperacao";
		}
	}
	
	public boolean buscarAluno(int matricula) {
		if(matricula == this.matricula) {
			return true;
		}else {
			return false;
		}
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public float getNota1() {
		return this.nota1;
	}
	
	public float getNota2() {
		return this.nota2;
	}
	
	public float getNota3() {
		return this.nota3;
	}
	
	public float getMedia() {
		return this.media;
	}
	
	public String getSituacao() {
		return this.situacao;
	}
	
	public String alterarNota(int codNota, float valorNota) {
		switch(codNota) {
			case 1:
				this.nota1 = valorNota;
				this.calcularMedia();
			case 2:
				this.nota2 = valorNota;
				this.calcularMedia();
			case 3: 
				this.nota3 = valorNota;
				this.calcularMedia();
		}
				return this.situacao;
	}
}
