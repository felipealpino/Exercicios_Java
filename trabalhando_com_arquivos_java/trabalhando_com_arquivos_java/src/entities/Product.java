package entities;

public class Product {
	
	private String produto;
	private double valor;
	private int quantidade;
	
	
	public Product(String produto, double valor, int quantidade) {
		super();
		this.produto = produto;
		this.valor = valor;
		this.quantidade = quantidade;
	}


	public String getProduto() {
		return produto;
	}


	public double getValor() {
		return valor;
	}


	public int getQuantidade() {
		return quantidade;
	}
	
	
	public double totalVendido() {
		return this.quantidade * this.valor;
	}
	
	
	
}
