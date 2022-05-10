import java.io.IOException;
public class Playlist {
	private String nome;
	private int capacidade;
	private String dataCriacao;
	private int numMusicas = 0;
	private Musica[] musicas;

	public Playlist(String nome, int capacidade, String dataCriacao) {
		this.nome = nome;
		this.capacidade = capacidade;
		this.dataCriacao = dataCriacao;
		if (!(this.capacidade > 0)) {
			throw new IllegalArgumentException("ERRO: A capacidade da Playlist deve ser maior que 0 !");
		}
		this.musicas = new Musica[this.capacidade];
		numMusicas++;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public String getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(String dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Musica[] getMusicas() {
		return musicas;
	}

	public void setMusica(Musica[] musica) {
		this.musicas = musica;
	}

	public String toString() {
		return nome + ";" + capacidade + ";" + dataCriacao;
	}

	public boolean listaCheia() {

		return numMusicas == capacidade;
	}

	public void adicionaMusica(Musica music) {
		if (!listaCheia() == true) {
			for (int i = 0; i < musicas.length; i++) {
				if (musicas[i] == null) {
					musicas[i] = music;
					numMusicas++;
					break;
				}
			}

		}
	}

	public void exibirMusicas() throws IOException {

		for (int i = 0; i < musicas.length; i++) {
			if (musicas[i] != null) {
				Musica musica = musicas[i];
				System.out.println("|  Título: " + musica.getTitulo()+"     |" + "\n|  Ano que produzida: "  + musica.getAnoCriacao()+"   |"
						+ "\n|  Estilo da musica: " + musica.getEstiloMusical() +"  |"+ "\n|  Grupo/Cantor: "
						+ musica.getCantorGrupo()+"     |" + "\nLocalização do ficheiro: " + musica.getLocalizacao()+"\n");
			}

		}

	}

	public Musica pesquisarMusicaPorTitulo(String titulo) {

		for (int i = 0; i < musicas.length; i++) {
			if (musicas[i] != null) {
				if (musicas[i].getTitulo().equalsIgnoreCase(titulo)) {
					Musica musica = musicas[i];

					return musica;
				}
			}
		}
		return null;
	}

	private void atualizarMusica(Musica musica) {

		for (int i = 0; i < musicas.length; i++) {
			if (musicas[i] != null) {
				if (musicas[i].getId() == musica.getId()) {

					musicas[i] = musica;
				}
			}
		}
	}

	public void editarMusica(Musica musica) {
		atualizarMusica(musica);
	}

	public void deletaMusica(String titulo) {
		Musica musica = pesquisarMusicaPorTitulo(titulo);
		if (musica != null) {
			for (int i = 0; i < musicas.length; i++) {
				if (musicas[i].getTitulo().equalsIgnoreCase(titulo)) {
					musicas[i] = null;
					numMusicas--;
					break;
				}

			}
		}

	}

	public void editaPlaylist(String nome, int capacidade, String data) {
		this.setNome(nome);
		this.setCapacidade(capacidade);
		this.setDataCriacao(data);

	}

}
