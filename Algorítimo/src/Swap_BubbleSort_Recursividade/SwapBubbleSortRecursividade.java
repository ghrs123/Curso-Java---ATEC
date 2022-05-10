package Swap_BubbleSort_Recursividade;

public class SwapBubbleSortRecursividade {

	private static void swap(int[] a,int ind1,int ind2) {
		
		int aux = a[ind1];
		a[ind1] = a[ind2];
		a[ind2] = aux;

	}
	
	private static void bubble(int[] a){
		for(int i = 0; i < a.length; i ++)
		for(int j = 0; j < a.length-i-1; j++)
		if (a[j] > a[j+1]) swap(a,j,j+1);
	}
	
	private static int fat(int b,int e) {
		if(e == 0) {
			return 1;
		}else {
		return b * fat(b,e-1);
		}
	}
	
	
	public static void main(String[] args) {
		
		int[] array = {8,7,1,2,4,3,6,5};
		bubble(array);
		for(int i:array) {
			System.out.print(i+" ");
			
		}
		System.out.println("\n");
		System.out.println(fat(2,3));
	}
	
}
