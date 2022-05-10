
public abstract class Foto {
	private String idFoto;
	private CategoriaFoto categoriaFoto;
	private int ano;
	private int mes;
	private int dia;
	public static  int numlikes;

	public Foto(String idFoto, CategoriaFoto categoriaFoto, int ano, int mes, int dia) {

		this.idFoto = idFoto;
		this.categoriaFoto = categoriaFoto;
		this.ano = ano;
		this.mes = mes;
		this.dia = dia;
		numlikes = 0;
	}

	public String getIdFoto() {
		return idFoto;
	}

	public void setIdFoto(String idFoto) {
		this.idFoto = idFoto;
	}

	public CategoriaFoto getCategoriaFoto() {
		return categoriaFoto;
	}

	public void setCategoriaFoto(CategoriaFoto categoriaFoto) {
		this.categoriaFoto = categoriaFoto;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getNumlikes() {
		return numlikes;
	}

	public void setNumlikes(int numlikes) {
		this.numlikes = numlikes;
	}

	public String toString() {
		return "Identificaçao da Foto=" + idFoto + "\nCategoria da Foto=" + categoriaFoto + "\nAno=" + ano + "\nMes="
				+ mes + "\nDia=" + dia+ "Total de Likes"+numlikes;
	}

	public void adicionaLike() {
		numlikes++;
	}
}
