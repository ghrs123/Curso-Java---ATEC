public class Carta {

	private Naipe naipe;
	private Ordem ordem;

	public Carta(Naipe naipe, Ordem ordem) {
		this.naipe = naipe;
		this.ordem = ordem;
	}

	public Naipe getNaipe() {
		return naipe;
	}

	public Ordem getOrdem() {
		return ordem;
	}

	public void setNaipe(Naipe naipe) {
		this.naipe = naipe;
	}

	public void setOrdem(Ordem ordem) {
		this.ordem = ordem;
	}

	public String toString() {
		return "Naipe: " + naipe + "\nOrdem: " + ordem + "\nPontos: " + ordem.getPontos() + "\n\n";
	}

}
