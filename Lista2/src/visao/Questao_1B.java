package visao;
import java.util.ArrayList;
import java.util.Scanner;

public class Questao_1B {
	public static void main(String args[]) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		ArrayList<Integer> B = new ArrayList<Integer>();
		Scanner ler = new Scanner(System.in);
		int valor, somaA=0, geraC;
		int continuar;
		do{
			System.out.println("Digite um valor para A:");
			valor = ler.nextInt();
			A.add(valor);
			
			System.out.println("Deseja continuar? (1 - sim, 0 - nao)");
			continuar = ler.nextInt();
		}while(continuar != 0);
		
		do{
			System.out.println("Digite um valor para B:");
			valor = ler.nextInt();
			B.add(valor);
			
			System.out.println("Deseja continuar? (1 - sim, 0 - nao)");
			continuar = ler.nextInt();
		}while(continuar != 0);
		
		for(int i=0; i < A.size();i++) {
			somaA += A.get(i);
		}

		System.out.println("Soma dos elementos de A: " + somaA);
		
		ArrayList<Integer> C = new ArrayList<Integer>();
		
		if(A.size() > B.size())
			geraC = B.size();
		else
			geraC = A.size();
		
		for(int i=0; i < geraC;i++) {
			C.add(A.get(i) + B.get(i));
		}
		
		System.out.println("Vetor C: ");
		

		for(int i=0; i < C.size();i++) {
			System.out.print(C.get(i) + " ");
		}
		
		
		}
}
