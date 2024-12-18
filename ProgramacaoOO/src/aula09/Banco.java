package aula09;

import java.util.List;
import java.util.ArrayList;

public class Banco {

	//private int cnpj;
	//private String nome;
	private List <ContaBancaria> contasBancarias;
	
	public Banco(/*int cnpj, String nome*/) {
		//this.cnpj = cnpj;
		//this.nome = nome;
		this.contasBancarias = new ArrayList<ContaBancaria>();
	}
	
	public void criarConta(int numConta, String nome) {
		
		ContaBancaria cb = new ContaBancaria(numConta, nome);
		this.contasBancarias.add(cb);
		System.out.println("Conta Adicionada");
		
	}
	
	public void removerConta(int numConta) {
		
		for(ContaBancaria contaBancaria : this.contasBancarias) {
			
			if(contaBancaria.getNumero() == numConta) {
				this.contasBancarias.remove(contaBancaria);
				System.out.println("Conta Removida");
				return;
			}
		}
		System.out.println("Conta não Encontrada");
		
	}
	
	public void realizarSaqueConta(int numConta, int valor) {
		
		for(ContaBancaria contaBancaria : this.contasBancarias) {
			if(contaBancaria.getNumero() == numConta) {
				contaBancaria.sacar(valor);
				return;
			}
		}
		System.out.println("Conta não Encontrada");
	}
	
public void realizarDepositoConta(int numConta, int valor) {
		
		for(ContaBancaria contaBancaria : this.contasBancarias) {
			if(contaBancaria.getNumero() == numConta) {
				contaBancaria.depositar(valor);
				return;
			}
		}
		System.out.println("Conta não Encontrada");
	}
}
