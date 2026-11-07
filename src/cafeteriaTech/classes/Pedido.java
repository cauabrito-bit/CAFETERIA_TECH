package cafeteriaTech.classes;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	private final String idPedido;
	private final List<Produto>listaTemporaria;
	
	public Pedido(String idPedido, List listaTemporaria) {
		this.idPedido = idPedido;
		this.listaTemporaria = new ArrayList();
	}
	public String getIdPedido() {
		return idPedido;
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
}
