package Aula;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// try with resources

		String nomeFich = "C:\\Users\\g_hen\\OneDrive\\Documentos\\FicheiroJava\\Atec.txt";

		Scanner file = null;

		try {

			file = new Scanner(new File(nomeFich));

			while (file.hasNext())

			{

				System.out.println(file.nextLine());

			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		}

		finally {

			file.close();

		}

	}

}
