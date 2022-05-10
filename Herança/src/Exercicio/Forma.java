package Exercicio;

public abstract class Forma {
	private int numeroDeLados;
	private String cor;

	public Forma(int numeroDeLados, String cor) {

		this.numeroDeLados = numeroDeLados;
		this.cor = cor;
	}

	public int getNumeroDeLados() {
		return numeroDeLados;
	}

	public void setNumeroDeLados(int numeroDeLados) {
		this.numeroDeLados = numeroDeLados;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String toString() {
		return "Forma [Numero de lados =" + numeroDeLados + ", cor=" + cor + "]";
	}

	public abstract double getArea();

	public abstract double getPerimetro();

}
