
public class Main {

	public static void main(String[] args) {
		
		Armazem armazem = new Armazem("Grill",10);
		armazem.movimentoEntrada("Carne Bovina", 10);
		armazem.movimentoEntrada("Frango", 20);
		armazem.movimentoEntrada("Peru",30);
		System.out.println(armazem);
		
		
		armazem.movimentoSaida("Carne Bovina", 3);
		
		System.out.println(armazem);

	}

}
