import java.util.Arrays;

public class Armazem {
	private Produto[] produtos;
	private int qtdProdutoArmazem = 0;
	private String nome;

	public Armazem(String nome,int tamanhoEstoque) {
		this.produtos = new Produto[tamanhoEstoque] ;
		this.nome = nome;
	}

	public void movimentoEntrada(String nome, int qtd) {
		boolean existe=false;
		for (int i = 0; i < qtdProdutoArmazem; i++) {
			Produto produto = produtos[i];
			if (produto.getNome().equalsIgnoreCase(nome)) {
				produto.repor(qtd);
				existe = true;

			}
		}
		
//		if (existe == true) {	
			if (!existe) {
		
			produtos[qtdProdutoArmazem] = new Produto(nome, qtd, 0);
			qtdProdutoArmazem++;
		}
	}

	public void movimentoSaida(String nome, int qtd) {
	
		for (int i = 0; i <qtdProdutoArmazem; i++) {
			Produto produto = produtos[i];
			if (produto.getNome().equalsIgnoreCase(nome)) {
				produto.setQtdAtual(produto.getQtdAtual() - qtd);

			}
		}

	}

	public String toString() {
		String resultado="";
		for (int i = 0; i <getQtdProdutoArmazem(); i++) {
			Produto produto = produtos[i];
			resultado += produto.toString();
		}
		resultado += "\nQuantidade de Produto no armazem " + this.getQtdProdutoArmazem();
		return resultado;

	}

	public Produto[] getProdutos() {
		return produtos;
	}

	public void setProdutos(Produto[] produtos) {
		this.produtos = produtos;
	}

	public int getQtdProdutoArmazem() {
		return qtdProdutoArmazem;
	}

	public void setQtdProdutoArmazem(int qtdProdutoArmazem) {
		this.qtdProdutoArmazem = qtdProdutoArmazem;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	/*
	 * tring nome1 = "Carolina";
	 * 
	 * String nome2 = "CAROLINA";
	 * 
	 * 
	 * if (nome1.equals(nome2)) {
	 * 
	 * System.out.println("Nomes iguais");
	 * 
	 * }
	 * 
	 * else {
	 * 
	 * System.out.println("Nomes diferentes");
	 * 
	 * }
	 */
}