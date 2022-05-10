package ProjetoBranco;

public class TestaBanco {

	public static void main(String[] args) {
		
		Banco banco = new Banco(0);
		banco.criaConta("Gustavo","123366");
		banco.criaConta("Flavio","123367");
		banco.criaConta("Maria","123368");
		
		System.out.println(banco);
		
		/* Banco banco = new Banco(10);
        banco.criaConta("Josefino Antonio", "11155");
        banco.criaConta("André Silva", "13215");
        banco.criaConta("Paulo Mendes", "995533");
        System.out.println(banco);
        banco.depositaQuantia("11155", 90);
        banco.depositaQuantia("13215", 1000);
        banco.depositaQuantia("995533", 1500);
        System.out.println(banco);
        banco.levantaQuantia("13215", 300);
        banco.levantaQuantia("11155", 1000);
        System.out.println(banco);
        banco.transfereQuantia("13215", "995533", 3500);
        System.out.println(banco);*/
	}

}
