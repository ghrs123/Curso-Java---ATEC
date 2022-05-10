
public class Ave extends Animal implements IAnimal {

	private double tamanhoBico;

	public Ave(String nome, double peso, double tamanhoBico) {
		super(nome, peso);
		this.tamanhoBico = tamanhoBico;
	}

	public double getTamanhoBico() {
		return tamanhoBico;
	}

	public void setTamanhoBico(double tamanhoBico) {
		this.tamanhoBico = tamanhoBico;
	}

	public String toString() {
		return "Ave [tamanhoBico=" + tamanhoBico + ", getNome()=" + getNome() + ", getPeso()=" + getPeso() + "]";
	}

	public String falar() {

		return "Grrrrr";
	}

	public String speak() {

		return "piu piu";
	}

	public String eat() {

		return "Comi sementes de Girassol";
	}

}
