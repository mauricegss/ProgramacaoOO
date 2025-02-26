package gabrielcastello;

public class MainTeste {

	public static void main(String[] args) throws SenhaIncorretaException, SaldoInsuficienteException {
		// TODO Auto-generated method stub
		Conta conta1 = new ContaCorrente(1, 11, "123", 375, "Marcos", "Casa", 152, "Ponta Grossa", "Paraná", 500);
		//conta1.exibirSaldo("111");
		conta1.exibirSaldo("123");
		conta1.depositar(1000);
		conta1.sacar(1200, "123");
		conta1.exibirSaldo("123");
		Conta conta2 = new ContaPoupanca(1, 22, "321", 375, "Marcos", "Casa", 152, "Ponta Grossa", "Paraná", 0.10);
		conta2.exibirSaldo("321");
		conta2.depositar(1000);
		conta2.exibirSaldo("321");
		conta2.sacar(1000, "321");
		conta2.exibirSaldo("321");
	}

}
