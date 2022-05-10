package Alunos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainAlunos {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\g_hen\\OneDrive\\Documentos\\FicheiroJava\\alunosAtec.txt");
		Scanner input = null;
		// declarar o scanner , importa automaticamente o try, catch
		try {
			input = new Scanner(file);
			
			Aluno[] turma = new Aluno[10];
			int conta = 0;
			
			while (input.hasNext()) {

				String linha = input.nextLine();
				System.out.println(linha);
				String[] atributos = linha.split(",");
				// atribuindo um automovel em stand na posição index
				turma[conta++] = new Aluno(Integer.parseInt(atributos[0]),atributos[1], atributos[2],atributos[3]);

				
			}
			
			
			
			for (Aluno a : turma) {
				System.out.println(a);
			}
	
			
			
			
			
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		finally {
			input.close();
		}

	}
}
