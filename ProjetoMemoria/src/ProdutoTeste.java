
public class ProdutoTeste {
	public static void main(String[] args) {
		
		Produto p1,p2;
		
		p1 = new Produto(1, "PC", 1764.7);
		p2 = p1;
		
		System.out.println("Preço P1 = " + p1.exibirProduto()); 
		
		p2.setPreco(1899.00);
		
		System.out.println("Preço P2 = " + p2.exibirProduto()); 
		System.out.println("Preço P1 = " + p1.exibirProduto()); 
		
		
	
	}
}
