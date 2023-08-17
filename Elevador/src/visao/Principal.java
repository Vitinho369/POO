package visao;
import aplicacao.Elevador;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int op, capacidade, andares;
		Elevador e = new Elevador();
		do {
			System.out.println();
			System.out.println("1 - Iniciliazar");
			System.out.println("2 - Entrar");
			System.out.println("3 - Sair");
			System.out.println("4 - Subir");
			System.out.println("5 - Descer");
			System.out.println("6 - Sair");
			System.out.println("Digite uma opção: ");
			op = teclado.nextInt();
			
			switch(op) {
			case 1:
				System.out.println("Digite a capacidade do elevador: ");
				capacidade = teclado.nextInt();
				System.out.println("Digite o total de andres do predio: ");
				andares = teclado.nextInt();
				
				e.inicilia(capacidade, andares);
				
				System.out.println("\nElevador inicializado com sucesso");
				break;
				
			case 2:
				if(e.entra()) {
					System.out.println("Entrou uma pessoa");
				}else {
					System.out.println("Capacidade máxima atingida");
				}
				break;
				
			case 3:
				if(e.sai()) {
					System.out.println("Saiu uma pessoa");
				}else {
					System.out.println("Não há mais pessoas no elevador");
				}
				break;
				
			case 4:
				if(e.sobe()) {
					System.out.println("O elevador subiu um andar");
				}else {
					System.out.println("O elevador está no último andar");
				}
				break;
				
			case 5:
				if(e.desce()) {
					System.out.println("O elevador desceu um andar");
				}else {
					System.out.println("O elevador está no térreo");
				}
				break;
				
			case 6:
				System.out.println("Fim de programa");
				break;
				
			default: System.out.println("Opção Inválida");
			}
			
		}while(op != 6);
	}

}
