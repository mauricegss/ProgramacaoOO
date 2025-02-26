package aula11;

import java.util.InputMismatchException;

public class teste {

	public static void main(String[] args) {
			
		Calculadora calculadora = new Calculadora();
		
		try {
			
			calculadora.calcularRaizQuadrada();
			
		} catch (ArithmeticException ae) {
			System.out.println("Arithmetic Exception");
		} catch(InputMismatchException ime) {
			System.out.println("Input Mismatch Exception");	
		} catch (Exception e) {
			System.out.println("Exception");
		} 
		
		finally{
			System.out.println("Código Finalizado");
		}
		
		

	}

}
