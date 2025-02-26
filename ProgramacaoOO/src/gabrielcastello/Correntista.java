package gabrielcastello;

public class Correntista {
	private int cpf;
	private String nome;
	private Endereco endereco;
	
	public Correntista(int cpf, String nome, String logradouro, int numero, String cidade, String unidadeFederativa) {
		this.cpf = cpf;
		this.nome = nome;
		this.endereco = new Endereco(logradouro, numero, cidade, unidadeFederativa);
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	
}
