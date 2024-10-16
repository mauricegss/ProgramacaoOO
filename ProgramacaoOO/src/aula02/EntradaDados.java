package aula02;

import java.util.Scanner;

public class EntradaDados{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Informe seu nome:");
		String nome1 = input.nextLine();
		System.out.println("Informe sua idade:");
		int idade = input.nextInt();
		System.out.println("Informe seu peso:");
		double peso = input.nextDouble();
		System.out.println(nome1 + " possui " + idade + " anos e " + peso + " quilos.");
		input.close();
	}
}