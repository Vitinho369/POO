package aplicacao;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	
	public Data(int dia, int mes, int ano) {
		
		if((dia > 0 && mes > 0 && ano> 0) && mes < 12) {
			switch(mes) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 11:
					if(dia > 31) {
						this.dia = 1;
						this.mes = 1;
						this.ano = 1;
					}else {
						this.dia = dia;
						this.mes = mes;
						this.ano = ano;
					}
					break;
				
				case 2:
					if(dia > 28) {
						this.dia = 1;
						this.mes = 1;
						this.ano = 1;
					}else {
						this.dia = dia;
						this.mes = mes;
						this.ano = ano;
					}
					break;
				case 4:
				case 6:
				case 9:
				case 12:
					if(dia > 30) {
						this.dia = 1;
						this.mes = 1;
						this.ano = 1;
					}else {
						this.dia = dia;
						this.mes = mes;
						this.ano = ano;
					}
				break;
			}
		}else {
			this.dia = 1;
			this.mes = 1;
			this.ano = 1;
		}
	}
	
	public int compara(Data date) {
		
		if(this.dia == date.getDia() &&
			this.mes == date.getMes() &&
			this.ano == date.getAno()) {
			return 0;
		}else if((this.dia > date.getDia() && this.mes == date.mes && this.ano == date.ano)||
			(this.mes > date.getMes() && this.ano == date.ano) ||
			this.ano > date.getAno()) {
			return 1;
		}else {
			return -1;
		}
	}
	
	public int getDia() {
		return this.dia;
	}
	
	public int getMes() {
		return this.mes;
	}
	
	public String getMesExtenso() {
		switch(this.mes) {
			case 1: return "Janeiro";
			case 2: return "Fevereiro";
			case 3: return "Marco";
			case 4: return "Abril";
			case 5: return "Maio";
			case 6: return "Junho";
			case 7: return "Julho";
			case 8: return "Agosto";
			case 9: return "Setembro";
			case 10: return "Outubro";
			case 11: return "Novembro";
			case 12: return "Dezembro";
			default: return "";
		}
	}
	
	public int getAno() {
		return this.ano;
	}
	
	public Data clone() {
		Data cloneData = new Data(this.dia, this.mes, this.ano);
		return cloneData;
	}
}
