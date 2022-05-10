import java.io.IOException;
import java.util.Scanner;

import Enumerado.EstiloMusical;

public class Main {

//	private static final String ARQUIVO = "C:\\Users\\g_hen\\OneDrive\\Documentos\\FicheiroJava\\filename.txt";

	private static Playlist playlist = null;
	private static Arquivo arquivo = new Arquivo();
	private static Scanner armazena;

	public static void main(String[] args) throws IOException {
		carregarPlayList();
		inicializarMenu();
	}

	private static void carregarPlayList() {
		playlist = arquivo.carregarPlayList();
	}

	private static void inicializarMenu() throws IOException {
		armazena = new Scanner(System.in);
		System.out.println("Escolha a opção desejada.\n");
		System.out.println("[1] - Criar PlayList \n[2] - Editar PlayList \n[3] - Adicionar Música\n[4] - Editar Música"
				+ "\n[5] - Tocar Musica\n[6] - Deletar Música\n[7] - Exibir Músicas\n[0] - Sair\n");
		int escolha = armazena.nextInt();
		armazena.nextLine();
		String titulo = null;

		if (escolha != 1 && escolha != 2 && escolha != 3 && escolha != 4 && escolha != 5 && escolha != 6 && escolha != 7
				&& escolha != 0) {
			System.out.println("Opção errada.\nPor favor, escolha uma das opções indicadas entre [].\n");
			inicializarMenu();
		} else {
			if (escolha == 1) {
				criarPlaylist();
			} else if (escolha == 2) {
				if (playlist == null) {
					System.out.println("Não existe Playlist criada!\n");
					inicializarMenu();
				} else {
					editarPlayList();
				}

			} else if (escolha == 3) {

				if (!playlist.listaCheia() == true) {

					System.out.println("Título da Música junto com o formato.\nExempplo: Musica.mp3\nSe houver espaço no nome, adicionar _, Musica_segundoNome.mp3\n");
					titulo = armazena.next();
					armazena.nextLine();
					System.out.println("Ano de criação da Música\n");
					int ano = armazena.nextInt();
					armazena.nextLine();

					System.out.println("Escolha o estilo: [1] - ROCK\n[2] - POP"
							+ "\n[3] - CLASSICA\n[4] - RAP\n[5] - METAL\n[6] - JAZZ\n[7] - Outros\n");
					int opcaoEscolha = armazena.nextInt();

					System.out.println("Cantor ou Grupo");
					String cantor = armazena.next();

					System.out.println("Duração");
					int duracao = armazena.nextInt();

					System.out.println(
							"Informe o caminho onde a música se encontra.\nExemplo: C:\\Users\\g_hen\\Music\n");
					String localizacao = armazena.next();

					playlist.adicionaMusica(new Musica(titulo, ano, EstiloMusical.selecionaEnum(opcaoEscolha), cantor,
							duracao, localizacao));
					arquivo.salvarPlaylist(playlist);
					inicializarMenu();

				}
			} else if (escolha == 4) {
				editarMusica();

			} else if (escolha == 5) {
				tocarMusica();
			} else if (escolha == 6) {
				System.out.println("Digite o título da Música junto com o formato.\nExemplo: Musica.mp3\n");
				titulo = armazena.nextLine();
				
				playlist.deletaMusica(titulo);
				arquivo.salvarPlaylist(playlist);
				inicializarMenu();
			} else if (escolha == 7) {
				playlist.exibirMusicas();
				inicializarMenu();

			} else if (escolha == 0) {
				arquivo.salvarPlaylist(playlist);
				armazena.close();
				System.exit(0);

			}

	}

	}

	private static void tocarMusica() throws IOException {

		System.out.println("Digite o nome da musica a ser tocada.");
		String titulo = armazena.next();
		armazena.nextLine();
		Musica musica = playlist.pesquisarMusicaPorTitulo(titulo);
		if (musica != null) {
			musica.play();
		} else {
			System.out.println("ERRO: Musica não encontrada.");
		}
		inicializarMenu();
	}

	private static void criarPlaylist() throws IOException {

		Scanner armazena = new Scanner(System.in);

		System.out.println("Qual o nome da Playlist?");
		String nome = armazena.nextLine();

		System.out.println("Qual a capacidade da Playlist?");
		int capacidade = armazena.nextInt();
		armazena.nextLine();

		System.out.println("Data de criação da Playlist?");
		String data = armazena.next();
		armazena.nextLine();
		playlist = new Playlist(nome, capacidade, data);
		arquivo.salvarPlaylist(playlist);
		inicializarMenu();
		armazena.close();

	}

	private static void editarPlayList() throws IOException {

		Scanner armazena = new Scanner(System.in);

		String nome = null;
		String data = null;
		int capacidade = 0;

		System.out.println("Selecione a opção que deseja editar: [1] - Nome da PlayList\n[2]"
				+ " - Capacidade da Playlist\n[3] - Data de Criação da Playlist\n[4] - Editar todos os campos"
				+ "\n[0] - Sair");
		int resp = armazena.nextInt();
		armazena.nextLine();

		if (resp == 1) {
			System.out.println("Digite o nome da Playlist");
			nome = armazena.nextLine();
			playlist.setNome(nome);
			arquivo.salvarPlaylist(playlist);
			editarPlayList();

		} else if (resp == 2) {
			System.out.println("Digite a capacidade da Playlist");
			capacidade = armazena.nextInt();
			armazena.nextLine();
			playlist.setCapacidade(capacidade);
			arquivo.salvarPlaylist(playlist);
			editarPlayList();

		} else if (resp == 3) {
			System.out.println("Digite a data");
			data = armazena.next();
			armazena.nextLine();
			playlist.setDataCriacao(data);
			arquivo.salvarPlaylist(playlist);
			editarPlayList();

		} else if (resp == 4) {
			playlist.editaPlaylist(nome, capacidade, data);
			arquivo.salvarPlaylist(playlist);
			editarPlayList();

		} else if (resp == 0) {

			inicializarMenu();
			armazena.close();

		}

	}

	private static void editarMusica() throws IOException {
		if (playlist != null) {

			System.out.println("Por favor introduza o nome da musica a qual deseja editar.\nExemplo: Musica.mp3.\n");
			String titulo = armazena.nextLine();
			Musica musica = playlist.pesquisarMusicaPorTitulo(titulo);

			if (musica == null) {
				System.out.println("Musica não encontrada.\n");
				editarMusica();
			} else {

				Scanner armazena = new Scanner(System.in);
				System.out.println("Escolha a opção que deseja alterar.\n");
				System.out.println(
						"[1] - Título\n[2] - Ano de Criação\n[3] - Estilo\n[4] - Cantor ou Grupo\n[5] - Duração da musica\n[6] - Localização\n[0] - Sair ");
				int guarda = armazena.nextInt();

				armazena.nextLine();
				if (guarda == 1) {
					System.out.println("Digite o nome do titulo.\nExemplo: Musica.mp3.\n");
					String nome = armazena.nextLine();
					musica.setTitulo(nome);
					playlist.editarMusica(musica);
					arquivo.salvarPlaylist(playlist);
					editarMusica();
				} else if (guarda == 2) {

					System.out.println("Digite o Ano da música.\n");
					int ano = armazena.nextInt();
					musica.setAnoCriacao(ano);
					playlist.editarMusica(musica);
					arquivo.salvarPlaylist(playlist);
					editarMusica();

				} else if (guarda == 3) {

					System.out.println("Escolha o estilo: [1] - ROCK\n[2] - POP"
							+ "\n[3] - CLASSICA\n[4]- RAP\n[5]-METAL\n[6] - JAZZ\n[7] - Outros \n");
					int opcaoEscolha = armazena.nextInt();
					musica.setEstiloMusical(EstiloMusical.selecionaEnum(opcaoEscolha));
					playlist.editarMusica(musica);
					arquivo.salvarPlaylist(playlist);
					editarMusica();

				} else if (guarda == 4) {

					System.out.println("Digite o nome do Cantor ou do Grupo.\n");
					String cantor = armazena.nextLine();
					musica.setCantorGrupo(cantor);
					playlist.editarMusica(musica);
					arquivo.salvarPlaylist(playlist);
					editarMusica();
				} else if (guarda == 5) {

					System.out.println("Digite a duração da música.\n");
					int duracao = armazena.nextInt();
					armazena.nextLine();
					musica.setDuracao(duracao);
					playlist.editarMusica(musica);
					arquivo.salvarPlaylist(playlist);
					editarMusica();
				} else if (guarda == 5) {
					System.out
							.println("Informe o caminho onde a música se encontra.\nExemplo: C:\\Users\\g_hen\\Music");
					System.out.println("Digite a localização.\n");
					String localizacao = armazena.next();
					armazena.nextLine();
					musica.setLocalizacao(localizacao);
					playlist.editarMusica(musica);
					arquivo.salvarPlaylist(playlist);
					editarMusica();
				} else if (guarda == 0) {
					inicializarMenu();
					armazena.close();
				}
			}
		} else {
			System.out.println("Playlist vazia.\n");
			inicializarMenu();
		}

	}
}