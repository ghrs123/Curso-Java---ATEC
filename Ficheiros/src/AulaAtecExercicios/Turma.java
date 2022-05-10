package AulaAtecExercicios;

import java.util.Arrays;

public class Turma {
	
	private Aluno[] aluno;
	private int numTotalAlunos = 0;

	public Turma(int capacidadeTurma) {
		aluno = new Aluno[capacidadeTurma];

	}

	public Aluno[] getAluno() {
		return aluno;
	}

	public void setAluno(Aluno[] aluno) {
		this.aluno = aluno;
	}

	public void adiconaAluno(Aluno novoAluno) {
		aluno[numTotalAlunos] = novoAluno;
		numTotalAlunos++;
	}

	public void eliminaAluno(int numeroAluno) {
		for (int i = 0; i < numTotalAlunos; i++) {
			if (aluno[i].getNumero() == numeroAluno)
				aluno[i].equals(null);
			numTotalAlunos--;
		}

	}

	public String toString() {
		return "Aluno =" + Arrays.toString(aluno);
	}

}
