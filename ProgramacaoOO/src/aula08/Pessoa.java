package aula08;
//Aula de Associações

public class Pessoa {
	String nome;
	String nascimento;
	String sexo;
	Endereco endereco;
	
	public Pessoa(String nome, String nascimento, String sexo, Endereco endereco) {
		
		this.nome = nome;
		this.nascimento = nascimento;
		this.sexo = sexo;
		this.endereco = endereco;
	}
}
