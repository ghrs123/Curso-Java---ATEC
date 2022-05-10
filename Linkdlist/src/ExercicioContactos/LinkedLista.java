package ExercicioContactos;

public class LinkedLista {

	private No head;

	public LinkedLista() {
		this.head = null;
	}

	public No getHead() {
		return head;
	}

	public void setHead(No head) {
		this.head = head;
	}

	public void add(Contacto contacto) {
		if (getHead() == null || getHead().getContato().getNome().compareToIgnoreCase(contacto.getNome()) > 0) {
			No temp = new No(contacto);
			temp.setNext(getHead());
			setHead(temp);
		} else {

			add(getHead(), contacto);
		}

	}

	public void add(No cur, Contacto contacto) {
		if (cur.getNext() == null || cur.getNext().getContato().getNome().compareToIgnoreCase(contacto.getNome()) > 0) {
			No temp = new No(contacto);
			temp.setNext(cur.getNext());
			cur.setNext(temp);
		} else {
			add(cur.getNext(), contacto);
		}

	}

	public Contacto encontrar(String nome) {

		return encontrar(getHead(), nome);
	}

	private Contacto encontrar(No cur, String nome) {
		if (cur == null)
			return null;

		else {
			if (cur.getContato().getNome().equalsIgnoreCase(nome)) {
				return cur.getContato();
			} else {
				return encontrar(cur.getNext(), nome);
			}

		}

	}

	public void deleteFirst(String nome) {
		if (getHead() != null) {
			if (getHead().getContato().getNome().equalsIgnoreCase(nome)) {
				setHead(getHead().getNext());
			} else {
				deleteFirst(getHead(), nome);
			}
		}

	}

	private void deleteFirst(No cur, String nome) {
		if (cur.getNext().getContato().getNome().equalsIgnoreCase(nome)) {
			cur.setNext(cur.getNext().getNext());
		} else {
			deleteFirst(cur.getNext(), nome);
		}
	}

	public String traverse() {
		return traverse(getHead());
	}

	private String traverse(No cur) {
		StringBuilder sb = new StringBuilder();
		if (cur != null) {
			sb.append(cur.toString());
			sb.append(traverse(cur.getNext()));
		}
		return sb.toString();
	}

	public String traverse(String s) {
		StringBuilder sb = new StringBuilder();
		sb = sb.append(s);
		sb = sb.append(traverse());
		return sb.toString();
	}

	public String traverseI() {
		StringBuilder sb = new StringBuilder();
		No cur = getHead();
		while (cur != null) {
			sb = sb.append(cur);
			cur = cur.getNext();
		}
		return sb.toString();
	}

	public String traverseI(String s) {
		StringBuilder sb = new StringBuilder();
		sb = sb.append(s);
		sb = sb.append(traverseI());
		return sb.toString();
	}
}
