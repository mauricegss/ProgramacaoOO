package aula09;

public class ContaBancaria {
	
	private int numero;
	private String titular;
	private double saldo;
	
	public ContaBancaria(int numero, String titular) {
		super();
		this.numero = numero;
		this.titular = titular;
		this.saldo = 0.00;
	}

	public void sacar(double valor) {
		
		if(valor <= this.saldo) {
			
			this.saldo -= valor;
			System.out.println("O saque foi efetuado com sucesso!");
		} else {
			
			System.out.println("Saldo é insuficiente!");
		}
	}
	
	public void depositar(double valor) {
		
		this.saldo += valor;
		System.out.println("Depósito realizado com sucesso!");
		
		this.calcularRendimentos();
	}
	
	private void calcularRendimentos() {
		
		double rendimento = this.saldo * 0.10;
		this.saldo += rendimento;
	}
	
	public void imprimirConta() {
		
		System.out.println("===============================");
		System.out.println("Nome: " + titular + "\nNúmero: " + numero + "\nSaldo: " + saldo);
		System.out.println("===============================");
	}
	
	//métodos getters
	public int getNumero() {
		
		return this.numero;
	}
	
	public String getTitular() {
		
		return this.titular;
	}
	
	public double getSaldo() {
		
		return this.saldo;
	}
	
	//métodos settes
	public void setNumero(int numero) {
		
		this.numero = numero;
	}
	
	public void setTitular(String titular) {
		
		if(!titular.equals("")) {
			this.titular = titular;
		}
	}
}








