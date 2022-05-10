import Enumerados.Estado;
import Enumerados.Peca;

public class Tabuleiro {

	private int numLinhas;
	private int numColunas;
	private final int NUMEROEMLINHA = 4;
	private Peca[][] tabuleiro;

	public Tabuleiro(int numLinhas, int numColunas) {
		this.numLinhas = numLinhas;
		this.numColunas = numColunas;
		this.tabuleiro = new Peca[numLinhas][numColunas];
		inicializaTabuleiro();
	}

	public int getNumLinhas() {
		return numLinhas;
	}

	public void setNumLinhas(int numLinhas) {
		this.numLinhas = numLinhas;
	}

	public int getNumColunas() {
		return numColunas;
	}

	public void setNumColunas(int numColunas) {
		this.numColunas = numColunas;
	}

	public int getNUMEROEMLINHA() {
		return NUMEROEMLINHA;
	}

	/*
	public void setNUMEROEMLINHA(int nUMEROEMLINHA) {
		NUMEROEMLINHA = nUMEROEMLINHA;
	}
	*/

	public Peca[][] getTabuleiro() {
		return tabuleiro;
	}

	public void setTabuleiro(Peca[][] tabuleiro) {
		this.tabuleiro = tabuleiro;
	}

	public String toString() {
		return "\nNumero de linhas: " + numLinhas + "Numero de Colunas:" + numColunas;
	}

	private void inicializaTabuleiro() {

		for (int l = 0; l < numLinhas - 1; l++) {

			for (int c = 0; c < numColunas - 1; c++) {
				tabuleiro[l][c] = (Peca.VAZIO);
			}
		}

	}

	public boolean poePeca(Jogador jogador, int nCol) {

		for (int l = numLinhas - 1; l >= 0; l--) {
		

				if (tabuleiro[l][nCol].equals(Peca.VAZIO)) {
					tabuleiro[l][nCol] = jogador.getPeca();
					return true;
				}

		

		}
		return false;
	}

	private boolean emLinha(Peca peca) {
		int nPecasSeguidas = 0;
		for (int l = 0; l < tabuleiro.length; l++) {
			nPecasSeguidas = 1;
			for (int c = 0; c < tabuleiro[0].length - 1; c++) {
				if (peca == tabuleiro[l][c] && tabuleiro[l][c] == tabuleiro[l][c + 1])
					nPecasSeguidas++;
				else
					nPecasSeguidas = 1;
				if (nPecasSeguidas == NUMEROEMLINHA)
					return true;
			}
		}
		return false;
	}

	private boolean emColuna(Peca peca) {
		int nPecasSeguidas = 0;
		for (int c = 0; c < tabuleiro[0].length; c++) {
			nPecasSeguidas = 1;
			for (int l = 0; l < tabuleiro.length - 1; l++) {
				if (peca == tabuleiro[l][c] && tabuleiro[l][c] == tabuleiro[l + 1][c])
					nPecasSeguidas++;
				else
					nPecasSeguidas = 1;
				if (nPecasSeguidas == NUMEROEMLINHA)
					return true;
			}
		}
		return false;
	}

	private boolean emDiagonalDireita(Peca peca) {
		int nPecasSeguidas = 1;
		for (int l = 0; l < tabuleiro.length - 1; l++) {
			for (int c = 0; c < tabuleiro[0].length - 1; c++) {
				nPecasSeguidas = 1;
				for (int i = 0; (l + i) < tabuleiro.length - 1 && (c + i + 1) < tabuleiro[0].length; i++) {
					if (tabuleiro[l + i][c + i] != Peca.VAZIO
							&& tabuleiro[l + i][c + i] == tabuleiro[l + i + 1][c + i + 1])
						nPecasSeguidas++;
					else {
						nPecasSeguidas = 1;
					}
					if (nPecasSeguidas == NUMEROEMLINHA)
						return true;
				}
			}
		}
		return false;
	}

	private boolean emDiagonalEsquerda(Peca peca) {
		int nPecasSeguidas = 1;
		for (int l = 0; l < tabuleiro.length - 1; l++) {
			for (int c = tabuleiro[0].length - 1; c >= 0; c--) {
				nPecasSeguidas = 1;
				for (int i = 0; (l + i) < tabuleiro.length - 1 && (c - i - 1) >= 0; i++) {
					if (tabuleiro[l + i][c - i] != Peca.VAZIO
							&& (tabuleiro[l + i][c - i] == tabuleiro[l + i + 1][c - i - 1]))
						nPecasSeguidas++;

					else
						nPecasSeguidas = 1;
					if (nPecasSeguidas == NUMEROEMLINHA)
						return true;
				}
			}
		}
		return false;
	}

	private boolean existeVencedor(Peca peca) {

		if (emLinha(peca) == true)
			return true;

		else if (emColuna(peca) == true)
			return true;

		else if (emDiagonalDireita(peca) == true)
			return true;

		else if (emDiagonalEsquerda(peca) == true)
			return true;

		else
			return false;

	}

	private boolean existeEmpate(Peca peca) {
		int l = 0, c = 0;

		if (existeVencedor(peca) == true) {
			return false;
		} else {

			for (l = 0; l < tabuleiro.length - 1; l++) {
				for (c = 0; c < tabuleiro[0].length - 1; c++) {

					if (tabuleiro[l][c] == Peca.VAZIO) {

						return false;
					}
				}

			}
		}
		return true;

	}

	public Estado atualizaEstadoJogo(Peca peca) {

		if (existeVencedor(peca) == true) {

			return Estado.TEMINADO_COM_VENCEDOR;
		} else if (existeEmpate(peca) == true) {

			return Estado.TERMINADO_COM_EMPATE;
		} else
			return Estado.ADECORRER;
	}

}
