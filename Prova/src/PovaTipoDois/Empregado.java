package PovaTipoDois;

public class Empregado {

	private String numEmpregado;
	private String nome;
	private Genero genero;
	private double salario;
	private String departamento;
	private int numFilhos;

	public Empregado(String numEmpregado, String nome, Genero genero, double salario, String departamento,
			int numFilhos) {
		this.numEmpregado = numEmpregado;
		this.nome = nome;
		this.genero = genero;
		this.salario = salario;
		this.departamento = departamento;
		this.numFilhos = numFilhos;
	}

	public String getNumEmpregado() {
		return numEmpregado;
	}

	public void setNumEmpregado(String numEmpregado) {
		this.numEmpregado = numEmpregado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public int getNumFilhos() {
		return numFilhos;
	}

	public void setNumFilhos(int numFilhos) {
		this.numFilhos = numFilhos;
	}

	public String toString() {
		return numEmpregado + "\t" + nome + "\t" + numFilhos + "\t" + salario;
	}

}
