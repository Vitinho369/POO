package aplicacao;

public class Calculadora {
	private String operador;
	private double operando1;
	private double operando2;
	
	public Calculadora() {
		this.operador = "";
		this.operando1 = 0;
		this.operando2 = 0;
	}
	
	public void setOperador(String op1) {
		this.operador = op1;
	}
	
	public String getOperador() {
		return this.operador;
	}
	
	public void setOperando1(double op1) {
		this.operando1 = op1;
	}
	
	public void setOperando2(double op2) {
		this.operando2 = op2;
	}
	
	public double getOperando1() {
		return this.operando1;
	}
	
	public double getOperando2() {
		return this.operando2;
	}
	
	private double soma() {
		return this.operando1+this.operando2;
	}
	
	private double subtracao() {
		return this.operando1-this.operando2;
	}
	
	private double divisao() {
		return this.operando1/this.operando2;
	}
	
	private double multiplicacao() {
		return this.operando1*this.operando2;
	}
	
	public double calcular() {
		double resultado = 0;
		
		if(this.operador.equals("+")) {
				resultado = this.soma();
		}else if(this.operador.equals("-")) {
				resultado = this.subtracao();
		}else if(this.operador.equals("*")) {
				resultado = this.multiplicacao();
		}else if(this.operador.equals("/")) {
				resultado = this.divisao();
		}
		return resultado;
	}
	
}
