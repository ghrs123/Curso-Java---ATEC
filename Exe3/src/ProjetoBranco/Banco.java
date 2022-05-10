package ProjetoBranco;

import java.util.Arrays;

public class Banco {
	//private ContaBancaria[] contas = new ContaBancaria[200;]
	private ContaBancaria[] contas;
	private int nTotalContas = 0;

	public Banco(int capacidade) {
		contas = new ContaBancaria[capacidade];
	}

	public void criaConta(String nome, String nConta) {

		boolean contaExiste = verificarContaExistente(nConta);
		if (!contaExiste) {
			ContaBancaria conta = new ContaBancaria(nome, nConta);
			contas[nTotalContas] = conta;
			nTotalContas++;

		}

	}

	private boolean verificarContaExistente(String nConta) {

		for (int i = 0; i < nTotalContas; i++) {

			ContaBancaria conta = contas[i];
			if (conta.getNumeroConta().equalsIgnoreCase(nConta)) {
				System.out.println("Conta ja exite " + nConta);
				return true;
			}

		}

		return false;

	}

	
	public void depositaQuantia(String nConta, double valor) {

		
		for (int i = 0; i < nTotalContas; i++) {

			ContaBancaria conta = contas[i];
			if (conta.getNumeroConta().equalsIgnoreCase(nConta)) {
				conta.depositaQuantia(valor);
				
			}

		}
	}

	public void levantaQuantia(String nConta, double valor) {

		for (int i = 0; i < nTotalContas; i++) {

			ContaBancaria conta = contas[i];
			if (conta.getNumeroConta().equalsIgnoreCase(nConta)) {
				conta.levantaQuantia(valor);
				
			}

		}
	}

	public void transfereQuantia(String contaOrigem, String contaDestino, double qta)

    {   


            boolean existeCtaOrigem = false;

            boolean existeCtaDestino = false;


            ContaBancaria contaBancariaOrigem= null;

            ContaBancaria contaBancariaDestino = null;



            for(int i=0 ; i< nTotalContas; i++) {

                if(contaOrigem.equalsIgnoreCase(contas[i].getNumeroConta()) )

                 { existeCtaOrigem = true;

                   contaBancariaOrigem = contas[i];

                 }


                if(contaDestino.equalsIgnoreCase(contas[i].getNumeroConta()) )

                { existeCtaDestino = true;

                  contaBancariaDestino = contas[i];

                }

            }


            if (existeCtaOrigem==true && existeCtaDestino == true && contaBancariaOrigem.getSaldo() >= qta){

                contaBancariaDestino.depositaQuantia(qta);

                contaBancariaOrigem.levantaQuantia(qta);

            }


    }

//	public String toString() {
//		return "Banco [conta =" + Arrays.toString(contas) + "]";
//	}
	public String toString() {
		
        String text;

        text="Nome do Banco: " + this.contas + "\nNumero de Contas: " + this.nTotalContas + "\n";

        for(int i=0; i < nTotalContas; i++) {

            text += contas[i].toString() + "\n";

        }

        return text;

    }

 }


