package visao;

import java.util.Scanner;
import aplicacao.Disciplina;
import aplicacao.Aluno;
import java.util.ArrayList;

public class Questao_6 {

	public static void main(String[] args) {
		ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
		Scanner ler = new Scanner(System.in);
		Disciplina disciplina;
		Aluno aluno;
		String nomeProf, titulo, nomeAluno;
		int cargaH, codDisciplina = 0, codBusca, matricula;
		float n1, n2,nTrab;
		boolean encontraMatricula;
		int op;
		do {
			System.out.println("1 -  Cadastrar uma disciplina");
			System.out.println("2 -  Cadastrar aluno em uma disciplina");
			System.out.println("3 -  Consultar aluno de uma disciplina");
			System.out.println("4 -  Melhor aluno de uma disciplina");
			System.out.println("5 -  Retornar dados de uma disciplina");
			System.out.println("6 -  Alterar professor de uma disciplina");
			System.out.println("7 -  Retornar media dos alunos de uma disciplina");
			System.out.println("8 - Sair");
			op = ler.nextInt();
			
			switch(op) {
				case 1:
					disciplina = new Disciplina(codDisciplina);
					
					System.out.println("Digite o nome do professor da disciplina: ");
					ler.nextLine();
					nomeProf = ler.nextLine();
					System.out.println("Digite o titulo do professor:");
					titulo = ler.nextLine();
					System.out.println("Digite a carga horaria da disciplina:");
					cargaH = ler.nextInt();
					disciplina.inserirDisciplina(nomeProf,titulo, cargaH);
					codDisciplina++;
					disciplinas.add(disciplina);
					System.out.println("Disciplina cadastrada com sucesso");
				break;
				
				case 2:
					System.out.println("\n------------------------------------");
					System.out.println("Disciplinas existentes: ");
					for(int i=0; i < disciplinas.size();i++) {
						System.out.println(disciplinas.get(i).getDados());
					}
					System.out.println("------------------------------------\n");
					
					System.out.println("Digite o codigo da disciplina que deseja cadastrar o aluno:");
					codBusca = ler.nextInt();
					
					if(codBusca >= 0 && codBusca <= codDisciplina) {
						encontraMatricula = false;
						System.out.println("Digite a matricula do aluno: ");
						matricula = ler.nextInt();
						
							if(disciplinas.get(codBusca).consultarAluno(matricula) != null &&
								disciplinas.get(codBusca).consultarAluno(matricula).getMatricula() == matricula) {
								encontraMatricula = true;
							}
						
						
						if(encontraMatricula) {
							System.out.println("Matricula ja cadastrada");
						}else {
							System.out.println("Digire o nome do aluno: ");
							ler.nextLine();
							nomeAluno = ler.nextLine();
							System.out.println("Digite as notas 1 e 2 do aluno: ");
							n1 = ler.nextFloat();
							n2 = ler.nextFloat();
							System.out.println("Digite  nota do trabalho do aluno: ");
							nTrab = ler.nextFloat();
							
							aluno = new Aluno(matricula, nomeAluno, n1, n2, nTrab);
							
							disciplinas.get(codBusca).inserirAluno(aluno);
						}
					}else {
						System.out.println("Codigo de disciplina invalido");
					}
				break;
				
				case 3:
					System.out.println("Digite o codigo da disciplina que deseja consultar o aluno:");
					codBusca = ler.nextInt();
					if(codBusca >= 0 && codBusca <= codDisciplina) {
						do {
							System.out.println("Digite a matricula do aluno que deseja consultar:");
							matricula = ler.nextInt();
							encontraMatricula = false;
							if(disciplinas.get(codBusca).consultarAluno(matricula) == null) {
								encontraMatricula = true;
							}
							
							if(encontraMatricula)
								System.out.println("Matricula invalida, digite novamente");
						}while(encontraMatricula);

						System.out.println("\n------------------------------------");
						System.out.println("Dados do aluno:");
						System.out.println(disciplinas.get(codBusca).consultarAluno(matricula).estado());		
						System.out.println("------------------------------------\n");
					}else {
						System.out.println("Codigo de diciplina invalido");
					}
				break;
				
				case 4:
					System.out.println("Digite o codigo da disciplina que deseja consultar o melhor aluno:");
					codBusca = ler.nextInt();
						
						if(codBusca >= 0 && codBusca <= codDisciplina) {
							System.out.println("Melhor aluno da disciplina:");
							System.out.println(disciplinas.get(codBusca).melhorAluno());
							System.out.println();
						}else {
							System.out.println("Codigo de diciplina invalido");
						}
				break;
				
				case 5:
					System.out.println("Digite o codigo da disciplina que deseja visualizar os dados:");
					codBusca = ler.nextInt();
					
					if(codBusca >= 0 && codBusca <= codDisciplina) {
						System.out.println("Dados da disciplina:");
						System.out.println(disciplinas.get(codBusca).getDados());
						System.out.println();
					}else {
						System.out.println("Codigo de diciplina invalido");
					}
				break;
				
				case 6:
					System.out.println("Digite o codigo da disciplina que deseja alterar o professor:");
					codBusca = ler.nextInt();
					
					if(codBusca >= 0 && codBusca <= codDisciplina) {
						System.out.println("Digite o novo nome do professor:");
						ler.nextLine();
						nomeProf = ler.nextLine();
						System.out.println("Digite a titulacao do novo professor:");
						titulo = ler.nextLine();
						
						disciplinas.get(codBusca).alterarProfessor(nomeProf, titulo);
						System.out.println("Professor alterado com sucesso!!!!");
					}else {
						System.out.println("Codigo de diciplina invalido");
					}
				break;
				
				case 7:
					System.out.println("Digite o codigo da disciplina que deseja ver a media dos alunos:");
					codBusca = ler.nextInt();
					
					if(codBusca >= 0 && codBusca <= codDisciplina) {
						System.out.println("Media dos alunos da disciplina: ");
						System.out.println(disciplinas.get(codBusca).media());
					}else {
						System.out.println("Codigo de diciplina invalido");
					}
				break;
				
				case 8:
					System.out.println("Fim de programa");
				break;
				
				default: System.out.println("Opcao invalida");
			}
			
		}while(op != 8);
	}

}