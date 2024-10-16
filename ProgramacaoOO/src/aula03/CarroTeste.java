package aula03;

public class CarroTeste {
	
	public static void main(String[] args) {
	
		//instanciacao de objetos da classe carro
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		
		// Atribuicao para cada carro
		carro1.modelo = "458 Italia";
		carro1.marca = "Ferrari";
		carro1.ano = 2015;
		carro1.placa = "ABC-1234";
		carro1.cor = "Vermelho";
		
		carro2.modelo = "459 Italia";
		carro2.marca = "Ferrari";
		carro2.ano = 2016;
		carro2.placa = "ABC-1235";
		carro2.cor = "Amarelo";
		
		// Obter valores de cada objeto
		System.out.println("Carro 1:");
		System.out.println("Modelo: " + carro1.modelo);
		System.out.println("Marca: " + carro1.marca);
		System.out.println("Ano: " + carro1.ano);
		System.out.println("Placa: " + carro1.placa);
		System.out.println("Cor: " + carro1.cor + "\n");
		// ou... (mais facil né)
		System.out.println("Carro 2:");
		carro2.printcarro();
	}

}
