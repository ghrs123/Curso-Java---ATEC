
public class PessoaFisica extends AbstractPessoa {

	private double altura;
	private double peso;
	private String cartaoCidadao;

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getCartaoCidadao() {
		return cartaoCidadao;
	}

	public void setCartaoCidadao(String cartaoCidadao) {
		this.cartaoCidadao = cartaoCidadao;
	}

	@Override
	public void criar() {
		System.out.println("Criar Pessoa Física.");

	}

	@Override
	public void atualizar() {
		System.out.println("Atualizar Pessoa Física.");
	}

	@Override
	public AbstractPessoa ver() {
		System.out.println("Ver Pessoa Física.");

		return null;
	}

	@Override
	public void deletar() {
		System.out.println("Deletar Pessoa Física.");
	}

}