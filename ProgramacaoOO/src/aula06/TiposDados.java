package aula06;

public class TiposDados {
	
	final String raca = "Humano"; // imutavel
	String nome; // instancia
	double doacao;
	static double doacaoTotal; // classe
	
	public void doar(double dinheiro) {
		
		doacao = doacao + dinheiro;
		doacaoTotal = doacaoTotal + dinheiro;
		
	}
	
	public void imprimir() {
		
		System.out.println("Nome: " + nome);
		System.out.println("Raça: " + raca);
		System.out.println("Doado: " + doacao + "\n");
		
	}
	
}