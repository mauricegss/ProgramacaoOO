package prova;

public class Teste {
	public static void main(String[] args) {
		
		Commerce comercio = new Commerce("Comercio", "123", "comercio.com");
		
		comercio.cadastrarCliente("111", "Maurice", 222);
		comercio.cadastrarProduto(555, "ProdutoMax", 5, 10);
		comercio.cadastrarProduto(666, "ProdutoMin", 3, 15);
		
		comercio.listarProdutos(); // APOS INICIALIZACAO
		
		comercio.efetuarVenda("112", 222, 666, 6); // CPF ERRADO
		comercio.efetuarVenda("111", 223, 666, 6); // SENHA ERRADA
		comercio.efetuarVenda("111", 222, 667, 6); // PRODUTO ERRADO
		comercio.efetuarVenda("111", 222, 666, 16); // QUANTIDADE ELEVADA
		comercio.efetuarVenda("111", 222, 666, 6); // VALIDO - PRODUTO 2
		comercio.efetuarVenda("111", 222, 555, 9); // VALIDO - PRODUTO 1
		
		comercio.listarProdutos(); // APOS VENDAS
		
		comercio.reporEstoque(667, 100); // PRODUTO ERRADO
		comercio.reporEstoque(666, 100); // VALIDO - PRODUTO 2
		
		comercio.listarProdutos(); // APOS ESTOQUE
		
	}
}
