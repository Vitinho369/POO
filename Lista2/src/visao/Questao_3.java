package visao;
import aplicacao.Robo;
import java.util.Scanner;

public class Questao_3 {

	public static void main(String[] args) {
		Robo r1 = new Robo();
		char [][] sala = new char[20][40];
		Scanner ler = new Scanner(System.in);
		int op;
		
		do {
			System.out.println("\033[2J");
			for(int i =0; i < sala.length;i++) {
				for(int j=0; j < sala[i].length;j++) {
					if(i == r1.getLinha() && j == r1.getColuna()) {
						sala[i][j] = '1';
					}else {
						sala[i][j] = '-';
					}
					System.out.print(sala[i][j]);
				}
				System.out.println();
			}
			
			System.out.println("1 - Andar para Frente");
			System.out.println("2 - Andar para Trás");
			System.out.println("3 - Andar para Direita");
			System.out.println("4 - Andar para Esquerda");
			System.out.println("5 - Sair");
			op = ler.nextInt();
			
			switch(op) {
				case 1:
					r1.andarFrente();
				break;
				
				case 2:
					r1.andarTras();
				break;
					
				case 3:
					r1.andarDireita();
				break;
				
				case 4:
					r1.andarEsquerda();
				break;
				
				case 5:
					System.out.println("Fim de Programa");
				break;
				
				default: System.out.println();
			}
		
		}while(op !=5);
	}
		

}
