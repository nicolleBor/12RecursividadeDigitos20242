package controller;

public class DigitosQtd {
	
	public DigitosQtd() {
		super();
	}
	
	public int digitosQtd(int n) {
		
		//Condição de parada
		if(n == 0) {
			return 0;
		} else {
			return 1 + digitosQtd(n/10); //Chamada de função
		}
	}
}
