package visao;
import java.util.Scanner;
import java.util.ArrayList;
import aplicacao.Pedido;

public class Questao_2 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
		Pedido pedido;
		int codPedido = 0, codBusca;
		boolean encontraPed;
		int confirmar;
		
		int op;
		do {
			
			System.out.println("1 - Fazer Pedido");
			System.out.println("2 - Confirmar Entrega");
			System.out.println("3 - Ver Perdidos Confirmados");
			System.out.println("4 - Ver Perdidos Entregues");
			System.out.println("5 - Sair");
			
			op = ler.nextInt();
			boolean hora = true, minuto=true;
			
			switch(op) {
				case 1:
					codPedido++;
					System.out.println("Fazendo pedido...");
					pedido = new Pedido();
					do {
						do {
							if(!hora) {
								System.out.println("Formato de hora nao aceito");
							}
							System.out.println("Digite a hora da compra:");
							hora = pedido.setHora(ler.nextInt());
						}while(!hora);
						
						do {
							if(!minuto) {
								System.out.println("Formato de minuto nao aceito");
							}
							System.out.println("Digite o minuto da compra:");
							minuto = pedido.setMinuto(ler.nextInt());
						}while(!minuto);
						
						pedido.setCodPedido(codPedido);
						
						System.out.println("Digite o endereco de entrega:");
						ler.nextLine();
						pedido.setEndEntrega(ler.nextLine());
						
						System.out.println("Confirme os dados do pedido (1 - avancar, 0 - alterar): ");
						System.out.println("Hora do pedido: " + pedido.getHora() + ":" + pedido.getMinuto());
						System.out.println("Endereco de entrega: " + pedido.getEndEntrega());
						confirmar = ler.nextInt();
					}while(confirmar == 0);
					
					System.out.println("Quantos botijoes deseja inserir no pedido?");
					pedido.setQtdBotijoes(ler.nextInt());
					
					pedido.setTotCompra(pedido.getQtdBotijoes() * 60);
					
					pedido.setHoraEntrega();
					
					System.out.println("Digite o numero do seu cartao:");
					ler.nextLine();
					pedido.setNumCartao(ler.nextLine());
					
					pedido.setStatus("confirmado");
					System.out.println("Pedido confirmado!");
					System.out.println("Dados:");	
					System.out.println("\n---------------------------------------------------");
					System.out.println("\tCodigo: " + pedido.getCodPedido());
					System.out.println("\tStatus: " + pedido.getStatus());
					System.out.println("\tHora do pedido: " + pedido.getHora() + ":" + pedido.getMinuto());
					System.out.println("\tHora prevista para entrega: " + pedido.getHoraEntrega() + ":" + pedido.getMinutoEntrega());
					System.out.println("\tNumero do cartao: " + pedido.getNumCartao());
					System.out.println("\tQuantidade de botijoes: " + pedido.getQtdBotijoes());
					System.out.println("\tTotal da compra: " + pedido.getTotCompra());
					System.out.println("----------------------------------------------------\n");
					
				
					System.out.println();
					pedidos.add(pedido);
					break;
					
				case 2:
					System.out.println("Digite o codigo do pedido que deseja confirmar:");
					codBusca = ler.nextInt();
					encontraPed = false;
					for(int i=0;i < pedidos.size();i++) {
						if(pedidos.get(i).getCodPedido() == codBusca) {
							pedidos.get(i).setStatus("entregue");
							i = pedidos.size();
							encontraPed = true;
						}
					}
					
					if(!encontraPed) 
							System.out.println("Pedido nao encontrado");
						else
							System.out.println("Pedido marcado como entregue");
					System.out.println();
					break;
				case 3:
					encontraPed = false;
					System.out.println("Pedidos em aberto:");
					
					for(int i=0; i < pedidos.size();i++) {
						if(pedidos.get(i).getStatus().equals("confirmado")) {
							System.out.println();
							System.out.println("---------------------------------------------------");
							System.out.println("Codigo: " + pedidos.get(i).getCodPedido());
							System.out.println("Hora do pedido: " + pedidos.get(i).getHora() + ":" + pedidos.get(i).getMinuto());
							System.out.println("Hora prevista para entrega: " + pedidos.get(i).getHoraEntrega() + ":" + pedidos.get(i).getMinutoEntrega());
							System.out.println("Numero do cartao: " + pedidos.get(i).getNumCartao());
							System.out.println("Quantidade de botijoes: " + pedidos.get(i).getQtdBotijoes());
							System.out.println("Total da compra: " + pedidos.get(i).getTotCompra());
							System.out.println("---------------------------------------------------");
							System.out.println();
							encontraPed = true;
						}
					}
					
					if(!encontraPed) System.out.println("Sem pedidos com status confirmado");
					System.out.println();
					break;
					
				case 4:
					encontraPed = false;
					System.out.println("Pedidos atendidos:");
					
					for(int i=0; i < pedidos.size();i++) {
						if(pedidos.get(i).getStatus().equals("entregue")) {
							System.out.println();
							System.out.println("---------------------------------------------------");
							System.out.println("Codigo: " + pedidos.get(i).getCodPedido());
							System.out.println("Hora do pedido: " + pedidos.get(i).getHora() + ":" + pedidos.get(i).getMinuto());
							System.out.println("Hora prevista para entrega: " + pedidos.get(i).getHoraEntrega() + ":" + pedidos.get(i).getMinutoEntrega());
							System.out.println("Numero do cartao: " + pedidos.get(i).getNumCartao());
							System.out.println("Quantidade de botijoes: " + pedidos.get(i).getQtdBotijoes());
							System.out.println("Total da compra: " + pedidos.get(i).getTotCompra());
							System.out.println("---------------------------------------------------");
							System.out.println();
							encontraPed = true;
						}
					}
					
					if(!encontraPed) System.out.println("Sem pedidos com status entregue");
					System.out.println();
					break;
					
				case 5:
					System.out.println("Fim de programa");
					break;
				default: System.out.println("Opcao invalida");
					
			}
		}while(op != 5);
	}
}
