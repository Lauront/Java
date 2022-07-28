package userinterface;

import model.Chefe;
import model.Comissionado;
import model.Empreiteiro;
import model.Funcionario;
import model.Horista;

public class FolhaDePagamento {
	public static void main(String[] args) {
		Funcionario f1, f2, f3, f4;
		
		f1 = new Chefe(1, "Lauro Chefe", 5000.0, 15, 500);
		f2 = new Comissionado(2, "Ana Vendedora", 4000.00, 35.0);
		f3 = new Horista(3, "Mateus Engenheiro", 80, 150);
		f4 = new Empreiteiro(4, "Morgana Construtora", 5872.35);
		
		System.out.println(f1.getNumRegistro() + " - " + f1.getNome() + " R$ " + f1.calcularSalario());
		System.out.println(f2.getNumRegistro() + " - " + f2.getNome() + " R$ " + f2.calcularSalario());
		System.out.println(f3.getNumRegistro() + " - " + f3.getNome() + " R$ " + f3.calcularSalario());
		System.out.println(f4.getNumRegistro() + " - " + f4.getNome() + " R$ " + f4.calcularSalario());
		
		
	}
}
