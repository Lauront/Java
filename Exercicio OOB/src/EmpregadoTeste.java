
public class EmpregadoTeste {
	public static void main(String[] args) {
		Empregado e1, e2;

		e1 = new Empregado("Professor Isidro", 5000.00);
		e2 = new Empregado("Coordenador", 7000.00);

		// antes de reajustar
		System.out.println("------ Informações iniciais ------");
		System.out.println(e1.exibir());
		System.out.println(e2.exibir());

		e1.aumentarSalario(5.0);
		e2.aumentarSalario(7.0);

		// antes de reajustar
		System.out.println("------ Informações atualizadas ------");
		System.out.println(e1.exibir());
		System.out.println(e2.exibir());
		
	}
}
