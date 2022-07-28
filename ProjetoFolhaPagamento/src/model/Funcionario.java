package model;

public abstract class Funcionario {
	protected int numRegistro;
	protected String nome;
	
	//classes abstratas permitem criar clausulas contratuais para que as subclasses
	
	
	public int getNumRegistro() {
		return numRegistro;
	}

	public abstract double calcularSalario();
	
	public void setNumRegistro(int numRegistro) {
		this.numRegistro = numRegistro;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Funcionario(int numRegistro, String nome) {
		super();
		this.numRegistro = numRegistro;
		this.nome = nome;
	}
}
