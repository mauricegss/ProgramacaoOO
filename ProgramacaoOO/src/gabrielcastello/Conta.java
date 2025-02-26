package gabrielcastello;

public abstract class Conta {
	protected int numeroAgencia;
	protected int numeroConta;
	protected String senha;
	protected double saldo;
	protected Correntista correntista;
	
	public Conta(int numeroAgencia, int numeroConta, String senha, int cpf, String nome, String logradouro, int numero, String cidade, String unidadeFederativa) {
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroConta;
		this.senha = senha;
		this.saldo = 0;
		this.correntista = new Correntista(cpf, nome, logradouro, numero, cidade, unidadeFederativa);
	}
	
	public void depositar(int valor) {
		this.saldo = saldo + valor;
		System.out.println("Voce depositou " + valor);
	}
	
	public void sacar(int valor, String senha) throws SenhaIncorretaException, SaldoInsuficienteException{
		if(senha != this.senha) {
			throw new SenhaIncorretaException("Senha Incorrreta!");	
		}
		else {
			if(valor > this.saldo) {
				throw new SaldoInsuficienteException("Saldo Insuficiente!");
			}
			else {
				this.saldo = saldo - valor;
				System.out.println("Voce sacou " + valor);
			}
		}
	}
	
	public void exibirSaldo(String senha) throws SenhaIncorretaException {
		if(senha != this.senha) {
			throw new SenhaIncorretaException("Senha Incorrreta!");	
		}
		else {
			System.out.println("Número da Agência: " + this.numeroAgencia + "\nNúmero da Conta: " + this.numeroConta + "\nNome do Correntista: " + this.correntista.getNome() + "\nSaldo: " +  this.saldo);
		}
	}

	
	
}
