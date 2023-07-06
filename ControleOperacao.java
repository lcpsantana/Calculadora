package aplicacao;

import java.util.Scanner;

public class ControleOperacao {

	Scanner sc = new Scanner(System.in);
	Double valor1;
	Double valor2;
	int operacao;

	public void lerDados() {

		System.out.print("Entre com o primeiro valor: ");
		valor1 = sc.nextDouble();

		System.out.println();

		System.out.print("Entre com o segundo valor: ");
		valor2 = sc.nextDouble();

	}

	public void iniciaCalc() {

		System.out.println();
		System.out.println("Qual operação deseja realizar? ");
		System.out.println();
		System.out.println("1 - para somar");
		System.out.println("2 - para subtrair");
		System.out.println("3 - para multiplicar");
		System.out.println("4 - para dividir");
		System.out.println("5 - para resto");

	}

	public void calcular() {

		Operadores operador = new Operadores();

		operacao = sc.nextInt();

		if (operacao == 1) {
			operador.somar(valor1, valor2);

		}

		else if (operacao == 2) {
			operador.subtrair(valor1, valor2);

		} else if (operacao == 3) {
			operador.multiplicar(valor1, valor2);

		} else if (operacao == 4) {
			operador.dividir(valor1, valor2);

		} else if (operacao == 5) {
			operador.resto(valor1, valor2);

		} else {
			System.out.println("Operador inválido");

		}

		operador.resultado();

		sc.close();

	}

}
