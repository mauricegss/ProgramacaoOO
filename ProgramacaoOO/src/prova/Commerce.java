package prova;

import java.util.List;
import java.util.ArrayList;

public class Commerce {
	private String nome;
	private String cnpj;
	private String dominio;
	private List<Cliente> clientes;
	private List<Produto> produtos;
	
	public Commerce(String nome, String cnpj, String dominio) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.dominio = dominio;
		this.clientes = new ArrayList<Cliente>();
		this.produtos = new ArrayList<Produto>();
	}
	
	public void cadastrarProduto(int codigo, String nome, double preco, int quantidade) {
		Produto produto = new Produto(codigo, nome, preco, quantidade);
		this.produtos.add(produto);
		System.out.println("Produto Cadastrado");
	}
	
	public void cadastrarCliente(String cpf, String nome, int senha) {
		Cliente cliente = new Cliente(cpf, nome, senha);
		this.clientes.add(cliente);
		System.out.println("Cliente Cadastrado");
	}
	
	public void listarProdutos() {
		for(Produto produto : this.produtos) {
			System.out.println("============================");
			System.out.println(produto.getCodigo()+" / "+produto.getNome()+" / "+produto.getPreco()+" / "+produto.getQuantidade());
			System.out.println("============================");
		}
	}
	
	public void listarProdutoVendido(Produto produto, int quantidade, double valor) {
		System.out.println("============================");
		System.out.println("Produto Vendido!");
		System.out.println(produto.getCodigo()+" / "+produto.getNome()+" / "+produto.getPreco()+" / "+produto.getQuantidade());
		System.out.println("Quantidade Vendida = " + quantidade);
		System.out.println("Valor da Venda = " + valor);
		System.out.println("============================");
	}
	
	public void efetuarVenda(String cpf, int senha, int codigo, int quantidade) {
		if(this.confirmarCliente(cpf, senha)) {
			Produto produto = this.confirmarCodigo(codigo);
			if(produto != null) {
				if(this.confirmarQuantidade(produto, quantidade)) {
					double valor = quantidade * produto.getPreco();
					this.listarProdutoVendido(produto, quantidade, valor);
				}
			}
		}
	}
	
	public boolean confirmarCliente(String cpf, int senha) {
		for(Cliente cliente : this.clientes) {
			if(cliente.getCpf() == cpf && cliente.getSenha() == senha) {
				return true;
			}
		}
		System.out.println("Compra Cancelada - Cliente não Encontrado!");
		return false;
	}
	
	public Produto confirmarCodigo(int codigo) {
		for(Produto produto : this.produtos) {
			if(produto.getCodigo() == codigo) {
				return produto;
			}
		}
		System.out.println("Compra Cancelada - Produto não Encontrado!");
		return null;
	}
	
	public boolean confirmarQuantidade(Produto produto, int quantidade) {
		if(produto.getQuantidade() >= quantidade) {
			produto.setQuantidade(produto.getQuantidade() - quantidade);
			return true;
		}
		System.out.println("Compra Cancelada - Quantidade Inválida!");
		return false;
	}
	
	public void reporEstoque(int codigo, int quantidade) {
		for (Produto produto : this.produtos) {
			if(produto.getCodigo() == codigo) {
				produto.setQuantidade(produto.getQuantidade() + quantidade);
				System.out.println("Produto Estocado!");
				return;
			}
		}
		System.out.println("Estoque Cancelado - Produto não Encontrado!");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getDominio() {
		return dominio;
	}

	public void setDominio(String dominio) {
		this.dominio = dominio;
	}
	
}
