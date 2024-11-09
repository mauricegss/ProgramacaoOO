package aula06;

public class TiposDadosMain {
	public static void main(String[] args) {
		
		TiposDados pessoa1 = new TiposDados();
		TiposDados pessoa2 = new TiposDados();
		
		pessoa1.nome = "Maurice";
		pessoa2.nome = "Jorge";
		
		pessoa1.doar(1000);
		pessoa2.doar(1500);
		
		pessoa1.imprimir();
		pessoa2.imprimir();
		
		System.out.println("Doação Total: " + TiposDados.doacaoTotal);
		
	}
}
