package ExercicioHerancaPoliformismo;

public class Main {

	public static void main(String[] args) {
		Transporte[] transporte = new Transporte[10];
		
		Carro carro= new Carro("Volvo",5,"Prata",10000,5,2.0,250);
		Carro carro1= new Carro("Porsh",2,"Preto",35000,3,4.0,300);
		Aviao aviao = new Aviao("Boing",500,"Branco",500000,4,5000,1);
		Mota mota = new Mota("Yamaha",2,"Azul",3000,"Sportbike","R1");
		
		for(Transporte t: transporte) {
			
		}
	}

}
