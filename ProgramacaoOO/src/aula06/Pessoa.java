package aula06;

public class Pessoa {
	
	final String raca = "Humano"; // imutavel
	String nome; // instancia
	double renda;
	static double rendatotal; // classe
	
	public void doar(double dinheiro) {
		
		renda = renda + dinheiro;
		rendatotal = rendatotal + dinheiro;
		
	}
	
	public void imprimir() {
		
		System.out.println("Nome: " + nome);
		System.out.println("Raça: " + raca);
		System.out.println("Renda: " + renda + "\n");
		
	}
	
}
