package fragmentos;

public class Teste {
	
	public static void main(String[] args) {
		
		Fragmentos personagens = new Fragmentos();
		
		System.out.println("Saldo = " + personagens.saldo);
		System.out.println("=============================");
		
		personagens.comprar("Gnar");
		personagens.comprar("Neeko");
		personagens.comprar("Rek'Sai");
		personagens.comprar("Viktor");
		personagens.comprar("Jhin");
		personagens.comprar("Heimerdinger");
		personagens.comprar("Elise");
		personagens.comprar("Qiyana");
		personagens.comprar("Kha'Zix");
		//personagens.comprarFragmentos();
		personagens.imprimirLista();
		personagens.imprimir();

	}
	
}
