package app;

import model.Conta;
import model.ContaEspecial;

public class PIBank {
	public static void main(String[] args) {
		Conta c1 = new Conta("Lauro", "124.123.144-4", 1, 14440);
		Conta c2 = new ContaEspecial("Lauro Felipe", "124341314", 2, 14454, 4332);
	
		System.out.println(c1);
		System.out.println(c2);
		
		c1.debitar(14000);
		c2.debitar(15000);
		
		System.out.println(c1.getSaldo());
		System.out.println(c2.getSaldo());
	}
}
