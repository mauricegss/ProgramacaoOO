package aula06;

public class Pessoas {
	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		
		pessoa1.nome = "Maurice";
		pessoa2.nome = "Jorge";
		
		pessoa1.doar(1000);
		pessoa2.doar(1500);
		
		pessoa1.imprimir();
		pessoa2.imprimir();
		
		System.out.println("Renda Total: " + Pessoa.rendatotal);
		
	}
}
