package aula10;

public class Calculadora {
	
	public void dividir(int numero1, int numero2) {
		
		try {
			
			try {
				int soma = numero1 / numero2;
				System.out.println("Valor: " + soma);
			} catch(ArithmeticException ae) {
				System.out.println("Impossível dividir por zero");
			}
		} catch(Exception e) {
			System.out.println("Erro Desconhecido");
			System.out.println("Erro: " + e.getMessage()); // VER QUAL E O ERRO
		}
		
		finally { // SEMPRE EXECUTA
			System.out.println("Função Encerrada");
		}
		
		
	}

}
