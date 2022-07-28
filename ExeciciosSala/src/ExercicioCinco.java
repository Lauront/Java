// Proposta: Tem-se um conjunto de dados contendo a altura e o sexo de 10 pessoas. Fazer um programa que calcule e escreva:
//a. a maior e a menor altura do grupo;
//b. média de altura dos homens;
//c. o número de mulheres.
//Dica: PODE ser usado Vetores, mas não de forma obrigatória

//bibliotecas
import java.util.Scanner;

public class ExercicioCinco {
   public static void main(String[] args) {
       
   //habilitando entrada e definindo variaveis
   Scanner teclado = new Scanner(System.in);
   //String [] vetorAltura = new String[10];
   //String [] vetorSexo = new String[10];
   double altura, maiorAltura = 0, menorAltura = 10, somaAlturas = 0, mediaAlturaHomem;
   int contadorMulheres = 0;
   String sexo = "";

    for (int i = 0; i < 10; i++){
        System.out.println("Informe a altura:");
        altura = teclado.nextDouble();
        //vetorAltura[i] = altura;
        
        if(altura >= maiorAltura){
            maiorAltura = altura;
        } else if (altura <= menorAltura){
            menorAltura = altura;
        }
        
        System.out.println("O sexo é m ou f?");
        sexo = teclado.next();
        //vetorSexo[i] = sexo;
        
        
        if (sexo == "m"){
            somaAlturas = somaAlturas + altura;
        }
        
        if( sexo == "f"){
            contadorMulheres =  contadorMulheres + 1;
        }
        
        //System.out.println("A altura armazenada foi de : " + vetorAltura[i] + " e o sexo informado foi: " + vetorSexo[i]);
    }  
    
    //formulas
     mediaAlturaHomem = somaAlturas /10;
    
    System.out.printf("A maior altura eh %.2f e a menor eh %.2f \n", maiorAltura, menorAltura);
    System.out.println("Media das alturas dos homens eh: " + mediaAlturaHomem);
    System.out.println("A quantidade de mulheres informada eh: " + contadorMulheres);
   teclado.close();
   }    
}
