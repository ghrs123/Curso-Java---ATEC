package PovaTipoDois;

public enum Genero {
	
	FEMININO('F'), MASCULINO('M');
	
	private char abreviaturaGenero;
	
	private Genero(char c) {
		this.abreviaturaGenero = c;
	}

	public char getAbreviaturaGenero() {
		return abreviaturaGenero;
	}

	
	public void setAbreviaturaGenero(char abreviaturaGenero) {
		this.abreviaturaGenero = abreviaturaGenero;
	}
	
		
	
	public static Genero selecionaGenero(char opcao) {
		Genero genero[] = Genero.values();
		for(int i=0;i< genero.length;i++) {
			if (genero[i].getAbreviaturaGenero() == opcao) {
			
				return genero[i];
			}
		}
		return null ;
	}
	
}
