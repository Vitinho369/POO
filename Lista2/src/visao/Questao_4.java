package visao;
import java.util.Scanner;
import java.util.ArrayList;
import aplicacao.Ingresso;

public class Questao_4 {

	public static void main(String[] args) {
		ArrayList<Ingresso> Sala = new ArrayList<Ingresso>();
		Ingresso ingresso;
		Scanner ler = new Scanner(System.in);
		int op, cod = 0,numPoltrona, codBusca;
		String cpf, nomeFilme;
		int meia;
		boolean encontrar, encontraPolt;
		
		do {
			System.out.println("\n------------------------");
			System.out.println("Venda de Ingressos");
			System.out.println("1 - Comprar Ingresso");
			System.out.println("2 - Alterar Ingresso");
			System.out.println("3 - Desistir do Ingresso");
			System.out.println("------------------------");
			op = ler.nextInt();
			
			switch(op){
				case 1:
					System.out.println("Digite seu cpf: ");
					ler.nextLine();
					cpf = ler.nextLine();
					
					System.out.println("Qual o nome do filme que deseja ver?");
					nomeFilme = ler.nextLine();

					do {
						encontraPolt = false;
		
						System.out.println("Qual o numero da poltrona?");
						numPoltrona = ler.nextInt();							
						for(int i=0; i < cod;i++) {
								if(Sala.get(i).getNumPoltrona() == numPoltrona) {
									encontraPolt = true;
									break;
								}
							}
					
						
					if(encontraPolt)
						System.out.println("Poltrona ja ocupada, digite novamente");
					
					}while(encontraPolt);
					
					System.out.println("Qual a categoria do ingresso? (1 - meia, 0 - inteira)");
					meia = ler.nextInt();
					
					if(cod < 120)
						cod++;
					
					ingresso = new Ingresso(cod, cpf, nomeFilme, numPoltrona, meia);
					System.out.println(ingresso.getCodigo());
					Sala.add(ingresso);
				break;
				
				case 2:
					
					System.out.println("Digite o codigo do ingresso que deseja alterar: ");
					codBusca = ler.nextInt();
					encontrar = false;
					for(int i=0;i < cod;i++) {
						if(Sala.get(i).getCodigo() == codBusca) {
							ler.nextLine();
							System.out.println("Digite o nome do filme:");
							nomeFilme = ler.nextLine();
							Sala.get(i).setNomeFilme(nomeFilme);
							
							encontrar = true;
							do {
								encontraPolt = false;
								System.out.println("Digite o numero a poltrona:");
								numPoltrona = ler.nextInt();
								if(numPoltrona <= 120) {
								for(int j=0;j < cod;j++) {
										if(Sala.get(j).getNumPoltrona() == numPoltrona && Sala.get(j).getCodigo() != codBusca) {
											encontraPolt = true;
											break;
										}
									}
								}
								if(encontraPolt)
									System.out.println("Poltrona ja ocupada, digite novamente");
						
							}while(encontraPolt);
							
							Sala.get(i).setNumPoltrona(numPoltrona);
							
							System.out.println("Digite o novo cpf:");
							ler.nextLine();
							cpf = ler.nextLine();
							
							Sala.get(i).setCpf(cpf);
							
							System.out.println("Qual o nome do novo filme?");
							nomeFilme = ler.nextLine();
							
							Sala.get(i).setNomeFilme(nomeFilme);
							
							System.out.println("Qual a categoria do ingresso? (1 - meia, 0 - inteira)");
							meia = ler.nextInt();
							
							Sala.get(i).setValorIngresso(meia);
						}
					}
					
					if(!encontrar) System.out.println("Ingresso nao encontrado");
				break;
				
				case 3:
					
					System.out.println("Digite o codigo do ingresso que voce deseja desistir: ");
					codBusca = ler.nextInt();
					encontrar = false;
					for(int i=0; i < cod;i++) {
						if(Sala.get(i).getCodigo() == codBusca) {
							encontrar = true;
							System.out.println("Apagando ingresso......");
							Sala.remove(i);
							cod--;
							break;
						}
					}
					
					if(!encontrar) System.out.println("Ingresso nao encontrado");
					
				break;
				
				case 4:
					System.out.println("Fim de Programa");
				break;
				
				default: System.out.println("Opcao Invalida");
			}
		}while(op != 4);
		
	}

}
