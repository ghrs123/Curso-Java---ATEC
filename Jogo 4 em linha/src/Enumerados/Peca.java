package Enumerados;

public enum Peca {

	VERMELHO('X'), AZUL('O'), VAZIO(' ');

	private char simbolo;

	private Peca(char simbolo) {

		this.simbolo = simbolo;
	}

	public char getSimbolo() {
		return simbolo;
	}

}
