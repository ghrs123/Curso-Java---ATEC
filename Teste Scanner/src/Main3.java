import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
	//Programas que pedem dados ao utilizador e ler 
		
		int x;
		
	    // System.in corresponde ao teclado    
		//criar variavel local Scanner
	       Scanner input = new Scanner(System.in);

	       System.out.println("Introduza um numero");

	        x = input.nextInt();    


	        if (x%2==0){

	            System.out.println("É par");
	        }

	        else{

	            System.out.println("É impar");

	        }

	        input.close();
		
	}

}
