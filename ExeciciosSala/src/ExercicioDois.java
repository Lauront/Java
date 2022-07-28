import java.util.Scanner;

public class ExercicioDois {
	public static void main(String[] args) {
		
		//valores armazenados
		int valorArmazenado = 1234;
		int senhaCorreta = 9999;
		
		//primeira entrada do usuário
		Scanner teclado = new Scanner(System.in);
		int valorCompara = teclado.nextInt();
		
		//comparando se o valor de entrada é diferente do armazenado
		if (valorArmazenado != valorCompara) {
			System.out.println("Usuário Inválido");
			
		//se o valor for igual solicita uma nova senha
		} else {
			System.out.println("Entre o valor da senha");
			int senhaNova = teclado.nextInt();
			
			//comparando se o novo valor de entrada é diferente do armazenado
			if (senhaNova != senhaCorreta) {
				System.out.println("Senha Incorreta");
				
				//se for igual permitir o acesso
			} else {
				System.out.println("Acesso permitido");
			}
		}
		
		teclado.close();
	}

}
