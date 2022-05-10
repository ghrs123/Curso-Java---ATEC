package atec.flj.Mat;

import atec.flj.Mat.funcoes.Mmc;

public class Fracao {

	private NumeroInt numerador;
	private NumeroInt denominador;

	public Fracao(NumeroInt numerador, NumeroInt denominador) {

		this.numerador = numerador;
		this.denominador = denominador;
	}

	public NumeroInt getNumerador() {
		return numerador;
	}

	public void setNumerador(NumeroInt numerador) {
		this.numerador = numerador;
	}

	public NumeroInt getDenominador() {
		return denominador;
	}

	public void setDenominador(NumeroInt denominador) {
		this.denominador = denominador;
	}

	public String toString() {
		return "Fracao: numerador=" + numerador + "denominador=" + denominador;
	}

//	public Fracao soma(Fracao num) {
//		//mmc ((dividendo.getNumero() * divisor.getNumero()) / mdc.getNumero())
//		NumeroInt a,b;
//		
//		NumeroInt fracaoUm = Mmc.mmc(numerador, denominador);
//		NumeroInt fracaoDois = Mmc.mmc(num.getNumerador(), num.getDenominador());
//		int resultado = fracaoUm.getNumero() + fracaoDois.getNumero();
//
//		//return new Fracao(new NumeroInt(resultado));
//	}

	public static Fracao soma(Fracao f1, Fracao f2) {

		return f1;

	}

//	NumeroInt fracaoUm = Mmc.mmc(3, 2);
//	NumeroInt fracaoDois = Mmc.mmc(6, 5);

}
