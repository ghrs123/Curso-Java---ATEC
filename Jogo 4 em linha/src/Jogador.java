import Enumerados.Peca;

public class Jogador {

	private int id;
	private String nome;
	private Peca peca;

	public Jogador(int id, String nome,Peca peca) {
		this.id = id;
		this.nome = nome;
		this.peca = peca;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Peca getPeca() {
		return peca;
	}
	
	public void setPeca(Peca peca) {
		this.peca = peca;
	}

	public String toString() {
		return "Id" + id + "\n Nome do Jogador:" + nome + "\n Cor a peça =" + peca;
	}

}
