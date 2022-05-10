package Aula;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {


		 //try with resourcesF


		 String nomeFich = "C:\\Users\\g_hen\\OneDrive\\Documentos\\FicheiroJava\\Atec.txt";

			try (Scanner file = new Scanner(new File(nomeFich))) {


		 while(file.hasNext())

		 {

		 System.out.println(file.nextLine());

		 }

		 } catch (FileNotFoundException e) {


		 e.printStackTrace();

		 }


		 }



		}