package view;

import controller.DigitosQtd;

public class Principal {

	public static void main(String[] args) {
		DigitosQtd digitos = new DigitosQtd();
		int n = 123458;
		int resultado = (digitos.digitosQtd(n));
		System.out.println(resultado);
	}

}
