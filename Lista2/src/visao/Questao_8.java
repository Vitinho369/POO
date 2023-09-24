package visao;
import aplicacao.Musica;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Questao_8 {

	public static void main(String[] args) {
		ArrayList<Musica> playlist = new ArrayList<Musica>();
		ArrayList<Integer> repeticao = new ArrayList<Integer>();
		Musica musica;
		String nome, cantor, titulo;
		int duracaoMin, duracaoSeg;
		Scanner ler = new Scanner(System.in);
		boolean encontraMusica, tocarIgual;
		Random tocar = new Random();
		int op, opMusica, musicaToc,contTempo, contMusica;
		
		do {
			System.out.println("------------------------------------------------------------");
			System.out.println("PLAYLIST");
			System.out.println("------------------------------------------------------------");
			System.out.println("1 - Adicionar uma musica"); 
			System.out.println("2 - Excluir uma musica");
			System.out.println("3 - Tocar uma musica especifica (pelo titulo)");
			System.out.println("4 - Tocar as musicas de um cantor");
			System.out.println("5 - Tocar as musicas em sequencia");
			System.out.println("6 - Tocar as musicas embaralhadas (random)"); 
			System.out.println("7 - Ver as musicas da playlist");
			System.out.println("8 - Sair");
			System.out.println("------------------------------------------------------------");
			op = ler.nextInt();
			
			switch(op) {
				case 1:
					ler.nextLine();
					System.out.println("Qual o nome da musica?");
					nome = ler.nextLine();
					System.out.println("Qual o nome do cantor?");
					cantor = ler.nextLine();
					System.out.println("Quantos minutos a musica tem?");
					duracaoMin = ler.nextInt();
					System.out.println("Quantos segundos a musica tem?");
					duracaoSeg = ler.nextInt();

					musica = new Musica(nome, cantor, duracaoMin,duracaoSeg);
					encontraMusica = false;
					for(int i=0; i < playlist.size();i++) {
						if(playlist.get(i).equals(musica)) {
							encontraMusica = true;
						}
					}
					
					if(!encontraMusica) {
						playlist.add(musica);
						System.out.println("Musica adiconada a playlist com sucesso");
					}else {
						System.out.println("Musica ja existente na playlist");
					}
				break;
				
				case 2:
					System.out.println("\n------------------------------------------------------------");
					System.out.println("PLAYLIST");
					for(int i=0; i < playlist.size();i++) {
						System.out.println(i+1 +" - "+playlist.get(i).getNome());
					}
					System.out.println("------------------------------------------------------------\n");
					
					System.out.println("Digite o numero da musica que deseja excluir:");
					opMusica = ler.nextInt();
					
					playlist.remove(opMusica-1);
				break;
				
				case 3:
					System.out.println("\n------------------------------------------------------------");
					System.out.println("PLAYLIST");
					for(int i=0; i < playlist.size();i++) {
						System.out.println("\t\t"+playlist.get(i).getNome());
					}
					System.out.println("------------------------------------------------------------\n");
					ler.nextLine();
					System.out.println("Digite o titulo da musica que deseja tocar:");
					titulo = ler.nextLine();
					opMusica = -1;
					for(int i=0; i < playlist.size();i++) {
						if(playlist.get(i).getNome().equals(titulo)) {
							opMusica = i;
						}
					}
					
					if(opMusica == -1) {
						System.out.println("Musica nao encontrada");
					}else {	
						System.out.println("\n------------------------------------------------------------");
						System.out.println("\t\t"+titulo);	
						System.out.println("\t\t"+ playlist.get(opMusica).getCantor());
						System.out.println("------------------------------------------------------------\n");
						contTempo = 0;
						for(int cont=0;cont<playlist.get(opMusica).getDuracaoTotal(); cont++) { 
							 try{ 
								 Thread.sleep(1000); // pausa de 1 segundo 
							 }catch(InterruptedException e){ 
								 System.out.println("Erro na execução da música: "+e.getMessage()); 
							 } 
							 System.out.print("|"); 
							 contTempo++;
							 if(contTempo > 60) {
								 System.out.println();
								 contTempo = 0;
							 }
						} 
						System.out.println();
					}
				break;
				
				case 4:
					System.out.println("\n------------------------------------------------------------");
					System.out.println("Cantores");
					for(int i=0; i < playlist.size();i++) {
						System.out.println("\t\t"+playlist.get(i).getCantor());
					}
					System.out.println("------------------------------------------------------------\n");
					ler.nextLine();
					System.out.println("Digite o nome de um cantor:");
					cantor = ler.nextLine();
					encontraMusica = false;
					for(int i=0; i < playlist.size();i++) {
						if(playlist.get(i).getCantor().equals(cantor)) {
							encontraMusica = true;
						}
					}
					
					if(!encontraMusica) {
						System.out.println("Este cantor nao possui musicas na playlist");
					}else {
						contTempo = 0;
						for(int i=0; i < playlist.size();i++) {
							if(playlist.get(i).getCantor().equals(cantor)) {
								System.out.println("\n------------------------------------------------------------");
								System.out.println("\t"+playlist.get(i).getNome());	
								System.out.println("\t"+ playlist.get(i).getCantor());
								System.out.println("------------------------------------------------------------\n");
								for(int cont=0;cont<playlist.get(i).getDuracaoTotal(); cont++) { 
									 try{ 
										 Thread.sleep(1000); // pausa de 1 segundo 
									 }catch(InterruptedException e){ 
										 System.out.println("Erro na execução da música: "+e.getMessage()); 
									 } 
									 System.out.print("|"); 
									 contTempo++;
									 if(contTempo > 60) {
										 System.out.println();
										 contTempo = 0;
									 }
								} 
							 }
							System.out.println();
						}
					}
					
				break;
				
				case 5:
					System.out.println("Tocando playlist em sequencia");
					contTempo = 0;
					for(int i=0; i < playlist.size();i++) {
						System.out.println("\n------------------------------------------------------------");
						System.out.println("\t"+playlist.get(i).getNome());	
						System.out.println("\t"+ playlist.get(i).getCantor());
						System.out.println("------------------------------------------------------------\n");
						for(int cont=0;cont<playlist.get(i).getDuracaoTotal(); cont++) { 
							 try{ 
								 Thread.sleep(1000); // pausa de 1 segundo 
							 }catch(InterruptedException e){ 
								 System.out.println("Erro na execução da música: "+e.getMessage()); 
							 } 
							 System.out.print("|"); 
							 contTempo++;
							 if(contTempo > 60) {
								 System.out.println();
								 contTempo = 0;
							 }
						} 
						System.out.println();
					}
					
				break;
				
				case 6:
					contMusica = playlist.size();
					System.out.println("Tocando playlist aleatoriamente");
					while(contMusica > 0){
						
						do {
							musicaToc = tocar.nextInt(playlist.size());
							tocarIgual = false;
					
							for(int i=0; i < repeticao.size();i++) {
								if(musicaToc == repeticao.get(i)) {
									tocarIgual = true;
								}
							}
						}while(tocarIgual);
						repeticao.add(musicaToc);
						
						System.out.println("\n------------------------------------------------------------");
						System.out.println("\t"+playlist.get(musicaToc).getNome());	
						System.out.println("\t"+ playlist.get(musicaToc).getCantor());
						System.out.println("------------------------------------------------------------\n");
						contTempo = 0;
						for(int cont=0;cont<playlist.get(musicaToc).getDuracaoTotal(); cont++) { 
							 try{ 
								 Thread.sleep(1000); // pausa de 1 segundo 
							 }catch(InterruptedException e){ 
								 System.out.println("Erro na execução da música: "+e.getMessage()); 
							 } 
							 System.out.print("|"); 
							 contTempo++;
							 if(contTempo > 60) {
								 System.out.println();
								 contTempo = 0;
							 }
						}
						
						contMusica--;
					}
					
				break;
				
				case 7:	
					System.out.println("\n------------------------------------------------------------");
					System.out.println("Playlist");						
					System.out.println("------------------------------------------------------------\n");
					for(int i=0; i < playlist.size();i++) {
						System.out.println();
						System.out.println("\tNome: "+playlist.get(i).getNome());
						System.out.println("\tCantor: "+playlist.get(i).getCantor());
						System.out.println("\tDuracao"+playlist.get(i).getDuracaoMin() + ":"+ playlist.get(i).getDuracaoSeg());
						System.out.println("\tDuracao total (segundos)"+playlist.get(i).getDuracaoTotal());
						System.out.println();
					}
				break;
				
				case 8:
					System.out.println("Fim de programa");
				break;
				default:
					System.out.println("Opcao invalida");
			}
		}while(op != 8);
	}

}