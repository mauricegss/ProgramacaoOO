package gleifer;
import java.util.List;

public class Gleifer {
	public static void main(String[] args) {
		Estado estado = Estado.MENU_BOAS_VINDAS;
		List<Integer> palavra = Codigo.gerarPalavra();
		Codigo.verificarPalavra(estado, palavra);
	}
}
		/*
		1='Iniciar Pedido'
		2='Opção: Lanches'
		3='Opção: Bebidas'
		4='Opção: Acompanhamentos'
		5='Cancelar Compra'
		6='Ver Carrinho'
		7='Voltar ao Menu'
		8='Escolher Produto'
		9='Confirmar Adição'
		10='Encerrar Compra'
		11='Encerrar Compra - Carrinho Vazio'
		12='Inserir CPF'
		13='Pular CPF'
		14='Pagamento com Desconto'
		15='Pagamento sem Desconto'
		16='Desconto Aplicado'
		17='Ir para Para Pagamento'
		18='Dinheiro'
		19='Cartão'
		20='Crédito/Débito - Passagem Válida'
		21='Crédito/Débito - Erro'
		22='Cancelar Pontos'
		23='Ir ao Menu de Boas-Vindas'
		24='Finalizar Compra'
		 */