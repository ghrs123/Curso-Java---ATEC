public class Baralho {

	private Carta[] baralho = new Carta[40];

	public Baralho() {

		int indiceCarta = 0;
		Naipe[] naipes = Naipe.values();
		Ordem[] ordens = Ordem.values();

		for (int n = 0; n < naipes.length; n++) {
			for (int o = 0; o < ordens.length; o++) {
				baralho[indiceCarta] = new Carta(naipes[n], ordens[o]);
				indiceCarta++;
			}
		}
	}

	public String toString() {
		String text;

		text = "Baralho: \n\n";
		for (int i = 0; i < baralho.length; i++) {
			text += baralho[i].toString() + "\n";
		}
		return text;
		}
	
}

/*
 * public Baralho() {
 * 
 * Naipe[] naipes=Naipe.values(); Ordem[] ordens=Ordem.values(); int
 * indiceCarta=0;
 * 
 * for(Naipe s:naipes) { for(Ordem e:ordens) { baralho[indiceCarta] = new
 * Carta(s,e); indiceCarta++; } } }
 */
