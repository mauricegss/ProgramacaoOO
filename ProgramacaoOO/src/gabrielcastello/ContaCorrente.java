package gabrielcastello;

public class ContaCorrente extends Conta{
	private int limite;
	
	public ContaCorrente(int numeroAgencia, int numeroConta, String senha, int cpf, String nome, String logradouro, int numero, String cidade, String unidadeFederativa, int limite) {
		super(numeroAgencia, numeroConta, senha, cpf, nome, logradouro, numero, cidade, unidadeFederativa);
		this.limite = limite;
	}
	
	@Override
	public void sacar(int valor, String senha) throws SenhaIncorretaException, SaldoInsuficienteException{
		if(senha != this.senha) {
			throw new SenhaIncorretaException("Senha Incorrreta!");	
		}
		else {
			if(valor > (this.saldo + this.limite)) {
				throw new SaldoInsuficienteException("Saldo Insuficiente!");
			}
			else {
				this.saldo = saldo - valor;
				System.out.println("Voce sacou " + valor);
			}
		}
	}




}
