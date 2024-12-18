package lista05ex05;

public class Veiculo {
	private String placa;
	private String modelo;
	private String cor;
	private UnidadeFederativa uf;
	
	public Veiculo(String placa, String modelo, String cor, UnidadeFederativa uf) {
		this.placa = placa;
		this.modelo = modelo;
		this.cor = cor;
		this.uf = uf;
	}
	
	

	public UnidadeFederativa getUf() {
		return uf;
	}

	public void setUf(UnidadeFederativa uf) {
		this.uf = uf;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

}
