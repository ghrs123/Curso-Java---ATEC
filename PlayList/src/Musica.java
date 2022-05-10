import java.io.IOException;
import Enumerado.EstiloMusical;

public class Musica implements IPlay {
	public Arquivo arquivo;
	private String titulo;
	private int anoCriacao;
	private EstiloMusical estiloMusical;
	private String cantorGrupo;
	private int duracao;
	private String localizacao;
	private double id = Math.random();

	public Musica(double id, String titulo, int anoCriacao, EstiloMusical estiloMusical, String cantorGrupo,
			int duracao, String localizacao) {
		if (titulo == null || titulo.equals("") || anoCriacao == 0 || estiloMusical == null || cantorGrupo == null
				|| cantorGrupo.equals("") || duracao == 0 || localizacao == null || localizacao.equals("")) {
			throw new IllegalArgumentException("ERRO: parâmetros inválidos! ");
		}
		this.id = id;
		this.titulo = titulo;
		this.anoCriacao = anoCriacao;
		this.estiloMusical = estiloMusical;
		this.cantorGrupo = cantorGrupo;
		this.duracao = duracao;
		this.localizacao = localizacao;
	}

	public Musica(String titulo, int anoCriacao, EstiloMusical estiloMusical, String cantorGrupo, int duracao,
			String localizacao) {
		if (titulo == null || titulo.equals("") || anoCriacao == 0 || estiloMusical == null || cantorGrupo == null
				|| cantorGrupo.equals("") || duracao == 0 || localizacao == null || localizacao.equals("")) {
			throw new IllegalArgumentException("ERRO: parâmetros inválidos! ");
		}
		this.titulo = titulo;
		this.anoCriacao = anoCriacao;
		this.estiloMusical = estiloMusical;
		this.cantorGrupo = cantorGrupo;
		this.duracao = duracao;
		this.localizacao = localizacao;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnoCriacao() {
		return anoCriacao;
	}

	public void setAnoCriacao(int anoCriacao) {
		this.anoCriacao = anoCriacao;
	}

	public EstiloMusical getEstiloMusical() {
		return estiloMusical;
	}

	public void setEstiloMusical(EstiloMusical estiloMusical) {
		this.estiloMusical = estiloMusical;
	}

	public String getCantorGrupo() {
		return cantorGrupo;
	}

	public void setCantorGrupo(String cantorGrupo) {
		this.cantorGrupo = cantorGrupo;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public double getId() {
		return id;
	}

	public String toString() {

		return id + ";" + titulo + ";" + anoCriacao + ";" + estiloMusical.getNumero() + ";" + cantorGrupo + ";"
				+ duracao + ";" + localizacao;
	}

	public void play() throws IOException {
		Runtime.getRuntime().exec("cmd /c start " + localizacao + "\\" + titulo);
		
	}

}
