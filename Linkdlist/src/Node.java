
public class Node {
	private StudentRecord data;
	Node next;

	public Node(StudentRecord data) {
		this.data = data;
		this.next = null;
	}

	public StudentRecord getData() {
		return data;
	}

	public void setData(StudentRecord data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public String toString() {
		if (data == null)
			return "Node: null";
		else
			return "Node: " + data;
	}

}
