package lista05ex05;

public class Vagas {
	
	private int numero;
	private Status status;
	private Veiculo veiculo;
	private int horario;
	
	public Vagas(int numero) {
		this.numero = numero;
		this.status = Status.LIBERADA;
		this.veiculo = null;
		this.horario = 0;
	}
	
	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public int getNumero() {
		return numero;
	}

	public int getHorario() {
		return horario;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setHorario(int horario) {
		this.horario = horario;
	}
	
	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	
	
	
}
