package core;
//sub

public class Estudante extends Pessoa {
	private int numeroMatricula;
	private String curso;
	
	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public String exibirInfo() {
		return super.nome + " - " + super.email + " - " + super.telefone + " - " + numeroMatricula + " - " + curso;
	}
	
}
