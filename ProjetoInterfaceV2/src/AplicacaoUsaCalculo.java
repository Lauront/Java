
public class AplicacaoUsaCalculo {
	public static void main(String[] args) {
		//chamando o metodo do jeito que ele é
		
		ObjetoCalcula o = new ObjetoCalcula();
		o.realizaCalculo();
		
		// modulo x só consegue chamar via metodo calcularValores()
		InterfaceModulo1 im1 = o;
		im1.calcularValores();
		
		// modulo y so consegue chamar via metodo efetivarContas()
		IntervaceModulo2 im2 = o;
		im2.efetivarContar();
		
		
	}
}
