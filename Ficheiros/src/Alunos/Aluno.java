package Alunos;

public class Aluno {
	private int id;
	private String nome;
	private String telefone;
	private String data_nasc;

	public Aluno(int id, String nome, String telefone, String dataNasc) {
		super();
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.data_nasc = dataNasc;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getData_nasc() {
		return data_nasc;
	}

	public void setData_nasc(String data_nasc) {
		this.data_nasc = data_nasc;
	}

	public String toString() {
		return "Id do Aluno =" + id + "\nNome=" + nome + "\nTelefone=" + telefone + "\nData de Nascimento ="
				+ data_nasc;
	}
	
}
