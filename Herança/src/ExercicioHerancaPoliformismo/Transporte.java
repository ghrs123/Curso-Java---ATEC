package ExercicioHerancaPoliformismo;

public abstract class Transporte {

	private String marca;
	private int numLugares;
	private String cor;
	protected int kmPercorridos;

	public Transporte(String marca, int numLugares, String cor, int kmPercorridos) {
		this.marca = marca;
		this.numLugares = numLugares;
		this.cor = cor;
		this.kmPercorridos = kmPercorridos;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getNumLugares() {
		return numLugares;
	}

	public void setNumLugares(int numLugares) {
		this.numLugares = numLugares;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getKmPercorridos() {
		return kmPercorridos;
	}

	public void setKmPercorridos(int kmPercorridos) {
		this.kmPercorridos = kmPercorridos;
	}

	public String toString() {
		return "[Transporte] \nMarca=" + marca + ", \nN�mero de Lugares=" + numLugares + ", \nCor=" + cor
				+ ", \nKilometros Percorridos=" + kmPercorridos;
	}
	
	public abstract void andar();
	
	
}
