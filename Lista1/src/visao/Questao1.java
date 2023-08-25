package visao;
import java.util.Scanner;
import aplicacao.Cachorro;

public class Questao1 {
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);
		String nome, raca;
		int idade;
		
		Cachorro c1 = new Cachorro("cachorro sem nome", "nehuma raca definida", 0);
		
		System.out.println("Informacoes do cachorro:");
		System.out.println("Nome: " + c1.getNome());
		System.out.println("Raca: " + c1.getRaca());
		System.out.println("Idade: " + c1.getIdade());
	
		System.out.println("Digite um novo nome: ");
		nome = teclado.nextLine();
		c1.setNome(nome);
		System.out.println("Digite uma nova raca: ");
		raca = teclado.nextLine();
		c1.setRaca(raca);
		System.out.println("Digite uma nova idade: ");
		idade = teclado.nextInt();
		c1.setIdade(idade);
		
		System.out.println("\nEstado atual: ");
		System.out.println(c1.informarEstado());
		
		Cachorro c2 = new Cachorro(nome,raca,idade);
		
		System.out.println("\nEstado do clone: ");
		System.out.println(c2.informarEstado());
	}
}