package aula02;

import java.util.Scanner;

public class LimpezaBuffer{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Informe seu nome completo:");
		String nome = input.nextLine();
		System.out.println("Informe seu sexo:");
		String sexo = input.nextLine();
		System.out.println("Informe seu estado civil:");
		String EC = input.nextLine();
		System.out.println("Informe a quantidade de filhos:");
		int filhos = input.nextInt();
		input.nextLine(); // Limpa Buffer
		System.out.println("Informe sua escolaridade:");
		String esc = input.nextLine();
		System.out.println("Informe sua renda mensal:");
		double RM = input.nextDouble();
		input.nextLine();
		System.out.println("Nome: " + nome);
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado Civil: " + EC);
		System.out.println("Filhos: " + filhos);
		System.out.println("Escolaridade: " + esc);
		System.out.println("Renda Mensa: " + RM);
		input.close();
	}
}