package aplicacao;

public class A {
	private int num;
	
	public A() {
		
	}
	
	public static void escreverA() {
		System.out.println("escrevendo");
	}
	
	public A(int n) {
		this.num = n;
	}
	
	public int getNum() {
		return this.num;
	}
	
	public void setNome(int num) {
		this.num = num;
	}
}
