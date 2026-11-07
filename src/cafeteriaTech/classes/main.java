package cafeteriaTech.classes;

public class main {

	public static void main(String[] args) {
		Produto cafeExpresso = new Produto("Café Expresso", 6.00, 101, 10);
		Produto paoDeQueijo = new Produto("Pão de Queijo", 5.00, 202, 5);
		Produto boloCenoura = new Produto("Bolo de Cenoura", 8.50, 303, 2);
		Produto cappuccino = new Produto("Cappuccino Cremoso", 9.00, 404, 15);
		
		System.out.println("--- CARDÁPIO ---");
        System.out.println(cafeExpresso.exibirCatalogo());
        System.out.println(paoDeQueijo.exibirCatalogo());
        System.out.println(boloCenoura.exibirCatalogo());
        System.out.println(cappuccino.exibirCatalogo());
        System.out.println("---------------------------\n");
		
		Pedido pedidoCaua = new Pedido("40028922");
		pedidoCaua.adicionarProduto(paoDeQueijo, 3);
		pedidoCaua.adicionarProduto(boloCenoura, 1);
		pedidoCaua.exibirResumoPedido();
		
		System.out.println("--- CARDÁPIO APOS ALTERACOES ---");
        System.out.println(cafeExpresso.exibirCatalogo());
        System.out.println(paoDeQueijo.exibirCatalogo());
        System.out.println(boloCenoura.exibirCatalogo());
        System.out.println(cappuccino.exibirCatalogo());
        System.out.println("---------------------------\n");
		
	}

}
