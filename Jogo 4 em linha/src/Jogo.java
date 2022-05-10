import Enumerados.Estado;
import Enumerados.Peca;

public class Jogo {

	private Jogador jogador1;
	private Jogador jogador2;
	private Tabuleiro tabuleiro;
	private Estado estado;

	public Jogo(int numLinhas, int numColunas) {
		tabuleiro = new Tabuleiro(numLinhas, numColunas);
		estado = Estado.ADECORRER;
	}

	public Jogador getJogador1() {
		return jogador1;
	}

	public void setJogador1(Jogador jogador1) {
		this.jogador1 = jogador1;
	}

	public Jogador getJogador2() {
		return jogador2;
	}

	public void setJogador2(Jogador jogador2) {
		this.jogador2 = jogador2;
	}

	public Tabuleiro getTabuleiro() {
		return tabuleiro;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public String toString() {
		return "Jogo \n[Primeiro jogador =" + jogador1 + ", Segundo Jogador=" + jogador2 + ", Tabuleiro =" + tabuleiro
				+ ", Estado do Jogo=" + estado + "]";
	}

	public void atualizaEstadoJogo(Peca peca) {
		{

			estado = tabuleiro.atualizaEstadoJogo(peca);
		}

	}

	public boolean executaJogada(int idJogador, int nColuna) {

		Jogador jogador;

		if (idJogador == 1) {
			jogador = jogador1;
		} else {
			jogador = jogador2;
		}
		boolean var = tabuleiro.poePeca(jogador, nColuna);
		if (var == true) {
			atualizaEstadoJogo(jogador.getPeca());
		}

		return var;
	}
}
