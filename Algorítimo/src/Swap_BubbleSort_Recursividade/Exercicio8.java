package Swap_BubbleSort_Recursividade;

public class Exercicio8 {

	  private static void funcaoA(int n)
	   {
	        if ( n!= 0)
	        {
	        funcaoA(n-1);
	       System.out.printf("%d\n",n);
	       funcaoA(n-1);

	       }
	    }

	
	public static void main(String[] args) {
		  funcaoA(3);
	}

}
