package model;

public class Chefe extends Funcionario{
	private double salarioBase;
	private double adicionalFuncao;
	private double adicionalTerno;
	
	public Chefe(int numRegistro, String nome, double salarioBase, double adicionalFuncao, double adicionalTerno) {
		super(numRegistro, nome);
		this.salarioBase = salarioBase;
		this.adicionalFuncao = adicionalFuncao;
		this.adicionalTerno = adicionalTerno;
	}
	
	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getAdicionalFuncao() {
		return adicionalFuncao;
	}

	public void setAdicionalFuncao(double adicionalFuncao) {
		this.adicionalFuncao = adicionalFuncao;
	}

	public double getAdicionalTerno() {
		return adicionalTerno;
	}

	public void setAdicionalTerno(double adicionalTerno) {
		this.adicionalTerno = adicionalTerno;
	}

	@Override
	public double calcularSalario() {
		// TODO Auto-generated method stub
		return salarioBase + (salarioBase*adicionalFuncao/100) + adicionalTerno;
	}
	
}
