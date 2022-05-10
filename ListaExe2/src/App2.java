
public class App2 {

	public static void main(String[] args) {

		PessoaJuridica pj1 = new PessoaJuridica();
		pj1.setCnpj("123456");
		pj1.setNome("Gustavo");
		pj1.setTelefone("918247451");

		AbstractPessoa pj2 = new PessoaJuridica("Gustavo", "918247451", "00154545054545/0001-1");
		
		PessoaFisica pf = new PessoaFisica();
		pf.setNome("Flavio");

		criar(pj1);
		criar(pj2);
		criar(pf);
		// dadoPessoal.setIngereComida("0.5");
	}

	public static void verCNPJ(PessoaJuridica pessoa) {
		pessoa.getCnpj();
	}

	public static void verCNPJ(AbstractPessoa pessoa) {

		if (pessoa instanceof PessoaJuridica) {
			System.out.println("CNPJ: " + ((PessoaJuridica) pessoa).getCnpj());

			String cnpj = ((PessoaJuridica) pessoa).getCnpj();
			System.out.println(String.format("CNPJ: s% ", cnpj));

		}
	}

	public static void criar(AbstractPessoa pessoa) {
		pessoa.criar();
	}

	public static void deletar(AbstractPessoa pessoa) {
		pessoa.deletar();
	}

	public static void atualizar(AbstractPessoa pessoa) {
		pessoa.atualizar();
	}

	public static void ver(AbstractPessoa pessoa) {
		pessoa.ver();
	}

}
