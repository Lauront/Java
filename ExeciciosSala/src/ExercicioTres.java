//bibliotecas
import java.util.Scanner;

public class ExercicioTres {
   public static void main(String[] args) {
       //para receber os valores de n1,n2,n3
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3;

        System.out.print("Entre com o primeiro inteiro: ");
        n1 = sc.nextInt();
        System.out.print("Entre com o segundo inteiro: ");
        n2 = sc.nextInt();
        System.out.print("Entre com o terceiro inteiro: ");
        n3 = sc.nextInt();
        
        // testante primeira condição, n1 ser o maior
        if (n1 > n2) {
            if (n1 > n3) { // aqui determina que n1 é o maior, resta descobrir qual é maior entre n2 e n3
                if (n2 < n3) {
                    System.out.println("O menor numero eh: " + n2); // n1>n3>n2
                } else {
                    System.out.println("O menor numero eh: " + n3); // n1>n2>n3
                }
                System.out.println("O maior numero eh: " + n1); // n1> de todos,confirmando que já era esperado que o n1 seria o maior
            
            // determinando que o n3 é o maior caso n1 não for    
            } else {
                if (n1 < n2) {
                    System.out.println("O menor numero eh: " + n1); // n3>n2>n1
                } else {
                    System.out.println("O menor numero eh: " + n2); //n3>n1>n2
                }
                System.out.println("O maior numero eh: " + n3); // n3 > de todos
            }
        // determinando que o n2 é o maior  
        } else { //n1<n2
            if (n2 > n3) {
                if (n1 < n3) {
                    System.out.println("O menor numero eh: " + n1); // n2>n3>n1
                } else {
                    System.out.println("O menor numero eh: " + n3); // n2>n1>n3
                }
                System.out.println("O maior numero eh: " + n2);
            // porem o n3 pode ser o maior
            } else { //n2 < n3 
                if (n1 < n2) {
                    System.out.println("O menor numero eh: " + n1); // n3>n2>n1
                } else {
                    System.out.println("O menor numero eh: " + n2); //n3>n1>n2
                }
                System.out.println("O maior numero eh: " + n3); //n3 > de todos
            }
        }
        //fechamento do Scan
        sc.close();
   }    
}
