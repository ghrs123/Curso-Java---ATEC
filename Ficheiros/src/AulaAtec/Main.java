package AulaAtec;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) {
		String patName = "C:\\Users\\g_hen\\OneDrive\\Documentos\\FicheiroJava\\Atec.txt";
		File ficheiro = new File(patName);
		PrintWriter fich = null;
		
		String[] aluno= {"Gustavo","963258963","25-07-1990"};
		try {
			fich = new PrintWriter(ficheiro);
			fich.println(aluno[0]+";"+aluno[1]+";"+aluno[2]);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} finally {
			fich.close();
		}
	}
}
