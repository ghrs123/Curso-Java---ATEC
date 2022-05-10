package ExercicioContactos;

public class Main {

	public static void main(String[] args) {
		Contacto contacto = new Contacto("Gustavo","36651122");
		
		No n1 = new No(null);
		System.out.println(n1);
		
		n1.setContato(contacto);
		System.out.println(n1);
		
		contacto = new Contacto("Maria","36561122");
		No n2 = new No(contacto);
		n1.setNext(n2);
		System.out.println(n1);
		System.out.println(n2);
		
	}

}
