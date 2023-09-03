package aplicacao;


public class Pedido {
	private int hora;
	private int minuto;
	private String endEntrega;
	private int qtdBotijoes;
	private float totCompra;
	private int horaEntrega;
	private int minutoEntrega;
	private String numCartao;
	private String status;
	private int codPedido;
	
	public int getHora() {	
		return this.hora;
	}

	public boolean setHora(int hora) {
		if(hora >= 0 && hora < 24) {
			this.hora = hora;
			return true;
		}else {		
			return false;
		}
	}
	
	public boolean setMinuto(int minuto) {
		if(minuto > 0 && minuto < 60) {
			this.minuto = minuto;
			this.minutoEntrega = minuto;
			return true;
		}else {
			return false;
		}
	}
	
	public int getMinuto() {
		return this.minuto;
	}
	
	public String getEndEntrega() {
		return this.endEntrega;
	}
	
	public void setEndEntrega(String endEntrega) {
		this.endEntrega = endEntrega;
	}
	
	public int getQtdBotijoes() {
		return this.qtdBotijoes;
	}
	
	public void setQtdBotijoes(int qtdBotijoes){
		this.qtdBotijoes = qtdBotijoes;
	}
	
	public float getTotCompra() {
		return this.totCompra;
	}
	
	public void setTotCompra(float totCompra) {
		this.totCompra = totCompra;
	}
	
	public int getHoraEntrega() {
		return this.horaEntrega;
	}
	
	public void setHoraEntrega() {
		if((this.hora + 6) > 24) {
			this.horaEntrega = ((this.hora + 6)-24);
		}else {
			this.horaEntrega = this.hora + 6;
		}
	}
	
	public int getMinutoEntrega() {
		return this.minutoEntrega;
	}
	
	public String getNumCartao() {
		return this.numCartao;
	}
	
	public void setNumCartao(String numCartao) {
		this.numCartao = numCartao;
	}
	
	public String getStatus() {
		return this.status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public int getCodPedido() {
		return this.codPedido;
	}
	
	public void setCodPedido(int codPedido) {
		this.codPedido = codPedido;
	}
}
