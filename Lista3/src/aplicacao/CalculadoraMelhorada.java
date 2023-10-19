package aplicacao;
public class CalculadoraMelhorada extends Calculadora{
	private String memoria;
	
	private double potencia() {
		return Math.pow(this.getOperando1(),this.getOperando2());
	}
	
	public String verUltimaOperacao() {
		return this.memoria;
	}
	
	public double calcular() {
		double resultado=0;
		this.memoria = this.getOperador();
		if(this.getOperador().equals("^")) {
			resultado = this.potencia();
		}else{
			resultado = super.calcular();
		}
		
		return resultado;
	}
}
