package gleifer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Codigo {

	public static List<Integer> gerarPalavra() {
		System.out.println("Escreva a Palavra, Encerre com 0: ");
		Scanner input = new Scanner(System.in);
		List<Integer> palavra = new ArrayList<Integer>();
		for(int i = 1; i!=0;) {
			i = input.nextInt();
			if(i != 0) {
				palavra.add(i);
			}
		}
		input.close();
		return palavra;
	}
	
	public static void verificarPalavra(Estado estado, List<Integer> palavra) {
		
		System.out.println("=============================");
		
		for(int achar : palavra) {
			
			if(estado == Estado.MENU_BOAS_VINDAS) {
				if (achar == 1) {
					System.out.print("(" + estado + ", " + encontrarAlfabeto(achar));
					estado = Estado.MENU_PRINCIPAL;
					System.out.println(") -> " + estado);
				} else {
					System.out.println(encontrarAlfabeto(achar) + " - Inválido");
					return;
				}
			} else if(estado == Estado.MENU_PRINCIPAL) {
				if (achar == 2){
					System.out.print("(" + estado + ", " + encontrarAlfabeto(achar));
					estado = Estado.MENU_LANCHES;
					System.out.println(") -> " + estado);
				} else if (achar == 3) {
					System.out.print("(" + estado + ", " + encontrarAlfabeto(achar));
					estado = Estado.MENU_BEBIDAS;
					System.out.println(") -> " + estado);
				} else if (achar == 4) {
					System.out.print("(" + estado + ", " + encontrarAlfabeto(achar));
					estado = Estado.MENU_ACOMPANHAMENTOS;
					System.out.println(") -> " + estado);
				} else if (achar == 5) {
					System.out.print("(" + estado + ", " + encontrarAlfabeto(achar));
					estado = Estado.CARRINHO_LIMPO;
					System.out.println(") -> " + estado);
				} else if (achar == 6) {
					System.out.print("(" + estado + ", " + encontrarAlfabeto(achar));
					estado = Estado.CARRINHO;
					System.out.println(") -> " + estado);
				} else {
					System.out.println(encontrarAlfabeto(achar) + " - Inválido");
					return;
				}
			}else if(estado == Estado.MENU_LANCHES) {
				if (achar == 7) {
					System.out.print("(" + estado + ", " + encontrarAlfabeto(achar));
					estado = Estado.MENU_PRINCIPAL;
				} else if(achar == 8) {
					System.out.print("(" + estado + ", " + encontrarAlfabeto(achar));
					estado = Estado.CONFIRMAR_ITEM;
				} else {
					System.out.println(encontrarAlfabeto(achar) + " - Inválido");
					return;
				}
			} else if(estado == Estado.MENU_BEBIDAS) {
				if (achar == 7) {
					System.out.print("(" + estado + ", " + encontrarAlfabeto(achar));
					estado = Estado.MENU_PRINCIPAL;
					System.out.println(") -> " + estado);
				} else if(achar == 8) {
					System.out.print("(" + estado + ", " + encontrarAlfabeto(achar));
					estado = Estado.CONFIRMAR_ITEM;
					System.out.println(") -> " + estado);
				} else {
					System.out.println(encontrarAlfabeto(achar) + " - Inválido");
					return;
				}
			}else if(estado == Estado.MENU_ACOMPANHAMENTOS) {
				if (achar == 7) {
					System.out.print("(" + estado + ", " + encontrarAlfabeto(achar));
					estado = Estado.MENU_PRINCIPAL;
					System.out.println(") -> " + estado);
				} else if(achar == 8) {
					System.out.print("(" + estado + ", " + encontrarAlfabeto(achar));
					estado = Estado.CONFIRMAR_ITEM;
					System.out.println(") -> " + estado);
				} else {
					System.out.println(encontrarAlfabeto(achar) + " - Inválido");
					return;
				}
			}else if(estado == Estado.CONFIRMAR_ITEM) {
				if (achar == 7) {
					System.out.print("(" + estado + ", " + encontrarAlfabeto(achar));
					estado = Estado.MENU_PRINCIPAL;
					System.out.println(") -> " + estado);
				} else if(achar == 9) {
					System.out.print("(" + estado + ", " + encontrarAlfabeto(achar));
					estado = Estado.CARRINHO;
					System.out.println(") -> " + estado);
				} else {
					System.out.println(encontrarAlfabeto(achar) + " - Inválido");
					return;
				}
			}else if(estado == Estado.CARRINHO) {
				if (achar == 7) {
					System.out.print("(" + estado + ", " + encontrarAlfabeto(achar));
					estado = Estado.MENU_PRINCIPAL;
					System.out.println(") -> " + estado);
				} else if (achar == 10) {
					System.out.print("(" + estado + ", " + encontrarAlfabeto(achar));
					estado = Estado.SOLICITAR_CPF;
					System.out.println(") -> " + estado);
				} else if (achar == 11) {
					System.out.print("(" + estado + ", " + encontrarAlfabeto(achar));
					estado = Estado.ERRO_CARRINHO_VAZIO;
					System.out.println(") -> " + estado);
				} else {
					System.out.println(encontrarAlfabeto(achar) + " - Inválido");
					return;
				}
			} else if(estado == Estado.SOLICITAR_CPF) {
				if(achar == 12) {
					System.out.print("(" + estado + ", " + encontrarAlfabeto(achar));
					estado = Estado.VERIFICAR_PONTOS;
					System.out.println(") -> " + estado);
				} else if(achar == 13) {
					System.out.print("(" + estado + ", " + encontrarAlfabeto(achar));
					estado = Estado.METODO_PAGAMENTO;
					System.out.println(") -> " + estado);
				} else {
					System.out.println(encontrarAlfabeto(achar) + " - Inválido");
					return;
				}
			} else if(estado == Estado.ERRO_CARRINHO_VAZIO) {
				if (achar == 7) {
					System.out.print("(" + estado + ", " + encontrarAlfabeto(achar));
					estado = Estado.MENU_PRINCIPAL;
					System.out.println(") -> " + estado);
				} else {
					System.out.println(encontrarAlfabeto(achar) + " - Inválido");
					return;
				}
			} else if(estado == Estado.VERIFICAR_PONTOS) {
				if(achar == 14) {
					System.out.print("(" + estado + ", " + encontrarAlfabeto(achar));
					estado = Estado.APLICAR_DESCONTO;
					System.out.println(") -> " + estado);
				} else if (achar == 15) {
					System.out.print("(" + estado + ", " + encontrarAlfabeto(achar));
					estado = Estado.GERAR_PONTOS_PROX_COMPRAS;
					System.out.println(") -> " + estado);
				} else {
					System.out.println(encontrarAlfabeto(achar) + " - Inválido");
					return;
				}
			} else if(estado == Estado.APLICAR_DESCONTO) {
				if (achar == 16) {
					System.out.print("(" + estado + ", " + encontrarAlfabeto(achar));
					estado = Estado.GERAR_PONTOS_PROX_COMPRAS;
					System.out.println(") -> " + estado);
				} else {
					System.out.println(encontrarAlfabeto(achar) + " - Inválido");
					return;
				}
			} else if(estado == Estado.GERAR_PONTOS_PROX_COMPRAS) {
				if (achar == 17) {
					System.out.print("(" + estado + ", " + encontrarAlfabeto(achar));
					estado = Estado.METODO_PAGAMENTO;
					System.out.println(") -> " + estado);
				} else {
					System.out.println(encontrarAlfabeto(achar) + " - Inválido");
					return;
				}
			} else if(estado == Estado.METODO_PAGAMENTO) {
				if (achar == 19) {
					System.out.print("(" + estado + ", " + encontrarAlfabeto(achar));
					estado = Estado.DEBITO_CREDITO;
					System.out.println(") -> " + estado);
				} else if(achar == 18) {
					System.out.print("(" + estado + ", " + encontrarAlfabeto(achar));
					estado = Estado.EMITIR_TICKET;
					System.out.println(") -> " + estado);
				} else {
					System.out.println(encontrarAlfabeto(achar) + " - Inválido");
					return;
				}
			} else if(estado == Estado.EMITIR_TICKET) {
				if (achar == 24) {
					System.out.print("(" + estado + ", " + encontrarAlfabeto(achar));
					estado = Estado.CARRINHO_LIMPO;
					System.out.println(") -> " + estado);
				} else {
					System.out.println(encontrarAlfabeto(achar) + " - Inválido");
					return;
				}
			} else if(estado == Estado.DEBITO_CREDITO) {
				if (achar == 20) {
					System.out.print("(" + estado + ", " + encontrarAlfabeto(achar));
					estado = Estado.GERAR_BOLETO;
					System.out.println(") -> " + estado);
				} else if (achar == 21) {
					System.out.print("(" + estado + ", " + encontrarAlfabeto(achar));
					estado = Estado.ERRO_CARTAO;
					System.out.println(") -> " + estado);
				} else {
					System.out.println(encontrarAlfabeto(achar) + " - Inválido");
					return;
				}
			} else if(estado == Estado.ERRO_CARTAO) {
				if (achar == 22) {
					System.out.print("(" + estado + ", " + encontrarAlfabeto(achar));
					estado = Estado.CANCELAR_PONTOS_PROX_COMPRAS;
					System.out.println(") -> " + estado);
				} else {
					System.out.println(encontrarAlfabeto(achar) + " - Inválido");
					return;
				}
			} else if(estado == Estado.CANCELAR_PONTOS_PROX_COMPRAS) {
				if(achar == 6) {
					System.out.print("(" + estado + ", " + encontrarAlfabeto(achar));
					estado = Estado.CARRINHO;
					System.out.println(") -> " + estado);
				} else {
					System.out.println(encontrarAlfabeto(achar) + " - Inválido");
					return;
				}
			} else if(estado == Estado.GERAR_BOLETO) {
				if (achar == 24) {
					System.out.print("(" + estado + ", " + encontrarAlfabeto(achar));
					estado = Estado.CARRINHO_LIMPO;
					System.out.println(") -> " + estado);
				} else {
					System.out.println(encontrarAlfabeto(achar) + " - Inválido");
					return;
				}
			} else if(estado == Estado.CARRINHO_LIMPO) {
				if (achar == 23) {
					System.out.print("(" + estado + ", " + encontrarAlfabeto(achar));
					estado = Estado.MENU_BOAS_VINDAS;
					System.out.println(") -> " + estado);
				} else {
					System.out.println(encontrarAlfabeto(achar) + " - Inválido");
					return;
				}
			}
			
		}
		
		System.out.println("=============================");
		
		if(estado == Estado.MENU_BOAS_VINDAS) {
			System.out.println("AUTOMATO ENCERROU CORRETAMENTE");
		} else {
			System.out.println("AUTOMATO NÃO ENCERROU CORRETAMENTE, ENCERROU EM:");
			System.out.println(estado);
		}
		
	}

	public static String encontrarAlfabeto(int achar) {
		for(Alfabeto alfabeto : Alfabeto.values()) {
			if(alfabeto.getNumero() == achar) {
				return alfabeto.getNome();
			}
		}
		return "ERRO";
	}
	
}