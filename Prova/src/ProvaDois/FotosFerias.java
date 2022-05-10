package ProvaDois;

public class FotosFerias extends Foto {
	private String nomeLocal;

	
	public FotosFerias(String idFoto, int ano, int mes, int dia, String nomeLocal) {
		super(idFoto, ano, mes, dia);
		this.nomeLocal = nomeLocal;
	}


	@Override
	public String descreveTipoDeFoto() {
		return nomeLocal; 
	}

}
