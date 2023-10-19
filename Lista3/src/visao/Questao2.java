package visao;
import aplicacao.Voo;
import aplicacao.Data;
import java.util.Scanner;

public class Questao2 {
	public static void main(String args[]) {
		int numVoo, dia, mes, ano,op, numCadeira;
		Data data;
		Scanner ler = new Scanner(System.in);
		Voo voo, vooClone;
		
		System.out.println("Digite o numero do voo:");
		numVoo = ler.nextInt();
		System.out.println("Digite o dia do voo:");
		dia = ler.nextInt();
		System.out.println("Digite o mes do voo:");
		mes = ler.nextInt();
		System.out.println("Digite o ano do voo:");
		ano = ler.nextInt();
		
		data = new Data(dia, mes, ano);
		voo = new Voo(numVoo, data);
		
		do {
			System.out.println("1 - Ocupar cadeira");
			System.out.println("2 - Ver se cadeira esta disponivel");
			System.out.println("3 - Ver numero do voo");
			System.out.println("4 - Ver data do voo");;
			System.out.println("5 - Verificar numero de cadeiras livres");
			System.out.println("6 - Proxima cadeira livre");
			System.out.println("7 - Clonar o voo");
			System.out.println("8 - Ocupar cadeira");
			System.out.println("9 - Sair");
			op = ler.nextInt();
			
			switch(op) {
				case 1:
					System.out.println("Qual cadeira deseja ocupar? Numeros de cadeiras entre 1 e 100");
					numCadeira = ler.nextInt();
					if(voo.ocupa(numCadeira)) {
						System.out.println("Cadeira ocupada com sucesso");
					}else {
						System.out.println("Nao foi possivel ocupar cadeira");
					}
				break;
				
				case 2:
					System.out.println("Qual a cadeira seja ver se esta disponivel?");
					numCadeira = ler.nextInt();
					if(voo.verifica(numCadeira)) {
						System.out.println("Cadeira ocupada");
					}else {
						System.out.println("Cadeira desocupada");
					}
					break;
					
				case 3:
					System.out.println("Numero do voo:"+voo.getVoo());
					break;
					
				case 4:
					data = voo.getData();
					System.out.print("Data do voo: ");
					System.out.println(data.getDia() + "/" + data.getMes() + "/" + data.getAno());
					break;
				
				case 5:
					System.out.println("Numero de cadeiras livres: " + voo.vagas());
					break;
					
				case 6:
					System.out.println("Proxima cadeira livre:"+voo.proximoLivre());
					break;
					
				case 7:
					vooClone = voo.clone();
					System.out.println("Voo clonado com sucesso");
					System.out.println("Numero do voo clonado: "+vooClone.getVoo());
					break;
				
				case 8:
					System.out.println("Qual cadeira deseja ocupar?");
					numCadeira = ler.nextInt();
					
					if(voo.ocupa(numCadeira))
						System.out.println("Cadeira ocupada com sucesso");
					else
						System.out.println("Nao foi possivel ocupar a cadeira");
					break;
			}
		}while(op != 9);
		
		System.out.println("Fim de programa");
	}
}
