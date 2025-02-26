package fragmentos;

import java.util.List;
import java.util.ArrayList;

public class Fragmentos {
	int saldo;
	List<Personagem> lista;
	
	public Fragmentos() {
		super();
		this.saldo = 36395;
		this.lista = Adicionar.adicionar();
	}
	
	public void comprarFragmentos() {
		List<Personagem> achei = new ArrayList<Personagem>();
		for(Personagem personagem : lista) {
			if(personagem.estado == true) {
				System.out.println(personagem.nome + " Comprado");
				this.saldo -= personagem.valor;
				System.out.println("Saldo = " + this.saldo);
				System.out.println("=============================");
				achei.add(personagem);
			}
		}
		lista.removeAll(achei);
		
	}
	
	public void comprar(String nome) {
		Personagem achei = null;
		for(Personagem personagem : lista) {
			if(personagem.nome == nome) {
				if(this.saldo<personagem.valor) {
					System.out.println(nome + " Não Comprado");
					return;
				}
				System.out.println(nome + " Comprado");
				this.saldo -= personagem.valor;
				System.out.println("Saldo = " + this.saldo);
				System.out.println("=============================");
				achei = personagem;
			}
		}
		lista.remove(achei);
	}
	
	public void imprimirLista() {
		for(Personagem personagem : this.lista) {
			System.out.println(personagem.nome + " / " + personagem.valor);
		}
		System.out.println("=============================");
	}

	public void imprimir() {
		int soma1 = 0, soma2 = 0, soma3 = 0;
		for(Personagem personagem : lista) {
			if(personagem.estado) {	
				soma1 += personagem.valor;
			} else {
				soma2 += personagem.valor;
			}
		}
		soma3 = soma2 * 60/100;
	    System.out.println("Com Fragmentos: " + String.format("%,d", soma1));
	    System.out.println("Restante: " + String.format("%,d", soma1 - this.saldo));
	    System.out.println("=============================");
	    System.out.println("Sem Fragmentos: " + String.format("%,d", soma2));
	    System.out.println("Soma: " + String.format("%,d", soma1 + soma2));
	    System.out.println("Restante: " + String.format("%,d", soma1 + soma2 - this.saldo));
	    System.out.println("=============================");
	    System.out.println("Todos os Fragmentos: " + String.format("%,d", soma1 + soma3));
	    System.out.println("Restante: " + String.format("%,d", soma1 + soma3 - this.saldo));
	    System.out.println("=============================");
	    
	}
}
