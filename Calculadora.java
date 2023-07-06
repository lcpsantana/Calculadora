package aplicacao;

public class Calculadora {

	public static void main(String[] args) {

		ControleOperacao controle = new ControleOperacao();

		controle.lerDados();
		controle.iniciaCalc();
		controle.calcular();

	}

}
