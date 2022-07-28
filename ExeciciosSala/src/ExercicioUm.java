
public class ExercicioUm {

	public static void main(String[] args) {

		// temperatura

		double F, K, Re, Ra;
		double C = 2.43;

		// formulas
		F = C * 1.8 + 32;
		K = C + 272.15;
		Re = C * 0.8;
		Ra = C * 1.8 + 32 + 459.67;

		// Saidas
		System.out.printf(
				"Tempera em graus Celsius: %.2f\n Tempera em graus Reaumur: %.2f\n Tempera em graus Rankine: %.2f\n Tempera em graus Fahrenheit: %.2f\n",
				C, K, Re, Ra, F);
	}
}
