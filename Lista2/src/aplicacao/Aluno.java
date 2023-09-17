package aplicacao;

public class Aluno {
	private int matricula;
	private String nome;
	private float nota1;
	private float nota2;
	private float notaTrab;
	
	public Aluno(int matricula, String nome, float nota1, float nota2, float notaTrab) {
		this.matricula = matricula;
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.notaTrab = notaTrab;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public int getMatricula() {
		return this.matricula;
	}
	
	public float media() {
		return (float)((this.nota1 * 2.5) + (this.nota2 *2.5) + (notaTrab*2))/7;
	}
	
	public float provaFinal() {
		if(this.media() < 5)
			return 5 - this.media();
		else
			return 0;
	}
	
	public String estado() {	 
		if(this.provaFinal() != 0) {
				return "\nNome: " + this.nome + "\nMatricula: " + this.matricula + 
						"\nNota 1: " + this.nota1 + "\nNota 2: " + this.nota2 +
						"\nNota Trabalho: " + this.notaTrab + "\nMedia: " + this.media()
						+ "\nProva Final: " + this.provaFinal(); 
		}else {
			return "\nNome: " + this.nome + "\nMatricula: " + this.matricula + 
					"\nNota 1: " + this.nota1 + "\nNota 2: " + this.nota2 +
					"\nNota Trabalho: " + this.notaTrab + "\nMedia: " + this.media();
		}
	}
}
