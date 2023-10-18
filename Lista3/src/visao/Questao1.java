package visao;
import aplicacao.Calculadora;
import aplicacao.CalculadoraMelhorada;
import java.util.Scanner;
public class Questao1 {
	public static void main(String args[]) {
		Calculadora c = new Calculadora();
		CalculadoraMelhorada cM = new CalculadoraMelhorada();
		int op, calc, opCalc, operacaoU;
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.println("Voce deseja usar a calculadora normal o melhorada?");
			System.out.println("1 - Calculadora Normal");
			System.out.println("2 - Calculadora Melhorada");
			System.out.println("3 - Nenhuma");
			calc = ler.nextInt();
			opCalc=-1;
			if(calc < 3) {
				do {
					if(calc > 1 && opCalc != -1) {
						System.out.println("Deseja ver a utlima operacao? 1- sim,0 - nao");
						operacaoU = ler.nextInt();
						if(operacaoU == 1) {
							System.out.println("Ultima operacao: " + cM.verUltimaOperacao());
						}
					}
					
					
					System.out.println("Digite o operando 1:");
					
					if(calc == 1) {
						c.setOperando1(ler.nextDouble());
					}else {
						cM.setOperando1(ler.nextDouble());
					}

					if(calc == 1) {
						System.out.println("Digite a operacao (+,-,/,*):");
					}else {
						System.out.println("Digite a operacao (+,-,/,*,^):");
					}
					if(calc == 1) {
						c.setOperador(ler.next());
					}else {
						cM.setOperador(ler.next());
					}
					
					System.out.println("Digite o operando 2:");
					
					if(calc == 1) {
						c.setOperando2(ler.nextDouble());
					}else {
						cM.setOperando2(ler.nextDouble());
					}
					
					if(calc == 1) {
						System.out.println(c.getOperando1() + c.getOperador() + c.getOperando2()
						+ " = " + c.calcular());
					}else {
						System.out.println(cM.getOperando1() + cM.getOperador() + cM.getOperando2()
						+ " = " + cM.calcular());
					}
					
					
					System.out.println("Deseja continuar? 1-sim, 0-nao");
					opCalc = ler.nextInt();
				}while(opCalc != 0);
			}			
			
			if(calc != 3) {
				System.out.println("Continuar para usar outra calculadora? 1 - sim, 0 - nao");
				op = ler.nextInt();
			}else {
				op  = 0;
			}
		}while(op!=0);
	}
}
