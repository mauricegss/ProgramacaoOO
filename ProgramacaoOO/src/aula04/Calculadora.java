package aula04;

public class Calculadora {
	
	boolean estado = false;
	String marca;
	String modelo;
	String tipo;
	int memoriaInterna;
	
	public void ligar(){
		estado = true;
	}
	
	public void desligar(){
		estado = false;
	}
	
	public double somar(double num1, double num2) {
		if(estado == true) {
			return num1 + num2;
		}
		return 0;
	}
	
	public double subtrair(double num1, double num2) {
		if(estado == true) {
			return num1 - num2;
		}
		return 0;
	}
	
	public double multiplicar(double num1, double num2) {
		if(estado == true) {
			return num1 * num2;
		}
		return 0;
	}
	
	public double dividir(double num1, double num2) {
		if(estado == true) {
			return num1 / num2;
		}
		return 0;
	}
	
}
