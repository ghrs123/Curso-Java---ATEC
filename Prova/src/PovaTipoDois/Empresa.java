package PovaTipoDois;

import java.util.Arrays;

public class Empresa {

	private String nome;
	private Empregado nomeCEO;
	private double capitalSocial;
	private Empregado[] lista;
	private int numAtualEmpregados = 0;
	private int numTotalDeEmpresas = 0;

	public Empresa(String nome, Empregado nomeCEO, double capitalSocial) {
		this.nome = nome;
		this.nomeCEO = nomeCEO;
		this.capitalSocial = capitalSocial;
		this.lista = new Empregado[10];
		numTotalDeEmpresas++;
	}

	public Empresa(String nome, double capitalSocial) {
		this.nome = nome;
		this.capitalSocial = capitalSocial;
		this.lista = new Empregado[10];
		numTotalDeEmpresas++;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Empregado getNomeCEO() {
		return nomeCEO;
	}

	public void setNomeCEO(Empregado nomeCEO) {
		this.nomeCEO = nomeCEO;
	}

	public double getCapitalSocial() {
		return capitalSocial;
	}

	public void setCapitalSocial(double capitalSocial) {
		this.capitalSocial = capitalSocial;
	}

	public Empregado[] getLista() {
		return lista;
	}

	public void setLista(Empregado[] lista) {
		this.lista = lista;
	}

	public int getNumAtualEmpregados() {
		return numAtualEmpregados;
	}

	public void setNumAtualEmpregados(int numAtualEmpregados) {
		this.numAtualEmpregados = numAtualEmpregados;
	}

	public int getNumTotalDeEmpresas() {
		return numTotalDeEmpresas;
	}

	public void setNumTotalDeEmpresas(int numTotalDeEmpresas) {
		this.numTotalDeEmpresas = numTotalDeEmpresas;
	}

	public String toString() {
		return "Nome da Empresa=" + nome + "Nome do CEO=" + nomeCEO + "Capital Social=" + capitalSocial
				+ "Lista de empregados=" + Arrays.toString(lista) + "Numero Atual de Empregados=" + numAtualEmpregados;
	}

	public void contrataEmpregado(Empregado emp) {
		if (numAtualEmpregados < lista.length) {
			lista[numAtualEmpregados++] = emp;
		}

	}

	public int aumentaNumeroFilhos(String numEmpregado, int numFilhos) {
		int guarda = 0;
		for (int i = 0; i < numAtualEmpregados; i++) {
			if (lista[i].getNumEmpregado() == numEmpregado) {
				guarda = numFilhos + lista[i].getNumFilhos();
				return guarda;
			}

		}
		return 0;
	}

	public int obtemNumTotalEmpresas() {

		return numTotalDeEmpresas;
	}

	public boolean atualizaNumeroDeEmpregado(Empregado emp, String novoNumEmp) {
		int i;
		for (i = 0; i < numAtualEmpregados; i++) {

			if (lista[i].getNumEmpregado() == novoNumEmp) {
				return false;
			}
		}
		emp.setNumEmpregado(novoNumEmp);
		return true;
	}

	public String listaEmpregados() {
		double soma = 0;
		String texto = "";
		System.out.println();
		for (Empregado e : lista) {
			if (e == null) {

				break;
			}
			texto += e.getNumEmpregado() +"\t"+ e.getNome() +"\t"+ e.getNumFilhos() +"\t"+ e.getSalario();
			soma += e.getSalario();

		}
		texto +="Soma Salários: "+ soma;

		return "Número\t\tNome\t\tNº de Filhos\t\tSalário\n" + texto;

	}

}
