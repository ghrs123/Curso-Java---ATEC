package ProjetoBranco;

public class ContaBancaria {

	private String numeroConta;
	private String nomeTitular;
	private double saldo;

	public ContaBancaria(String nomeTitular, String numeroConta) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
	
	}

	public void levantaQuantia(double valor) {

		if (saldo >= valor) {
			saldo -= valor;
		}
	}

	public void depositaQuantia(double valor) {

		saldo += valor;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String toString() {
		return "ContaBancaria [Numero da Conta=" + numeroConta + ",Titular =" + nomeTitular + ", saldo=" + saldo + "]";
	}

}
