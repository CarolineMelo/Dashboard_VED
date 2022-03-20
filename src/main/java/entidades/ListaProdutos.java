package entidades;

public class ListaProdutos {
	String nome_produto;
	Integer quantidade_total;
	Double preco;
	Double preçoTI;
	
	
	public String getNome_produto() {
		return nome_produto;
	}
	public void setNome_produto(String nome_produto) {
		this.nome_produto = nome_produto;
	}
	public Integer getQuantidade_total() {
		return quantidade_total;
	}
	public void setQuantidade_total(Integer quantidade_total) {
		this.quantidade_total = quantidade_total;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public Double getPreçoTI() {
		return preçoTI;
	}
	public void setPreçoTI(Double preçoTI) {
		this.preçoTI = preçoTI;
	}

	
	
	
	public ListaProdutos(String nome_produto, Integer quantidade_total, Double preco, Double preçoTI) {
		super();
		this.nome_produto = nome_produto;
		this.quantidade_total = quantidade_total;
		this.preco = preco;
		this.preçoTI = preçoTI;
		
	}
	@Override
	public String toString() {
		return "ListaProdutos [nome_produto=" + nome_produto + ", quantidade_total=" + quantidade_total + ", preco="
				+ preco + ", preçoTI=" + preçoTI + "]";
	}

	
	
	
	
	
	
	
}
