package atec.flj.Mat.funcoes;

import atec.flj.Mat.NumeroInt;

public class Mmc {

	public static NumeroInt mmc(NumeroInt dividendo, NumeroInt divisor) {
		
		NumeroInt mdc = Mdc.mdc(dividendo, divisor);

		int resultadoMmc = ((dividendo.getNumero() * divisor.getNumero()) / mdc.getNumero());
		NumeroInt mmc = new NumeroInt(resultadoMmc);
		return mmc;
	}

}
