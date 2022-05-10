
public class Main {

	public static void main(String[] args) {

		//Interface
		
		IAnimal ave = new Ave("Vitoria",7.00,7);
		
		IAnimal garfield = new Gato("Garfielf",10.00,8.00);
		
		IAnimal [] zoo = new IAnimal[2];
		
		for(IAnimal a: zoo)
		{
			System.out.println(a.speak());
			System.out.println(a.eat());
		}
		/*
		//Herança
		
		Animal gatinho = new Gato("Gato de Botas",4,10);
		
		Gato garfield = new Gato("Garfielf",10.00,8.00);
		
		Ave vitoria = new Ave ("Vitoria",7.00,7);
		
		System.out.println(garfield.falar());
		
		System.out.println(vitoria.falar());
		
		//Polimosfismo

		Animal[] zoo= new Animal[3];
		zoo[0]= gatinho;
		zoo [1]=garfield;
		zoo[2]= vitoria;
		
		for(Animal a: zoo) {
			System.out.println(a.falar());
		}
		*/		
	}

}
