package visao;
import aplicacao.Pessoa;
import java.util.Scanner;
import java.util.ArrayList;

public class Questao_5 {

	public static void main(String[] args) {
		ArrayList<Pessoa> agenda = new ArrayList<Pessoa>();
		Scanner ler = new Scanner(System.in);
		Pessoa pessoa;
		boolean encontraPessoa;;
		String email;
		int opBusca;
		int op;
		do {
			
			System.out.println("1 - Cadastrar pessoa na agenda");
			System.out.println("2 - Remover pessoa da agenda");
			System.out.println("3 - Buscar pessoa na agenda");
			System.out.println("4 - Informar dados de uma pessoa na agenda");
			System.out.println("5 - Escrever agenda");
			System.out.println("6 - Sair");
			op = ler.nextInt();
			
			switch(op) {
			
				case 1:
					pessoa = new Pessoa();
					System.out.println("Digite o nome da pessoa:");
					ler.nextLine();
					pessoa.setNome(ler.nextLine());
					System.out.println("Digite o telefone da pessoa:");
					pessoa.setTelefone(ler.nextLine());

					do{
						encontraPessoa = false;
						System.out.println("Digite o email da pessoa:");
						email = ler.nextLine();
					
						for(int i=0; i < agenda.size(); i++) {
							if(agenda.get(i).getEmail().equals(email)) {
								encontraPessoa = true;
								i = agenda.size();
							}
						}
						
						if(encontraPessoa)
							System.out.println("Email ja cadastradom digite novamente:");
					}while(encontraPessoa);
					pessoa.setEmail(email);
					agenda.add(pessoa);
					System.out.println("\nPessoa adicionada na agenda");
				break;
				
				case 2:
					
					System.out.println("Digite o e-mail da pessoa que deseja remover:");
					encontraPessoa = false;
					ler.nextLine();
					email = ler.nextLine();
					
					for(int i=0; i < agenda.size();i++) {
						if(agenda.get(i).getEmail().equals(email)) {
							agenda.remove(i);
							encontraPessoa = true;
							i = agenda.size();
						}
					}
					if(!encontraPessoa)
						System.out.println("Email nao cadastrado na agenda");
					else
						System.out.println("\nPessoa removida da agenda");
				break;
				
				case 3:
					System.out.println("Digite o email da pessoa");
					ler.nextLine();
					email = ler.nextLine();
					encontraPessoa = false;
					for(int i=0; i < agenda.size();i++) {
						if(agenda.get(i).getEmail().equals(email)) {
							encontraPessoa = true;
							System.out.println("------------------");
							System.out.println("Dados:");
							System.out.println("Nome: " + agenda.get(i).getNome());
							System.out.println("E-mail: " + agenda.get(i).getEmail());
							System.out.println("Telefone: " + agenda.get(i).getTelefone());
							System.out.println("------------------");
						}
					}
					
					if(!encontraPessoa)
						System.out.println("Email nao presente na agenda");
				break;
				
				case 4:
					System.out.println("Qual dado voce deseja visualizar na agenda?");
					System.out.println("1 - E-mail");
					System.out.println("2 - Telefone");
					System.out.println("3 - Nome");
					opBusca = ler.nextInt();
					
					switch(opBusca) {
						case 1:
							System.out.println("\n-------------------------------");
							System.out.println("Emails cadastrados:");
							for(int i=0; i < agenda.size();i++) {
								System.out.println("> " +agenda.get(i).getEmail());
							}
							System.out.println("-------------------------------\n");
						break;
						
						case 2:
							System.out.println("\n-------------------------------");
							System.out.println("Telefones cadastrados:");
							for(int i=0; i < agenda.size();i++) {
								System.out.println("> " +agenda.get(i).getTelefone());
							}
							System.out.println("-------------------------------\n");
						break;
						
						case 3:
							System.out.println("\n-------------------------------");
							System.out.println("Nomes cadastrados:");
							for(int i=0; i < agenda.size();i++) {
								System.out.println("> " +agenda.get(i).getNome());
							}
							System.out.println("-------------------------------\n");
						break;
						
						default: System.out.println("Opcao invalida");
					}
				break;
				
				case 5:
					System.out.println("Agenda:");
					System.out.println("----------------------------------");
					for(int i=0; i < agenda.size();i++) {
						System.out.println("Nome: " + agenda.get(i).getNome());
						System.out.println("Telefone: " + agenda.get(i).getTelefone());
						System.out.println("E-mail: " + agenda.get(i).getEmail());
						System.out.println();
					}	
					System.out.println("----------------------------------");
				break;
					
				case 6:
					System.out.println("Agenda fechada");
				break;
				default: System.out.println("Opcao invalida");
			}
		}while(op != 6);
	}
}
