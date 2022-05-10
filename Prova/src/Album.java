
public class Album {
	private String nomeAlbum;
	private String autor;
	private Foto[] lista;
	private Foto fotoFavorita;
	private int numAtualFotos = 0;
	private int numTotalAlbuns = 0;

	public Album(String nomeAlbum, String autor, Foto fotoFavorita) {

		this.nomeAlbum = nomeAlbum;
		this.autor = autor;
		this.fotoFavorita = fotoFavorita;
		numTotalAlbuns++;
	}

	public Album(String nomeAlbum, String autor) {
		super();
		this.nomeAlbum = nomeAlbum;
		this.autor = autor;
	}

	private void insereFoto(Foto foto) {

		for (int i = 0; i < numAtualFotos; i++) {

			if (lista[i] != null && numAtualFotos > 0) {
				lista[i] = foto;
				numAtualFotos++;
			} else {
				throw new IllegalArgumentException("Erro: não é possível adiconar foto");

			}
		}
	}

	public int adicionaLike(String id) {
		Foto foto = null;
		for (int i = 0; i < numAtualFotos; i++) {
			if (lista[i].getIdFoto().equals(id)) {
				foto.adicionaLike();

			}

		}
		return foto.getNumlikes();

	}

	public int obtemNumTotalAlbuns() {

		return numTotalAlbuns;
	}

	public boolean modificaIdentificadorFoto(Foto foto, String novoId) {

		for (int i = 0; i < numAtualFotos; i++) {
			if (lista[i].getIdFoto().equals(novoId)) {

				return false;
			} else {
				lista[i].setIdFoto(novoId);
			}

		}
		return true;
	}
	
	public void listaFotosAlbum() {
		Foto foto = null;
		for(Foto e: lista) {
			System.out.println(foto.toString());
		}
		
	}
	
	
}
