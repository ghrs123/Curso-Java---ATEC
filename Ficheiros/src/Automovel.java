
public class Automovel {

	private String matricula;
	private String marca;
	private int km;

	public Automovel(String matricula, String marca, int km) {
		
		this.matricula = matricula;
		this.marca = marca;
		this.km = km;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}


	public String toString() {
		return "Automovel [matricula=" + matricula + ", marca=" + marca + ", km=" + km + "]";
	}

}
