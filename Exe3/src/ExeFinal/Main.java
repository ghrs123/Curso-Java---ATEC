package ExeFinal;

public class Main {

	public static void main(String[] args) {
		//try é usado para um programa que pode dar erro
		try {
	
		//array maximo de 3, vai dar erro pois tem 4 objetos
		
	       // int n = 2/0;      

	        Turma tpsi0620 = new Turma();


	        tpsi0620.adicionaAluno("Mariana");

	        tpsi0620.adicionaAluno("Anderson");

	        tpsi0620.adicionaAluno("João Guerreinho");

	        tpsi0620.adicionaAluno("Duarte");


	        System.out.println("Cheguei aqui");

	       } 

	       catch (ArithmeticException e) {


	              System.out.println("Aconteceu um erro numa operação aritmética");



	               //System.out.println("Aconteu um erro inesperado. Por favor contacte o administrador de sistema");

	           }   

	       catch (IndexOutOfBoundsException e) {


	              System.out.println("Erro, excedeu o limite do array");


	           }   

	       catch (IllegalArgumentException e) {


	              System.out.println(e.getMessage());


	           }

	       catch (Exception e) {

	           System.out.println("Aconteu um erro inesperado. Por favor contacte o administrador de sistema");

	       }

	}

}
