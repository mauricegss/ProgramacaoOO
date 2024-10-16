package aula02;

import java.util.Scanner;

public class IfElse{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um numero:");
		int num1 = input.nextInt();
		System.out.println("Digite um numero:");
		int num2 = input.nextInt();
		System.out.println("Digite um numero:");
		int num3 = input.nextInt();
		if (num1 >= num2 && num1 >= num3) { 
			System.out.println(num1 +" é maior");
		} else if (num2>=num1 && num2 >= num3) {
			System.out.println(num2 +" é maior");
		} else {
			System.out.println(num3 +" é maior");
		}
		input.close();
	}
}