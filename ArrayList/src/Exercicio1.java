import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<>();
		List<String> nomes = new ArrayList<>();
		Scanner recebe = new Scanner(System.in);
		int maior = 1;

		for (int i = 0; i < 5; i++) {
			System.out.println("Por favor, digite os nomes a serem armazenado.");
			String guarda = recebe.nextLine();
			nomes.add(guarda);

		}
		/*for (int i = nomes.size() - 1; i >= 0; i--) {
			System.out.println(nomes.get(i));
		}*/

		for (int i = 0; i <= nomes.size() - 1; i++) {
			System.out.println(i + 1 + "." + nomes.get(i));
		}
		System.out.println("Digite o numero associado ao Nome que deseja excluir.\n");
		int opcao = recebe.nextInt();
		recebe.nextLine();

		nomes.remove(opcao - 1);
		for (int i = 0; i <= nomes.size() - 1; i++) {
			System.out.println(nomes.get(i));
		}
	
		
		  for (int i = 0; i < 5; i++) {
		  System.out.println("Digite um numero inteiro.\n"); 
		  int num =  recebe.nextInt(); 
		  numeros.add(i, num); 
		  }
		  for (int i = 0; i < 5; i++) {
			  if(i==0)
				  maior = numeros.get(i);
			  else if (numeros.get(i) > maior) 
				  maior = numeros.get(i);
		  }
		  
		   System.out.println("Maior Número é:"+maior);
		 
	}
}
