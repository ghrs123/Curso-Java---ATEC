package Quicksort;

public class QucikSorte {
	private static void imprimeArray(int[] array) {
		for (int e : array) {
			System.out.print(e + " ");
		}
	}

	private static void swap(int[] array, int indexA, int indexB) {
		int aux = array[indexA];
		array[indexA] = array[indexB];
		array[indexB] = aux;
	}

	private static void quickSort(int[] array, int esq, int dir) {
		
		if(esq == dir) return;
		
		int pivot = array[dir];
		int indexPivot=dir;
		int setEsq = esq, setDi = dir - 1;
		
		
		while (setEsq < setDi) {
			while (array[setEsq] < pivot && setEsq < setDi) setEsq++;
			while (array[setDi] > pivot && setEsq < setDi) setDi--;
			swap(array,setEsq,setDi);
		}
		//Quando as setas se encontram, comparar com o pivot, pode utilizar qualquer uma das setas apra comparar pois estão no mesmo sitio
		if(array[setEsq] > pivot) {
			swap(array,setEsq,indexPivot);
			indexPivot = setEsq;
		}
		//chamada para os elementos da esquerda e para os da direita
		quickSort(array,esq,indexPivot-1);
		quickSort(array,indexPivot+1,dir);
			
	}

	public static void main(String[] args) {
		int array[] = { 7, 1, 5, 6, 4, 2, 3, 8 };
		// int array[] = {1,2,3,4,5,6,7,8};
		// int array[] = {8,7,6,5,4,3,2,1};
		// int array[] = {1,3,5,7,2,4,6,8};
		// int array[] = {3,2,1,4,5,8,7,6};
		// int array[] = {6,5,1,3,2,7,8,4};
		quickSort(array,0,7);
		imprimeArray(array);
	}
}

