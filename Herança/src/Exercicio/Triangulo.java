package Exercicio;

public class Triangulo extends Forma {

	private double largura;
	private double altura;

	public Triangulo(int numeroDeLados, String cor, double altura, double largura) {
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
		return "Triangulo \n[largura=" + largura + ",\t altura=" + altura + "]";
	}

	public double getArea() {

		return altura * largura / 2;
	}

	public double getPerimetro() {

		return altura + altura + altura;
	}

}
