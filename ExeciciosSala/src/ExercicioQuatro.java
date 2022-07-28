// Fazer um programa em Java que armazene o nome, a idade e a altura dos usuários e no final mostre como saída quantas pessoas acima de 25 anos e maiores de 1.75 participaram da pesquisa.

//bibliotecas
import java.util.Scanner;

public class ExercicioQuatro {
   public static void main(String[] args) {
    
    //variaveis
    String nome = "";
    int idade;
    double altura;
    int pessoas = 0;
    int cadastroValido;
    //entradas
    Scanner teclado = new Scanner(System.in);
    
    do {
    
    System.out.println("Deseja cadastrar uma pessoa? Se sim digite 1,se não, digite 2");
    cadastroValido = teclado.nextInt();
    
        switch (cadastroValido) {
            
            case 1:
                System.out.println("Digite o nome:");
                nome = teclado.next();
                
                System.out.println("Digite a idade:");
                idade = teclado.nextInt();
                
                System.out.println("Digite a altura:");
                altura = teclado.nextDouble();
    
                //analisando condição e colocando incremento no contador
                if ((idade > 25) & (altura > 1.75)){
                    pessoas = pessoas + 1;
                }
                
                break;
            case 2:
                break;
        }
    
    
    //condicao de parada
    } while(cadastroValido == 1);
     teclado.close();
    //mostrando quantidade de pessoas que passaram da condição
    System.out.println("Quantidade de pessoas atendem a condicao proposta:"+pessoas);
   }    
}
