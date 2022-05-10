package ExercicioContactos;

public class No {
		private Contacto contato;
		private No next;
		
		public No(Contacto contato) {
			this.next = null;
			this.contato = contato;
		}

		public Contacto getContato() {
			return contato;
		}

		public void setContato(Contacto contato) {
			this.contato = contato;
		}


		public No getNext() {
			return next;
		}
		
		public void setNext(No next) {
			this.next = next;
		}

		
		public String toString() {
			if(contato == null) {
				return "No: null";
			}
			return "No: " + contato.toString();
		}
		
		
		
}
