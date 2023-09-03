package visao;

import java.util.Scanner;
public class Questao_1A {
	public static void main(String args[]) {
		int[] A = new int[10];
		int[] B = new int[10];
		int i,somaA=0;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite os valores de A:");
		for(i=0; i < 10;i++) {
			A[i] = ler.nextInt();
		}

		System.out.println("Digite os valores de B:");
		for(i=0; i < 10;i++) {
			B[i] = ler.nextInt();
		}
		
		System.out.println("Soma dos elementos de A: ");
		for(i=0;i < 10;i++) {
			somaA += A[i];
		}
		
		System.out.println(somaA);
		
		int[] C = new int[10];
		
		for(i=0;i <10;i++) {
			C[i] = A[i] + B[i];
		}
		
		System.out.println("Vetor C:");
		for(i=0; i < 10;i++) {
			System.out.print(C[i] + " ");
		}
	}
}
