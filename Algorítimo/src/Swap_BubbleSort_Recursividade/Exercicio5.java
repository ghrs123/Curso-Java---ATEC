package Swap_BubbleSort_Recursividade;
import java.io.InputStream;
import java.util.Scanner;

public class Exercicio5 {
	//5. Crie uma função recursiva para calcular a seguinte formula matemática:
	// f(n) = (n+1)+(n+2)+(n+3)+...+(n+n)
	
	public static int somaFunc(int n, int x){
		
		if(x == n) {
			return n+x;
		}
		
		return n+x + somaFunc(n,x+1);
		
	}
	
	public static void main(String[] args) {
		Scanner guarda= new Scanner(System.in); 
		
		System.out.println("Introduza um número.");
		int var = guarda.nextInt();
	
		while (var != 5) {

			
			if (var == 5) {
				System.out.println(somaFunc(5,1)); 
			 }
				 System.out.println("Introduza outro numero.");
				 var = guarda.nextInt();
			 
			}
		
		
		System.out.println(somaFunc(5,1)); 
	}
}
