package gabrielcastello;

public class ContaPoupanca extends Conta{
	private double rendimento;

	public ContaPoupanca(int numeroAgencia, int numeroConta, String senha, int cpf, String nome, String logradouro, int numero, String cidade, String unidadeFederativa, double rendimento) {
		super(numeroAgencia, numeroConta, senha, cpf, nome, logradouro, numero, cidade, unidadeFederativa);
		this.rendimento = rendimento;
	}
	
	@Override
	public void depositar(int valor) {
		this.saldo = saldo + valor;
		calcularRendimento();
		System.out.println("Voce depositou " + valor);
	}
	
	private void calcularRendimento() {
		this.saldo += this.saldo * this.rendimento;
	}
	
	
}
