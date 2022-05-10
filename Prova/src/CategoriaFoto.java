import PovaTipoDois.Genero;

public enum CategoriaFoto {

	CORES('c'), PRETO_BRANCO('p');

	public char abreviatudaCat;

	private CategoriaFoto(char valor) {
		this.abreviatudaCat = valor;
	}

	public char getAbreviatudaCat() {
		return abreviatudaCat;
	}

	public CategoriaFoto selecionaCategoria(char valor) {
		CategoriaFoto [] lista = CategoriaFoto.values();
		for (int i = 0; i < lista.length; i++) {
			if (lista[i].getAbreviatudaCat() == valor ) {
				return lista[i];
			}
		}
		return null;

	}

}
