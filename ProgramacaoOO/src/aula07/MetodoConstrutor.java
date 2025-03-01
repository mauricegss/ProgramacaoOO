package aula07;

public class MetodoConstrutor {
	
	private final String raca; // imutavel
	private String nome; // instancia
	private double renda;
	private static double rendaTotal; // classe
	
	//Metodo Construtor
	
	public MetodoConstrutor(String nome, double renda) {
		System.out.println("Iniciando Método Construtor");
		this.raca = "Humano";
		this.nome = nome;
		this.renda = renda;
		MetodoConstrutor.calcularRendaTotal(this.renda);
	}
	
	private static void calcularRendaTotal(double renda) {
		MetodoConstrutor.rendaTotal += renda;
	}
	
	// toString
	
	public String toString() {
		return "Raça = " + raca + "\nNome = " + nome + "\nRenda = " + renda;
	}
	
	// Getters and Setters

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getRenda() {
		return renda;
	}

	public void setRenda(double renda) {
		this.renda = renda;
	}

	public static double getRendaTotal() {
		return rendaTotal;
	}

	public String getRaca() {
		return raca;
	}
	
	
	
}
