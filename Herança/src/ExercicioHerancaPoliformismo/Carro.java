package ExercicioHerancaPoliformismo;

public class Carro extends Transporte {

	private int numPortas;
	private double cilindrada;
	private double cavalos;

	public Carro(String marca, int numLugares, String cor, int kmPercorridos, int numPortas, double cilindrada,
			double cavalo) {
		super(marca, numLugares, cor, kmPercorridos);
		this.numPortas = numPortas;
		this.cilindrada = cilindrada;
		this.cavalos = cavalo;
	}

	public int getNumPortas() {
		return numPortas;
	}

	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}

	public double getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(double cilindrada) {
		this.cilindrada = cilindrada;
	}

	public double getCavalo() {
		return cavalos;
	}

	public void setCavalo(double cavalo) {
		this.cavalos = cavalo;
	}

	public String toString() {
		return "Numero de Portas =" + numPortas + "\nCilindrada =" + cilindrada + "\nCavalo=" + cavalos;
	}

	public void andar() {
		kmPercorridos+= 5;
	}

}
