package Aula;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main3 {

	public static void main(String[] args) {
		String ficheiro = "C:\\Users\\g_hen\\OneDrive\\Documentos\\FicheiroJava\\Atec.txt";

		 PrintWriter fileW = null;

		 try {

		 fileW = new PrintWriter(new File(ficheiro));

		 fileW.println("Isto � um teste.\nIsto � uma segunda linha.");

		 } catch (FileNotFoundException e) {


		 e.printStackTrace();

		 }

		 finally {

		 fileW.close();

		 	}

	}

}
