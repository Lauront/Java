
public class Loja {
	public static void main(String[] args) {

		Produto p, p2, p3; // declaro
		p = new Produto(1,"Computador",2500.00); // reservo memória
		p2 = new Produto(2, "Mouse", 25.00);
		p3 = new Produto(3, "Teclado", 250.00);

//		p.setCodigo(1);
//		p.setDescricao("Computador");
//		p.setPreco(2500.00);
//
//		p2.setCodigo(2);
//		p2.setDescricao("Mouse");
//		p2.setPreco(25.00);
//
//		p3.setCodigo(3);
//		p3.setDescricao("Teclado");
//		p3.setPreco(250.00);

		p.aplicarDesconto(0.10);
		
		p.mostrarAnuncio();
		p2.mostrarAnuncio();
		p3.mostrarAnuncio();
		
		
		System.out.println("O preço do "+p.getDescricao() + " com desconto eh: "+ p.simularDesconto(0.15));
		p.mostrarAnuncio();
	}
}
