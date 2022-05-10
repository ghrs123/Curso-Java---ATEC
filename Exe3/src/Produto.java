
public class Produto {

	private String nome;
	private int qtdAtual;
	private int stockQtdMinima;
	private int qtdMinima;

	public Produto() {

	}

	public Produto(String nome, int qtdAtual, int stockQtdMinima) {

		this.nome = nome;
		this.qtdAtual = qtdAtual;
		this.stockQtdMinima = stockQtdMinima;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQtdAtual() {
		return qtdAtual;
	}

	public void setQtdAtual(int qtdAtual) {
		this.qtdAtual = qtdAtual;
	}

	public int getStockQtdMinima() {
		return stockQtdMinima;
	}

	public void setStockQtdMinima(int stockQtdMinima) {
		this.stockQtdMinima = stockQtdMinima;
	}

	public int getQtdMinima() {
		return qtdMinima;
	}

	public void setQtdMinima(int qtdMinima) {
		this.stockQtdMinima = qtdMinima;
	}

	public void alteraNome(String nome) {

		this.nome = nome;

	}

	public void alteraQtdMinima(int qtdMinima) {

		this.qtdMinima = qtdMinima;
	}

	public void repor(int qtd) {
		this.qtdAtual += qtd;

	}

	public void darBaixa(int qtd) {
		if (this.qtdAtual - qtd < 0) {

		} else
			this.qtdAtual -= qtd;

	}

	public String toString() {
		return "\nNome do Produto:" + " " + this.getNome() + " \n\nQuantidade do Produto:" + " " + this.getQtdAtual()
				+ "\n\nQuantidade Minina de Produto:" + " " + this.getStockQtdMinima();

	}

	public boolean necessitaRepor() {
		//if (this.qtdActual<= stockQtdMinima) {return true;} else {return false;}
		// return getQtdAtual() <= getStockMinima();
		return qtdAtual <= stockQtdMinima;
		// return this.qtdAtual <=stockQtdMinima;
	}

}
