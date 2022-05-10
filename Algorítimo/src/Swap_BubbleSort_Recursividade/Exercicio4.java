package Swap_BubbleSort_Recursividade;

public class Exercicio4 {
	
	public static int funcMat(int x,int y){
		
		if(y==0) {
			return 0;
		}
		return (x*y)-funcMat(x,(y-1));
		
	}
	
	
	public static void main(String[] args) {
		
		
		System.out.println(funcMat(5,4));
	}
	
}
