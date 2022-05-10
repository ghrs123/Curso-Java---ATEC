
public class LinkedList {

	private Node head;

	public LinkedList() {
		this.head = null;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public void add(StudentRecord sr) {

		if (head == null || head.getData().getSsn() > sr.getSsn()) {
			Node temp = new Node(sr);
			temp.setNext(head);
			setHead(temp);
		} else {
			add(head, sr);
		}

	}

	public void add(Node head, StudentRecord sr) {
		if (head.getNext() == null || head.getNext().getData().getSsn() > sr.getSsn()) {
			Node temp = new Node(sr);
			temp.setNext(head.getNext());
			head.setNext(temp);
		} else {

			add(head.getNext(), sr);
		}
	}

	public StudentRecord find(int targSsn) {
		return find(head, targSsn);

	}

	private StudentRecord find(Node cur, int targSsn) {
		if (cur == null) {
			return null;
		} else {
			if (cur.getData().getSsn() == targSsn)
				return cur.getData();
			else
				return find(cur.getNext(), targSsn);
		}

	}

	public void deleteFirst(int targSsn) {
		if (head != null) {
			if (head.getData().getSsn() == targSsn) {
				setHead(head.getNext());
			} else {
				deleteFirst(head, targSsn);
			}
		}
	}

	private void deleteFirst(Node cur, int targSsn) {
		if (cur.getNext().getData().getSsn() == targSsn) {
			cur.setNext(cur.getNext().getNext());
		} else {
			deleteFirst(cur.getNext(), targSsn);
		}

	}

	public void traverse() {
		traverse(head);
	}

	private String traverse(Node cur) {
		StringBuilder sb = new StringBuilder();
		if (cur != null) {
			sb.append(cur.toString());
			sb.append(traverse(cur.getNext()));
		}
		return sb.toString();
	}

	
}
