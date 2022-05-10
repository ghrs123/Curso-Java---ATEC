package Enumerado;

public enum EstiloMusical {

	ROCK(1), POP(2), CLASSICA(3), RAP(4), METAL(5), JAZZ(6), OUTROS(7);

	private EstiloMusical(int numero) {
		this.numero = numero;
	}

	private int numero;

	public int getNumero() {
		return numero;
	}

	public static EstiloMusical selecionaEnum(int estilo) {
		EstiloMusical lista[] = EstiloMusical.values();

		for (int i = 0; i < lista.length; i++) {
			if (lista[i].getNumero() == estilo) {
				return lista[i];
			}
		}
		return null;
	}

}
	