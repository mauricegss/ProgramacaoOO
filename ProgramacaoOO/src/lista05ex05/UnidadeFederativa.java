package lista05ex05;

public enum UnidadeFederativa {
	SP("São Paulo", "SP", "São Paulo"),
	RJ("Rio de Janeiro","RJ", "Rio de Janeiro"),
	MG("Minas Gerias", "MG", "Belo Horizonte"),
	ES("Espírito Santo", "ES", "Vitória");
	
	private String nome;
	private String sigla;
	private String capital;
	
	private UnidadeFederativa(String nome, String sigla, String capital) {
		this.nome = nome;
		this.sigla = sigla;
		this.capital = capital;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}
	
}
