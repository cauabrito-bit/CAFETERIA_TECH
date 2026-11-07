package cafeteriaTech.classes;

public class Produto {
	private String nomeProduto;
	private double precoProduto;
	private int codigoProduto;
	private int estoqueProduto;
	
	public Produto(String nomeProduto, double precoProduto, int codigoProduto, int estoqueProduto ) {
		if (estoqueProduto < 0) {
			throw new IllegalArgumentException("O estoque inicial nao pode ser negativo");
		}
		this.nomeProduto = nomeProduto;
		setPrecoProduto(precoProduto);
		this.codigoProduto = codigoProduto;
		this.estoqueProduto = estoqueProduto;
	}
	@Override
	public String toString() {
	    return nomeProduto + " - R$ " + precoProduto;
	}

	public String exibirCatalogo() {
	    return "[Catálogo] " + nomeProduto + " | Preço: R$ " + precoProduto + " | Estoque disponível: " + estoqueProduto + " un.";
	}
	public void setPrecoProduto(double precoProduto) {
		if (precoProduto <= 0.0 ) {
			System.out.println("VALOR DE CADASTRO INVALIDO");
		}
		else{
			this.precoProduto = precoProduto;
		}
	}
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	public double getPrecoProduto() {
		return precoProduto;
	}
	public int getCodigoProduto() {
		return codigoProduto;
	}
	public int getEstoqueProduto() {
		return estoqueProduto;
	}
	public void addEstoque(int quantidadeEstoque) {
		if(quantidadeEstoque > 0) {
			estoqueProduto += quantidadeEstoque;
		} else {
			throw new IllegalArgumentException("valor de adicao invalido");
		}
	}
	public boolean darBaixaEstoque(int quantidadeBaixa) {
		if(quantidadeBaixa > 0 && estoqueProduto >= quantidadeBaixa) {
			estoqueProduto -= quantidadeBaixa;
			return true;
		} else {
			return false;
		}
	}
}
