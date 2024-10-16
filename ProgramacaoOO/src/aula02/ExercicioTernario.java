package aula02;

import java.util.Scanner;

public class ExercicioTernario{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Insira valor da compra:");
		double valor = input.nextDouble();
		valor = (valor>=50) ? valor*0.9 : valor*0.95;
		System.out.println("Valor Final: " + valor);
		input.close();
	}
}