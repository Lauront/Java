
public class Matriz {
public static void main(String[] args) {
	int[] [] matriz = new int [2] [2];
	matriz [0] [0] = 1;
	matriz [0] [1] = 2;
	matriz [1] [0] = 4;
	matriz [1] [1] = 5;
	
	for (int i = 0; i < matriz.length; i++) {
		for (int j = 0; j < matriz.length; j++) {
			System.out.println("Matriz: " + matriz [i] [j] );
		}
	}
	
	System.out.println(matriz.length);
			
}
}
