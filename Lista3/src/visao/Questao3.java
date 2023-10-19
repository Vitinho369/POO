package visao;
import java.util.Scanner;

import aplicacao.Data;
import aplicacao.Voo;
import aplicacao.VooMarcado;

public class Questao3 {
	public static void main(String args[]) {
		
		int numVoo, dia, mes, ano,op, numCadeira, qtdCadeiras;
		Data data;
		Scanner ler = new Scanner(System.in);
		int numFumantes, cadeirasFumantes;
		VooMarcado voo;
		Voo vooClone;
		System.out.println("Digite o numero do voo:");
		numVoo = ler.nextInt();
		System.out.println("Digite o dia do voo:");
		dia = ler.nextInt();
		System.out.println("Digite o mes do voo:");
		mes = ler.nextInt();
		System.out.println("Digite o ano do voo:");
		ano = ler.nextInt();
		data = new Data(dia, mes, ano);
		
		System.out.println("Qual a quantidade de lugares par fumantes?");
		numFumantes = ler.nextInt();
		voo = new VooMarcado(numVoo, data, numFumantes);
		
		do {
			System.out.println("1 - Definir quantidade de cadeiras");
			System.out.println("2 - Ocupar cadeira");
			System.out.println("3 - Ver se cadeira esta disponivel");
			System.out.println("4 - Ver numero do voo");
			System.out.println("5 - Ver data do voo");;
			System.out.println("6 - Verificar numero de cadeiras livres");
			System.out.println("7 - Proxima cadeira livre");
			System.out.println("8 - Clonar o voo");
			System.out.println("9 - Ocupar cadeira");
			System.out.println("10 - Definir assentos para fumantes");
			System.out.println("11 - Tipo da cadeira");
			System.out.println("12 - Sair");
			op = ler.nextInt();
			
			switch(op) {
				case 1:
					System.out.println("Qual a quantidade maxima de cadeiras?");
					qtdCadeiras = ler.nextInt();
					voo.maxVagas(qtdCadeiras);
				break;
				
				case 2:
					System.out.println("Qual cadeira deseja ocupar? Numeros de cadeiras entre 1 e 100");
					numCadeira = ler.nextInt();
					if(voo.ocupa(numCadeira)) {
						System.out.println("Cadeira ocupada com sucesso");
					}else {
						System.out.println("Nao foi possivel ocupar cadeira");
					}
				break;
				
				case 3:
					System.out.println("Qual a cadeira seja ver se esta disponivel?");
					numCadeira = ler.nextInt();
					if(voo.verifica(numCadeira)) {
						System.out.println("Cadeira ocupada");
					}else {
						System.out.println("Cadeira desocupada");
					}
					break;
					
				case 4:
					System.out.println("Numero do voo:"+voo.getVoo());
					break;
					
				case 5:
					data = voo.getData();
					System.out.print("Data do voo: ");
					System.out.println(data.getDia() + "/" + data.getMes() + "/" + data.getAno());
					break;
				
				case 6:
					System.out.println("Numero de cadeiras livres: " + voo.vagas());
					break;
					
				case 7:
					System.out.println("Proxima cadeira livre:"+voo.proximoLivre());
					break;
					
				case 8:
					vooClone = voo.clone();
					System.out.println("Voo clonado com sucesso");
					System.out.println("Numero do voo clonado: "+vooClone.getVoo());
					break;
				
				case 9:
					System.out.println("Qual cadeira deseja ocupar?");
					numCadeira = ler.nextInt();
					
					if(voo.ocupa(numCadeira))
						System.out.println("Cadeira ocupada com sucesso");
					else
						System.out.println("Nao foi possivel ocupar a cadeira");
					break;
					
				case 10:
					System.out.println();
					cadeirasFumantes = ler.nextInt();
					
					
					break;
				case 11:
					System.out.println("Digite o numero da cadeira:");
					numCadeira = ler.nextInt();
					
					if(voo.tipo(numCadeira).equals("F")) {
						System.out.println("Assento para fumante");
					}else {
						System.out.println("Assento para nao fumante");
					}
					break;
			}
		}while(op != 10);
		
		System.out.println("Fim de programa");
	}
}
