package ProvaDois;

import java.util.Arrays;

public class FotoFamiliar extends Foto {

	private String[] guardarNomesFamiliares;
	int quantidadeNomes;
	String nomeFamiliar;

	public FotoFamiliar(String idFoto, int ano, int mes, int dia, int quantidadeNomes,String nomeFamiliar) {
		super(idFoto, ano, mes, dia);
		this.nomeFamiliar =nomeFamiliar;
		this.quantidadeNomes = quantidadeNomes;
		this.guardarNomesFamiliares = new String[this.quantidadeNomes];
	
	}

	public String[] getGuardarNomesFamiliares() {
		return guardarNomesFamiliares;
	}

	public void setGuardarNomesFamiliares(String[] guardarNomesFamiliares) {
		this.guardarNomesFamiliares = guardarNomesFamiliares;
	}


	public String toString() {
		return "Nome dos Familiares =" + Arrays.toString(guardarNomesFamiliares);
	}


	public String descreveTipoDeFoto() {
		for(int i=0;i<guardarNomesFamiliares.length; i++) {
			return guardarNomesFamiliares[i]=nomeFamiliar;
		}
		return null;
	}

	

	
}
