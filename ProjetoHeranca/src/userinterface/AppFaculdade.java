package userinterface;

import core.Estudante;
import core.Pessoa;

public class AppFaculdade {
public static void main(String[] args) {
	Pessoa p = new Pessoa();
	p.setNome("Lauro");
	p.setEmail("lauro.dev@outlook.com");
	p.setTelefone("34996781597");
	
	System.out.println(p.exibirInfo());
	
	Estudante e = new Estudante();
	e.setNome("Lauro Felipe");
	e.setEmail("lauromecanica@gmail.com");
	e.setTelefone("32124175");
	e.setNumeroMatricula(42);
	e.setCurso("ADS");
	
	System.out.println(e.exibirInfo());
}
	
}
