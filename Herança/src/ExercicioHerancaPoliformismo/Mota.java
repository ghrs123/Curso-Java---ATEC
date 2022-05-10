package ExercicioHerancaPoliformismo;

public class Mota extends Transporte {

	private String tipo;
	private String modelo;

	public Mota(String marca, int numLugares, String cor, int kmPercorridos, String tipo, String modelo) {
		super(marca, numLugares, cor, kmPercorridos);
		this.tipo = tipo;
		this.modelo = modelo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	

	public String toString() {
		return "Mota [tipo=" + tipo + ", modelo=" + modelo + "]";
	}


	@Override
	public void andar() {
		
		kmPercorridos+= 1;
	}

}
