public enum DiaSemana {

	SEGUNDA("Monday", "Lunes", 2), TERCA("Tuesday", "Martes", 3), QUARTA("Wednesday", "Miercoles", 4),

	QUINTA("Thrusday", "Jeuves", 5), SEXTA("Friday", "Viernes", 6), SABADO("Satarday", "Sabado", 7),
	DOMINGO("Sunday", "Domingo", 1);

	private String diaEmIngles;

	private String diaEmEspanhol;

	private int diaNumero;

	private DiaSemana(String diaEmIngles, String diaEmEspanhol, int diaNumero) {

		this.diaEmIngles = diaEmIngles;
		this.diaEmEspanhol = diaEmEspanhol;
		this.diaNumero = diaNumero;

	}

	public String getDiaEmIngles() {

		return diaEmIngles;

	}

	public String getDiaEmEspanhol() {

		return diaEmEspanhol;

	}

	public int getDiaNumero() {
		return diaNumero;
	}

}