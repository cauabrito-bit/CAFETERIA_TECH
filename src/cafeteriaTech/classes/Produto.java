package cafeteriaTech.classes;

public class Produto {
	private String nomeProduto;
	private double precoProduto;
	private int codigoProduto;
	
	public Produto(String nomeProduto, double precoProduto, int codigoProduto ) {
		this.nomeProduto = nomeProduto;
		setPrecoProduto(precoProduto);
		this.codigoProduto = codigoProduto;
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
		return this.nomeProduto;
	}
	public double getPrecoProduto() {
		return this.precoProduto;
	}
	public int getCodigoProduto() {
		return this.codigoProduto;
	}

}
