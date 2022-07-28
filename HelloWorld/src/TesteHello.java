import java.util.Scanner;

public class TesteHello {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String newValor;
		
		System.out.println("digite um nome");
		newValor = teclado.toString();
		
		System.out.println("O digitado foi: "+newValor);

		teclado.close();
	}
}
