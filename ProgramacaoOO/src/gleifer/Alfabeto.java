package gleifer;

public enum Alfabeto {
	INICIAR_PEDIDO(1, "Iniciar Pedido"),
	OPCAO_LANCHES(2, "Opção: Lanches"),
	OPCAO_BEBIDAS(3, "Opção: Bebidas"),
	OPCAO_ACOMPANHAMENTOS(4, "Opção: Acompanhamentos"),
	CANCELAR_COMPRA(5, "Cancelar Compra"),
	VER_CARRINHO(6, "Ver Carrinho"),
	VOLTAR_MENU(7, "Voltar ao Menu"),
	ESCOLHER_PRODUTO(8, "Escolher Produto"),
	CONFIRMAR_PRODUTO(9, "Confirmar Adição"),
	ENCERRAR_COMPRA(10, "Encerrar Compra"),
	ENCERRAR_COMPRA_CARRINHO_VAZIO(11, "Encerrar Compra - Carrinho Vazio"),
	INSERIR_CPF(12, "Inserir CPF"),
	PULAR_CPF(13, "Pular CPF"),
	PAGAMENTO_DESCONTO(14, "Pagamento com Desconto"),
	PAGAMENTO_SEM_DESCONTO(15, "Pagamento sem Desconto"),
	DESCONTO_APLICADO(16, "Desconto Aplicado"),
	IR_PAGAMENTO(17, "Ir para o Pagamento"),
	DINHEIRO(18, "Dinheiro"),
	CARTAO(19, "Cartão"),
	PASSAGEM_VALIDA(20, "Crédito/Débito - Passagem Válida"),
	PASSAGEM_INVALIDA(21, "Crédito/Débito - Erro"),
	CANCELAR_PONTOS(22, "Cancelar Pontos"),
	IR_BOAS_VINDAS(23, "Ir ao Menu de Boas-Vindas"),
	FINALIZAR_COMPRA(24, "Finalizar Compra");
	
	private int numero;
	private String nome;

	private Alfabeto(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
