package Swap_BubbleSort_Recursividade;

public class Exercicio7 {
	
	private static void funcDesc(int n) {
		
		if(n==0) {
			
			return;
		}else {
			
			System.out.println(n);
			funcDesc(n-1);
			return;
		}
	}

	public static void main(String[] args) {
		
		funcDesc(5);
		

	}

}
