
public class PessoaJuridica extends AbstractPessoa {

	private String cnpj;

//	public PessoaJuridica() {}

	public String getCnpj() {
		return cnpj;
	}

	public PessoaJuridica() {
		this(null, null, null);
	}

	public PessoaJuridica(String nome, String telefone, String cnpj) {
		super(nome, telefone);
//		super.setNome(nome);
//		super.setTelefone(telefone);

		this.cnpj = cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public void criar() {
		System.out.println("Criar Pessoa Juridica.");
	}

	@Override
	public void atualizar() {
		System.out.println("Atualizar Pessoa Jur�dica.");
	}

	@Override
	public AbstractPessoa ver() {
		System.out.println("Ver Pessoa Jur�dica.");
		return null;
	}

	@Override
	public void deletar() {
		System.out.println("Deletar Pessoa Jur�dica.");
	}

}