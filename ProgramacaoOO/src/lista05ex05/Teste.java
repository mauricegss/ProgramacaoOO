package lista05ex05;

import java.util.List;
import java.util.ArrayList;

public class Teste {
	public static void main(String[] args) {
		
		List<Vagas> listaVagas = new ArrayList<Vagas>();
		for(int i = 1; i<=5;i++) {
			Vagas vaga = new Vagas(i);
			listaVagas.add(vaga);
		}
        Estacionamento estacionamento = new Estacionamento(listaVagas);
        
		Veiculo carro1 = new Veiculo("A", "A", "Vermelho", UnidadeFederativa.SP);
		Veiculo carro2 = new Veiculo("B", "B", "Vermelho", UnidadeFederativa.RJ);
		Veiculo carro3 = new Veiculo("C", "C", "Vermelho", UnidadeFederativa.MG);
		Veiculo carro4 = new Veiculo("D", "D", "Vermelho", UnidadeFederativa.ES);
		Veiculo carro5 = new Veiculo("E", "E", "Vermelho", UnidadeFederativa.RJ);
		Veiculo carro6 = new Veiculo("F", "F", "Vermelho", UnidadeFederativa.SP);
		
		estacionamento.estacionar(carro1, 2);
		estacionamento.estacionar(carro2, 2);
		estacionamento.estacionar(carro3, 2);
		estacionamento.estacionar(carro4, 2);
		estacionamento.estacionar(carro5, 2);
		estacionamento.estacionar(carro6, 2);
		
		estacionamento.imprimirVaga(5);
		estacionamento.retirarVeiculo("E", 7);
		estacionamento.imprimirVaga(5);
		estacionamento.estacionar(carro6, 2);
		estacionamento.imprimirVaga(5);
		
	}
}
