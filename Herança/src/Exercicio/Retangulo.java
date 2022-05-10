package Exercicio;

public class Retangulo extends Forma {
	private double largura;
	private double altura;

	public Retangulo(int numeroDeLados, String cor, double altura, double largura) {
		super(numeroDeLados, cor);
		this.largura = largura;
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String toString() {
		return "Retangulo \n[largura=" + largura + ", \taltura=" + altura + "]";
	}

	public double getArea() {

		return altura * largura;
	}

	public double getPerimetro() {

		return 2 * (altura + largura);
	}

}
