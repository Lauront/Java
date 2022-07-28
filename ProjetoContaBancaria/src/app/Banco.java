package app;

import java.util.Scanner;

import core.ContaBancaria;

public class Banco {
	public static void main(String[] args) {	
		
		Scanner teclado = new Scanner(System.in);
		int opcao;
		double valor;
		ContaBancaria conta = new ContaBancaria(1, 123, "Lauro", "111.212.312-", 500.0);
		
		do {
			System.out.println("--------------------------------------------");
			System.out.println("Digite 1 - deposito / 2 - Saque / 3 - Info / 0 - Sair");
			opcao = teclado.nextInt();
			
			switch (opcao) {	
				case 1:
					System.out.println("--------------------------------------------");
					System.out.println("Depositar:");
					valor = teclado.nextDouble();
					conta.depositar(valor);
					break;
					
				case 2:
					System.out.println("--------------------------------------------");
					System.out.println("Sacar:");
					valor = teclado.nextDouble();
						if (conta.sacar(valor)) {
							System.out.println("Saque efetuado, o novo saldo eh:"+ conta.getSaldo());
						}
						else {
							System.out.println("Saldo insuficiente!");
						}	
					break;
					
				case 3:
					System.out.println("--------------------------------------------");
					System.out.println("Seus dados");
					System.out.println(conta.exibirDados()); 
					break;
					
				case 0:
					System.out.println("Obrigado!");
					
				default:
					System.out.println("Opção invalida!");
			}
			
			
			
		}while(opcao != 0);
		
		teclado.close();
	}
}
