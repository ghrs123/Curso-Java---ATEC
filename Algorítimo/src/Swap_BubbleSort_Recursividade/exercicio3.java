package Swap_BubbleSort_Recursividade;

public class exercicio3 {

	// Crie uma função recursiva que implemente a seguinte formula matemática. .
	// Assuma que n é maior do que 1.

	public static double numMaior(double n) {
		
		if(n==1) {
			
			return 0;
		}else {
			return  1-(1/n) + numMaior(n-1);
		}
	}

	
	
	public static void main(String[] args) {
			
	System.out.println(numMaior(1));
		
	}

}
