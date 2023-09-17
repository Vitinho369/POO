package visao;
import aplicacao.Aluno;
import java.util.Scanner;

public class Questao2 {
	public static void main(String args[]) {
		
		Scanner teclado = new Scanner(System.in);
		
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();
		
		String nome;
		int matricula, codNota;
		float n1, n2, n3, nAlterada;
		int op;
		boolean cadastro = false;
		Aluno alunoAux;
		do {
			System.out.println("---------------------------------------------------------");
			System.out.println("MENU PRINCIPAL");
			System.out.println("---------------------------------------------------------");
			System.out.println("1 - CADASTRAR ALUNOS");
			System.out.println("2 - CADASTRAR NOTAS");
			System.out.println("3 - CALCULAR MEDIAS");
			System.out.println("4 - INFORMAR SITUACOES");
			System.out.println("5 - INFORMAR DADOS DE UM ALUNO"); 
			System.out.println("6 - ALTERAR NOTA"); 
			System.out.println("7 - SAIR");
			System.out.println("---------------------------------------------------------");	
			op = teclado.nextInt();
			
			switch(op) {
				case 1:
					
					if(!cadastro) {
						System.out.println("Digite o nome do aluno 1:");
						teclado.nextLine();
						nome = teclado.nextLine();
						System.out.println("Digite a matricula do aluno 1:");
						matricula = teclado.nextInt();	
						
						a1.setNome(nome);
						a1.setMatricula(matricula);
						
						System.out.println("Digite o nome do aluno 2:");
						teclado.nextLine();
						nome = teclado.nextLine();
						System.out.println("Digite a matricula do aluno 2:");
						matricula = teclado.nextInt();
	
						a2.setNome(nome);
						a2.setMatricula(matricula);
						
						System.out.println("Digite o nome do aluno 3:");
						teclado.nextLine();
						nome = teclado.nextLine();
						System.out.println("Digite a matricula do aluno 3:");
						matricula = teclado.nextInt();
						
	
						a3.setNome(nome);
						a3.setMatricula(matricula);
						cadastro = true;
					}else {
						System.out.println("Alunos já cadastrados, nao eh possivel cadastra-los novamente");
					}
				break;
					
				case 2:
					if(cadastro) {
						System.out.println("Digite a nota 1 do aluno 1:");
						n1 = teclado.nextInt();
						System.out.println("Digite a nota 2 do aluno 1:");
						n2 = teclado.nextInt();
						System.out.println("Digite a nota 3 do aluno 1:");
						n3 = teclado.nextInt();
						
						a1.setNotas(n1, n2, n3);
						
						System.out.println("Digite a nota 1 do aluno 2:");
						n1 = teclado.nextInt();
						System.out.println("Digite a nota 2 do aluno 2:");
						n2 = teclado.nextInt();
						System.out.println("Digite a nota 3 do aluno 2:");
						n3 = teclado.nextInt();
						
						a2.setNotas(n1, n2, n3);
						
						System.out.println("Digite a nota 1 do aluno 3:");
						n1 = teclado.nextInt();
						System.out.println("Digite a nota 2 do aluno 3:");
						n2 = teclado.nextInt();
						System.out.println("Digite a nota 3 do aluno 3:");
						n3 = teclado.nextInt();
	
						a3.setNotas(n1, n2, n3);
					}else {
						System.out.println("Nao eh possivel cadastrar as notas, alunos nao cadastrados");
					}
				break;
					
				case 3:
					
					if(cadastro) {
						a1.calcularMedia();
						a2.calcularMedia();
						a3.calcularMedia();
						
						System.out.println("Medias calculadas com sucesso!!!!");
					}else {
						System.out.println("Nao eh possivel calcular as medias, alunos nao cadastrados");
					}
				break;
				case 4:
					
					if(cadastro) {
						System.out.println("Situacao do aluno 1:" + a1.getSituacao());
						System.out.println("Situacao do aluno 2:" + a2.getSituacao());
						System.out.println("Situacao do aluno 3:" + a3.getSituacao());
					}else{
						System.out.println("Nao eh possivel informar as situacoes, alunos nao cadastrados");
					}
				break;
					
				case 5:
					if(cadastro) {
						System.out.println("Digite a matricula do aluno que deseja buscar:");
						matricula = teclado.nextInt();
						alunoAux = null;
						if(a1.buscarAluno(matricula)) {
							alunoAux = a1;
						}else if(a2.buscarAluno(matricula)) {
							alunoAux = a2;
						}else if(a3.buscarAluno(matricula)) {
							alunoAux = a3;
						}else {
							System.out.println("Nao existe aluno cadastrado com essa matricula");
						}

						if(alunoAux != null){
							System.out.println("Nome: " + alunoAux.getNome());
							System.out.println("Nota 1: " + alunoAux.getNota1());
							System.out.println("Nota 2: " + alunoAux.getNota2());
							System.out.println("Nota 3: " + alunoAux.getNota3());
							System.out.println("Media: " + alunoAux.getMedia());
							System.out.println("Situacao: " + alunoAux.getSituacao());
						}
						
					}else {
						System.out.println("Nao eh possivel informar dados de um aluno, alunos nao cadastrados");
					}
					break;
					
				case 6:
					
					if(cadastro) {
						System.out.println("Digite a matricula do aluno que deseja alterar a nota:");
						matricula = teclado.nextInt();
						
						if(a1.buscarAluno(matricula)) {
							
							do{
								System.out.println("Qual nota deseja alterar do aluno 1 (1,2,3)?");
								codNota = teclado.nextInt();
							}while((aux<1)||(aux>3));
							System.out.println("Qual a nota?");
							nAlterada = teclado.nextFloat();
							System.out.println(a1.alterarNota(codNota, nAlterada));
						}else if(a2.buscarAluno(matricula)) {
							do{
								System.out.println("Qual nota deseja alterar do aluno 2 (1,2,3)?");
								codNota = teclado.nextInt();
							}while((aux<1)||(aux>3));
							System.out.println("Qual a nota?");
							nAlterada = teclado.nextFloat();
							System.out.println(a2.alterarNota(codNota, nAlterada));
						}else if(a3.buscarAluno(matricula)) {
							do{
								System.out.println("Qual nota deseja alterar do aluno 3 (1,2,3)?");
								codNota = teclado.nextInt();
							}while((aux<1)||(aux>3));
							System.out.println("Qual a nota?");
							nAlterada = teclado.nextFloat();
							System.out.println(a3.alterarNota(codNota, nAlterada));
						}else {
							System.out.println("Aluno nao cadastrado");
						}
					}else {
						System.out.println("Nao eh possivel alterar as notas, alunos nao cadastrados");
					}
					break;
					
				case 7:
					System.out.println("Fim de programa");
					break;
					
				default: 
					System.out.println("Opcao invalida");
			}
		}while(op != 7);
		
	}
}
