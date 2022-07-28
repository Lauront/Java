package app;
import core.Time;

public class TesteHora {
	public static void main(String[] args) {
		Time t1,t2,t3;
		
		t1 = new Time(12, 0, 0);
		t2 = new Time(0,40,2);
		t3 = new Time(3,30,23);
		Time t4 = new Time(15,34,22);
		
		System.out.println(t1.exibirHoraUniversal());
		System.out.println(t1.ixibirHoraPadrao());
		
		System.out.println(t2.exibirHoraUniversal());
		System.out.println(t2.ixibirHoraPadrao());
		
		
		System.out.println(t3.exibirHoraUniversal());
		System.out.println(t3.ixibirHoraPadrao());
		
		System.out.println(t4.exibirHoraUniversal());
		System.out.println(t4.ixibirHoraPadrao());
		
	}
}
