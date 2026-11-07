package cafeteriaTech.classes;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	private final String idPedido;
	private final List<Produto>listaTemporaria;
	
	public Pedido(String idPedido) {
		this.idPedido = idPedido;
		this.listaTemporaria = new ArrayList<>();
	}
	public String getIdPedido() {
		return idPedido;
	}
	public List<Produto> getListaTemporaria() {
		return new ArrayList <>(listaTemporaria);
	}
	public void removerProdutoPorCodigo (int codigoParaRemover) {
		 for (int i = 0; i < listaTemporaria.size(); i ++) {
			 Produto produtoTemporario = listaTemporaria.get(i);
			 
			 if (produtoTemporario.getCodigoProduto() == codigoParaRemover) {
				 listaTemporaria.remove(i);
				 break;
			 }
		 }
	}
	public void adicionarProduto (Produto produtoAdicionado, int quantidadeDesejada) {
		if(produtoAdicionado == null) {
			throw new IllegalArgumentException("Produto nulo, nao foi possivel adiciona-lo");
		} else if(quantidadeDesejada <= 0) {
			throw new IllegalArgumentException("Quantidade invalida nao foi possivel adiciona-la");
		} else if (produtoAdicionado.darBaixaEstoque(quantidadeDesejada)) {
			for(int i=0; i<quantidadeDesejada; i++) {
				this.listaTemporaria.add(produtoAdicionado);
			}
		} else {
			throw new IllegalArgumentException("Estoque baixo, nao foi possivel adiciona-lo ao carrinho \nO estoque atual desse produto e: " + produtoAdicionado.getEstoqueProduto());
		}
		}
		
	public double calcularValorTotal() {
	    double total = 0.0;
	    for (Produto p : this.listaTemporaria) {
	        total += p.getPrecoProduto(); 
	    }
	    return total;
		}

	
	public void exibirResumoPedido() {
		System.out.println("\n--- RESUMO DO PEDIDO (" + idPedido + ") ---");
		System.out.println("Itens no carrinho: " + getListaTemporaria());
		System.out.println("VALOR TOTAL A PAGAR: R$ " + calcularValorTotal());
		System.out.println("----------------------------------------\n");
	}
}
