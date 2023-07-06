package aplicacao;

public class Operadores {

	private Double num1;
	private Double num2;
	private Double result;

	public Operadores() {

	}

	public Operadores(Double num1, Double num2) {
		this.num1 = num1;
		this.num2 = num2;

	}

	public Double somar(Double num1, Double num2) {
		return result = num1 + num2;

	}

	public Double subtrair(Double num1, Double num2) {
		return result = num1 - num2;

	}

	public Double multiplicar(Double num1, Double num2) {
		return result = num1 * num2;

	}

	public Double dividir(Double num1, Double num2) {
		return result = num1 / num2;

	}
	
	public Double resto(Double num1, Double num2) {
		return result = num1 % num2;

	}

	public void resultado() {
		System.out.println();
		System.out.println("Valor: " + result);
	}

}