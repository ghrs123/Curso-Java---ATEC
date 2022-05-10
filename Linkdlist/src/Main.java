
public class Main {

	public static void main(String[] args) {
		
		StudentRecord sr = new StudentRecord("Bob",3.5,123456789);
		Node n1 = new Node (null);
		System.out.println(n1);
		n1.setData(sr);
		System.out.println(n1);
		sr = new StudentRecord("Mary",3.7,987654321);
		Node n2 = new Node(sr);
		n1.setNext(n2);
		System.out.println("Bob "+n1);
		System.out.println("Mary "+n2);
		
	}

}
