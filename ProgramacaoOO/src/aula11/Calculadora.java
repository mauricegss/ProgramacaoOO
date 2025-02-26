package aula11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
	
	public int numero1;
	public int numero2;
	
	public void dividir() throws ArithmeticException, Exception{
		this.informarDados();
		int soma = this.numero1 / this.numero2;
		System.out.println("Valor: " + soma);
	}
	
	public void calcularRaizQuadrada() throws ArithmeticException, Exception{
		
		
		this.informarDado();
		
		if (this.numero1 < 0) {
			throw new NumeroNaoNaturalException();
		}
		
		double soma = Math.sqrt(this.numero1);
		System.out.println("Valor: " + soma);
	}

	public void informarDado() throws InputMismatchException {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe o numerador: ");
		this.numero1 = input.nextInt();
		
		input.close();
	}
	
	public void informarDados() throws InputMismatchException {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe o numerador: ");
		this.numero1 = input.nextInt();
		
		System.out.println("Informe o denominador: ");
		this.numero2 = input.nextInt();
		
		input.close();
	}

	
}
