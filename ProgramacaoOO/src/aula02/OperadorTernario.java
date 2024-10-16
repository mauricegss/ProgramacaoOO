package aula02;

import java.util.Scanner;

public class OperadorTernario{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um numero:");
		int num = input.nextInt();
		input.nextLine();
		String resultado = (num % 2 == 0) ? "Par" : "Impar";
		System.out.println(num + " é " + resultado);
		input.close();
	}
}