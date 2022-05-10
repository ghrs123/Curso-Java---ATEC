package ExercicioHerancaPoliformismo;

public class Aviao extends Transporte {
	private int numMotores;
	private int horasVoo;
	private int numPoroes;

	public Aviao(String marca, int numLugares, String cor, int kmPercorridos, int numMotores, int horasVoo,
			int numPoroes) {
		super(marca, numLugares, cor, kmPercorridos);
		this.numMotores = numMotores;
		this.horasVoo = horasVoo;
		this.numPoroes = numPoroes;
	}

	public int getNumMotores() {
		return numMotores;
	}

	public void setNumMotores(int numMotores) {
		this.numMotores = numMotores;
	}

	public int getHorasVoo() {
		return horasVoo;
	}

	public void setHorasVoo(int horasVoo) {
		this.horasVoo = horasVoo;
	}

	public int getNumPoroes() {
		return numPoroes;
	}

	public void setNumPoroes(int numPoroes) {
		this.numPoroes = numPoroes;
	}

	public String toString() {
		return "Aviao [numMotores=" + numMotores + ", horasVoo=" + horasVoo + ", numPoroes=" + numPoroes + "]";
	}

	public void andar() {

		kmPercorridos+= 100;
	}

}
