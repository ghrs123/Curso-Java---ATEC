import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		File f = new File("C:\\Users\\g_hen\\OneDrive\\Documentos\\FicheiroJava\\StandAutomovel.txt");
		Scanner file = null;
		try {

			Automovel[] stand = new Automovel[10];
			int index = 0;

			 file = new Scanner(f);

			while (file.hasNext()) {

				String linha = file.nextLine();
				System.out.println(linha);
				String[] atributos = linha.split(";");//Split esta separando os atributos por ;
				//atribuindo um automovel em stand na posição index
				stand[index++] = new Automovel(atributos[0], atributos[1], Integer.parseInt(atributos[2]));

				/*
				 * for(String a :atributos) { System.out.println(a); }
				 */
			}
			
			
			
			for (Automovel a : stand) {
				System.out.println(a);
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		
		//fehcar o ficheiro pelo try catch
		finally {
			file.close();
		}
	}

}
