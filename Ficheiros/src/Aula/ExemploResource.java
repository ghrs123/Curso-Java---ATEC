package Aula;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExemploResource {

	public static void main(String[] args) {

		// try with resources

		String nomeFich = "src/Ficheiros/Atec.txt";

		try (Scanner file = new Scanner(new File(nomeFich))) {

			while (file.hasNext())

			{

				System.out.println(file.nextLine());

			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		}

		String ficheiro = "C:\\Users\\g_hen\\OneDrive\\Documentos\\FicheiroJava\\Atec.txt";

		try (PrintWriter fileW = new PrintWriter(new File(ficheiro));) {

			fileW.println("Isto é um teste.\nIsto é uma segunda linha.");

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		}

	}

}
