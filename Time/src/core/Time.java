package core;

public class Time {
	private int hora;
	private int minu;
	private int segu;

	public Time(int hora, int minu, int segu) {
		this.hora = hora;
		this.minu = minu;
		this.segu = segu;
	}

	public Time(int hora, int minu) {
		this.hora = hora;
		this.minu = minu;
		this.segu = 0;
	}

	public Time(int hora) {
		this.hora = hora;
		this.minu = 0;
		this.segu = 0;
	}

	public void setTime(int hora, int minu, int segu) {
		this.hora = hora;
		this.minu = minu;
		this.segu = segu;
	}

	public void setTime(int hora, int minu) {
		this.hora = hora;
		this.minu = minu;
		this.segu = 0;
	}

	public void setTime(int hora) {
		this.hora = hora;
		this.minu = 0;
		this.segu = 0;
	}

	public String exibirHoraUniversal() {
		return this.fmtNum(hora) + ":" + this.fmtNum(minu) + ":" + this.fmtNum(segu);
	}

	public String ixibirHoraPadrao() {
		
		String sufixo;
		String horaPadrao;
		
		if (hora == 00) {
			sufixo = "AM";
			horaPadrao = "12";
			
		} else if (hora == 12) {
			sufixo = "PM";
			horaPadrao = String.valueOf(hora);
			
		} else if (hora > 0 && hora < 12) {
			sufixo = "AM";
			horaPadrao = fmtNum(hora);
			
		} else {
			sufixo = "PM";
			horaPadrao = fmtNum(hora - 12);
		}
		
		return horaPadrao + ":" + this.fmtNum(minu) + ":" + this.fmtNum(segu) + sufixo;
		
	}
	
	private String fmtNum(int num) {
		if (num < 10) {
			return "0"+ String.valueOf(num);
		}
		
		return String.valueOf(num);
	}
}
