
public class Produto {

	private int Id;
	private String nome;
	private double preco;
	
	public Produto(int id, String nome, double preco) {
		super();
		Id = id;
		this.nome = nome;
		this.preco = preco;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Produto [Id=" + Id + ", nome=" + nome + ", preco=" + preco + "]";
	}

}
