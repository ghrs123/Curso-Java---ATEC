import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import Enumerado.EstiloMusical;

public class Arquivo implements IArquivo {

	public final String ARQUIVO = "playlist.txt";

	public void salvarPlaylist(Playlist playlist) {

		try (PrintWriter escreveArquivo = new PrintWriter(ARQUIVO)) {
			// PrintWriter printWriter = new PrintWriter(ARQUIVO);
			escreveArquivo.print("P;" + playlist.toString());

			for (int i = 0; i < playlist.getMusicas().length; i++) {
				Musica musica = playlist.getMusicas()[i];
				if (musica != null) {
					escreveArquivo.printf("\nM;" + playlist.getMusicas()[i].toString());
				}

			}
			System.out.println("\nPlayList salva com sucesso");
		} catch (IOException e) {
			System.out.println("Ocorreu um erro ao gravar a playlist.");
			e.printStackTrace();
		}
	}

	public Playlist carregarPlayList() {
		Playlist playlist = null;

		try (Scanner leitura = new Scanner(new File(ARQUIVO))) {
			while (leitura.hasNextLine()) {

				String linha = leitura.nextLine();
				String[] atributos = linha.split(";");
				if (atributos[0].equalsIgnoreCase("P")) {
					playlist = new Playlist(atributos[1], Integer.parseInt(atributos[2]), atributos[3]);
				} else if (atributos[0].equalsIgnoreCase("M")) {

					Musica musica = new Musica(Double.parseDouble(atributos[1]), atributos[2],
							Integer.parseInt(atributos[3]), EstiloMusical.selecionaEnum(Integer.parseInt(atributos[4])),
							atributos[5], Integer.parseInt(atributos[6]), atributos[7]);
					playlist.adicionaMusica(musica);

				}

			}

		} catch (FileNotFoundException e) {
			System.out.println("Ocorreu um erro ao CArregar o arquivo!");
			e.printStackTrace();

		}

		return playlist;
	}

}
