package AulaAtecExercicios;

public class Aluno {

	private int numero;
	private String nome;
	private String telefone;
	private String dataNascim;

	public Aluno(int numero, String nome, String telefone, String dataNascim) {
		this.numero = numero;
		this.nome = nome;
		this.telefone = telefone;
		this.dataNascim = dataNascim;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getDataNascim() {
		return dataNascim;
	}

	public void setDataNascim(String dataNascim) {
		this.dataNascim = dataNascim;
	}


	public String toString() {
		return "Numero=" + numero + ", Nome=" + nome + ", Telefone=" + telefone + ", Data de Nascimento" + dataNascim;
	}
	
}
