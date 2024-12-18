package lista05ex05;

import java.util.List;

public class Estacionamento {
	
	private List <Vagas> vagas;
	
	public Estacionamento(List<Vagas> vagas) {
		this.vagas = vagas;
	}
	
	public List<Vagas> getVagas() {
		return vagas;
	}

	public void setVagas(List<Vagas> vagas) {
		this.vagas = vagas;
	}
	
	public void imprimirVaga(int numero) {
		for(Vagas vaga : vagas) {
			if(vaga.getNumero() == numero) {
				System.out.println("========================");
			    System.out.println("Vaga " + vaga.getNumero());
			    System.out.println(vaga.getStatus());
			    if (vaga.getStatus() == Status.OCUPADA) {
			        System.out.println("Veículo: " + vaga.getVeiculo().getModelo());
			        System.out.println("UF: " + vaga.getVeiculo().getUf().getSigla());
			        System.out.println("Horário: " + vaga.getHorario() + " Horas");
			    }
			    System.out.println("========================");
			    return;
			}
		}
	}

	public void estacionar(Veiculo veiculo, int horario) {
		Vagas vaga = verificarVaga();
		if(vaga != null) {
			vaga.setVeiculo(veiculo);
			vaga.setHorario(horario);
			vaga.setStatus(Status.OCUPADA);
			System.out.println("Veiculo Estacionado");
			return;
		}
		System.out.println("Veiculo Não Estacionado");
	}

	public Vagas verificarVaga() {
		for(Vagas vaga : this.vagas) {
			if(vaga.getStatus() == Status.LIBERADA) {
				return vaga;
			}
		}
		return null;
	}
	
	public void retirarVeiculo(String placa, int horaRetirada) {
		for(Vagas vaga : this.vagas) {
			if(vaga.getVeiculo().getPlaca() == placa) {
				calcularCusto(vaga, horaRetirada);
				vaga.setStatus(Status.LIBERADA);
				//vaga.setVeiculo(null);
				//vaga.setHorario(0);
				return;
			}
		}
		System.out.println("Veiculo não Encontrado");
	}

	public void calcularCusto(Vagas vaga, int horaRetirada) {
		double preco = horaRetirada - vaga.getHorario();
		if(preco <=3) {
			preco = 2;
		} else {
			preco = 2 + (0.5*(preco-3));
		}
		System.out.println("Veiculo Retirado = "+ preco +" Reais");
	}
	
}
