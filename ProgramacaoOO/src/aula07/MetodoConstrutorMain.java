package aula07;

public class MetodoConstrutorMain {

	public static void main(String[] args) {
		
		MetodoConstrutor pessoa1 = new MetodoConstrutor("Maurice",1000.0);
		MetodoConstrutor pessoa2 = new MetodoConstrutor("Jorge",1500.0);
		
		System.out.println("\n" + pessoa1.toString());
		System.out.println("\n" + pessoa2.toString());
		System.out.println("\nRenda Total = " + MetodoConstrutor.getRendaTotal());
		
	}

}