package Swap_BubbleSort_Recursividade;

public class exercicio6 {
	public static void funcAscendente(int n) {

		if (n == 0) {
			return;
		}else {
			funcAscendente(n - 1);
			System.out.println(n);
			return;
					
		}
		
				
			
	}

	public static void main(String[] args) {

		funcAscendente(5);
		
	}

}
