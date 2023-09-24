package visao;
import java.util.Scanner;
import aplicacao.Pais;
import java.util.ArrayList;

public class Questao_7 {

	public static void main(String[] args) {
		ArrayList<Pais> paises = new ArrayList<Pais>(),vizinhos;
		Pais pais, paisCompara;
		String nomePais, nomeCapital;
		float dimensao;
		boolean encontraPais, fronteira;
		Scanner ler = new Scanner(System.in);
		int op, qtdFronteira, opPais;
		
		do {
			System.out.println("1 - Cadastrar pais");
			System.out.println("2 - Mostrar informacoes dos paises");
			System.out.println("3 - Definir fronteira de um pais");
			System.out.println("4 - Retornar fronteira");
			System.out.println("5 - Vizinhos comuns de um pais");
			System.out.println("6 - Sair");
			
			op = ler.nextInt();		
			
			switch(op) {
			
				case 1:
					ler.nextLine();
					System.out.println("Digite o nome do pais:");
					nomePais = ler.nextLine();
					System.out.println("Digite o nome da capital do pais:");
					nomeCapital = ler.nextLine();
					System.out.println("Digite a dimensao do pais em km2");
					dimensao = ler.nextFloat();
					
					pais = new Pais(nomePais, nomeCapital, dimensao);
					
					encontraPais = false;
					for(int i=0; i < paises.size();i++) {
						if(paises.get(i).equals(pais)) {
							encontraPais = true;
						}
					}
					
					if(!encontraPais) {
						paises.add(pais);
						System.out.println("\nPais cadastrado com sucesso!");
					}else {
						System.out.println("Pais ja existente");
					}
				break;
				
				case 2:
					System.out.println("\n--------------------------------");
					for(int i=0; i < paises.size();i++) {
						System.out.println("\nNome do pais: " + paises.get(i).getNome());
						System.out.println("Capital: " + paises.get(i).getCapital());
						System.out.println("Dimensoes: " + paises.get(i).getDimensao());
						System.out.println("Paises que fazem fronteira:");
						
						for(int j=0; j < paises.get(i).getFronteira().size();j++) {
							System.out.println("\t"+paises.get(i).getFronteira().get(j).getNome());
						}
					}
					System.out.println("--------------------------------\n");
					
					break;
					
				case 3:
					
					System.out.println("\n--------------------------------");
					System.out.println("Paises cadastrados:");
					for(int i=0; i < paises.size();i++) {
						System.out.println(i+1 + " - " + paises.get(i).getNome());
					}

					System.out.println("--------------------------------\n");

					System.out.println("\nQual o pais que deseja definir a fronteira?");
					opPais = ler.nextInt();
					
					paisCompara = paises.get(opPais-1);
					System.out.println("Quantos paises deseja definir como fronteira?");
					qtdFronteira = ler.nextInt();
					
					for(int i=0; i < qtdFronteira;i++) {
						do {
							System.out.println("Digite uma opcao do pais ");
							opPais = ler.nextInt();
							pais = paises.get(opPais-1);
							fronteira = paisCompara.fazerFronteira(pais);
							if(!fronteira) {
								System.out.println("Fronteira igual ao pais selecionado, digite novamente");
							}
							
						}while(!fronteira);
					}
					break;
					
				case 4:
					System.out.println("\n--------------------------------");
					System.out.println("Paises cadastrados:");
					for(int i=0; i < paises.size();i++) {
						System.out.println(i+1 + " - " + paises.get(i).getNome());
					}

					System.out.println("--------------------------------\n");
					System.out.println("Digite o pais que deseja visualizar a fronteira:");
					opPais = ler.nextInt();
					
					System.out.println("Fronteira do pais " + paises.get(opPais-1).getNome());
					for(int i=0; i < paises.get(opPais-1).getFronteira().size();i++) {
						System.out.println(paises.get(opPais-1).getFronteira().get(i).getNome());
					}
				break;
				
				case 5:
					System.out.println("\n--------------------------------");
					System.out.println("Paises cadastrados:");
					for(int i=0; i < paises.size();i++) {
						System.out.println(i+1 + " - " + paises.get(i).getNome());
					}
					
					System.out.println("Digite um pais que deseja verificar a fronteira:");
					opPais = ler.nextInt();
					
					paisCompara = paises.get(opPais-1);
					
					System.out.println("Digite o pais que deseja comparar a fronteira:");
					opPais = ler.nextInt();
					
					pais = paises.get(opPais-1);
					
					vizinhos = paisCompara.vizinhosComuns(pais);

					System.out.println("\n--------------------------------");
					System.out.println("Vizinhos em comum:");
					for(int i=0; i < vizinhos.size();i++) {
						System.out.println(vizinhos.get(i).getNome());
					}
					System.out.println("--------------------------------\n");
				break;
				
				case 6: 
					System.out.println("Fim de programa");
				break;
				
				default: System.out.println("Opcao invalida");
			}
		}while(op != 6);
	}

}
