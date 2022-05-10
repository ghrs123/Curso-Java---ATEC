
public class Gato extends Animal implements IAnimal {
	private double tamanhoBigode;

	public Gato(String nome, double peso, double tamanhoBigode) {
		super(nome, peso);
		this.tamanhoBigode = tamanhoBigode;
	}

	public double getTamanhoBigode() {
		return tamanhoBigode;
	}

	public void setTamanhoBigode(double tamanhoBigode) {
		this.tamanhoBigode = tamanhoBigode;
	}

	public String toString() {
		return "Gato [Tamanho do Bigode=" + tamanhoBigode + ", getNome()=" + getNome() + ", getPeso()=" + getPeso()
				+ "]";
	}

	public String falar() {

		return "Miau";
	}

	public String speak() {

		return "Miau";
	}

	public String eat() {

		return "Lasanha";
	}

}
