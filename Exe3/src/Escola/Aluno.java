package Escola;

public class Aluno {
	private String nome;
	private String cartaoCidadao;
	
	public Aluno(String nome, String cartaoCidadao){
		
		this.nome = nome;
		this.cartaoCidadao = cartaoCidadao;
		
		
	}
	
	public String getNome() {
		
		return nome;
	}
	
	public String getCartaoCidadao() {
		
		return cartaoCidadao;
	}
	
	public void setNome() {
		
		this.nome = nome;
	}
	
	public void setCartaoCidadao() {
		
		this.cartaoCidadao = cartaoCidadao;
	}
	
	public String toString() {
		
		return "Nome do Aluno:" + nome +"\nNumero do Cartao Cidadao:" + cartaoCidadao;	
				
	}
	
}