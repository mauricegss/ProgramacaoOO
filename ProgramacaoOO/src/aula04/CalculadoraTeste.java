package aula04;

public class CalculadoraTeste {
	public static void main(String[] args) {
		
		Calculadora calculadora = new Calculadora();
		calculadora.marca = "CASIO";
		calculadora.modelo = "USB2.0";
		calculadora.memoriaInterna = 8;
		calculadora.tipo = "Científica";
		
		calculadora.ligar();
		System.out.println(calculadora.somar(1, 2));
		
	}
}
