package aula10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in);
		Calculadora calculadora = new Calculadora();
		int numero1, numero2;
		
		try {
			System.out.println("Informe o numerador: ");
			numero1 = input.nextInt();
			
			System.out.println("Informe o denominador: ");
			numero2 = input.nextInt();
			
			calculadora.dividir(numero1, numero2);
			
			} catch(InputMismatchException ime) {
				System.out.println("Você fez besteira");
				
			}
		
		finally{
			input.close();
		}
		
		

	}

}
