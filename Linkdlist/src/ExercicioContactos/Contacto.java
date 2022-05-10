package ExercicioContactos;

public class Contacto {

	private String nome;
	private String numTel;
	
	public Contacto(String nome, String numTel) {
		
		this.nome = nome;
		this.numTel = numTel;
	}

	public String getNome() {
		return nome;
	}

	
	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public String getNumTel() {
		return numTel;
	}

	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}


	public String toString() {
		return "\nNome:" + nome + "\nNumero do Telefone:" + numTel;
	}
	
	
		
}
