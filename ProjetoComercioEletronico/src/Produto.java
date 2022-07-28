// novo tipo de dado que será usado por outras classes/programa java
public class Produto {

	// declaro as variáveis que compoem a estrutura
	private int codigo;
	private String descricao;
	private double preco;
	
	//metodo construtor
	
	public Produto(int codigo, String descricao, double preco) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.preco = preco;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setDescricao (String descricao) {
		this.descricao =  descricao;
	}
	
	public String getDescricao () {
		return descricao;
	}
	
	public void setPreco (double preco) {
		this.preco = preco;
	}
	
	public Double getPreco() {
		return preco;
	}
	
	// metodo que não recebe paramentro
	public void mostrarAnuncio() {
		System.out.println("------ PRODUTO ------");
		System.out.println(codigo + ":" + descricao);
		System.out.printf("R$ %.2f\n", preco);
	}

	// metodos que recebem parametro
	public void aplicarDesconto(double percentual) {
		preco = preco - (preco * percentual);
	}
	
	public double simularDesconto(double percentual) {
		double novoPreco = preco - (preco * percentual);
		return novoPreco;
	}
}