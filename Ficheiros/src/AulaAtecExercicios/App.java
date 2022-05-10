package AulaAtecExercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class App {
	
	
	private Turma turma= new Turma(22);
	
	public static void main(String[] args) {
		
		char resposta;
		App app = new App();

		app.leFicheiro("alunosAtec.txt");

		do {

			
			Scanner input = new Scanner(System.in);
			
			System.out.println("Pretende adiconar um novo aluno?");
			resposta = input.next().charAt(0);
			
			input.getClass();
		} while (resposta == 'S'|| resposta == 's');
		
	}
	
	private static void pedeDadosAlunos(int numero, String nome, String telefone, String dataNascimento) {
		 
		
	}
	public void leFicheiro(String pathFile) {

	

		// "C:\\Users\\g_hen\\OneDrive\\Documentos\\FicheiroJava\\alunosAtec.txt"

		try (Scanner leitura = new Scanner(new File(pathFile))) {

			while (leitura.hasNextLine()) {

				String linha = leitura.nextLine();
				String[] atributos = linha.split(";");

				turma.adiconaAluno(new Aluno(Integer.parseInt(atributos[0]), atributos[1], atributos[2], atributos[3]));

			}

		} catch (FileNotFoundException e) {
			System.out.println("Ocorreu um erro!");
			e.printStackTrace();

		}

	}

	public void escreveFicheiro(String pathFile) {

		Aluno[] turmaLocal = turma.getAluno();

		try (PrintWriter escreve = new PrintWriter(new File(pathFile))) {

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		
		for (int i = 1; i <= turmaLocal.length; i++) {

		}

	}

}
