package atec.flj.Mat.funcoes;

import atec.flj.Mat.NumeroInt;
import atec.flj.Mat.funcoes.Mmc;

public class Mdc {

	public static NumeroInt mdc(NumeroInt dividendo, NumeroInt divisor) {

		if (dividendo.getNumero() % divisor.getNumero() == 0) {

			return divisor;
		} else {
			while (divisor.getNumero() != 0) {
				int r = dividendo.getNumero() % divisor.getNumero();
				dividendo = divisor;
				divisor.setNumero(r);
			}
			return dividendo;
		}
	}
}
