package visao;
import java.util.Scanner;
public class Principal {
	public void main(String args[]) {
		
		int op;
		int opSec;
		Scanner ler = new Scanner(System.in);
		do {
			System.out.println("Menu Principal");
			System.out.println("--------------------------");
			
			System.out.println("1 – Buscar Sócio");
			System.out.println("2 – Incluir Sócio");
			System.out.println("3 – Alterar Sócio");
			System.out.println("4 – Excluir Sócio");
			System.out.println("5 – Relatório de Sócios");
			System.out.println("6 – Sair do Sistema");
			op = ler.nextInt();
			
			switch (op) {
			case 1: 
				do {
					System.out.println("Menu Secundário");
					System.out.println("-------------------------");
					System.out.println("1 – Buscar Dependente");
					System.out.println("2 – Incluir Dependente");
					System.out.println("3 – Alterar Dependente");
					System.out.println("4 – Excluir Dependente");
					System.out.println("5 – Relatório de Dependente");
					System.out.println("6 – Voltar para o Menu Principal");
					opSec = ler.nextInt();
					
					switch(opSec) {
						case 1:
							break;
						case 2:
							break;
						case 3:
							break;
						case 4:
							break;
						case 5:
							break;
						default: System.out.println("Opcao invaliada");
					}
					
				}while(opSec != 6);
				
				System.out.println("Voltando para o Menu Principal");
				break;
				
			case 2: 
				break;
			case 3: 
				break;
			case 4: 
				break;
			case 5: 
				break;
			case 6: 
				System.out.println("Fim de programa");
				break;
			default:
				System.out.println("Opcao invalida");
			}
		}while(op != 6);
	}
}
