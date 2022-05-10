package PovaTipoDois;

public class Main {
	private static Empresa seleciona=null;
	public static void main(String[] args) {
		//numEmpregado, String nome, Genero genero, double salario, String departamento,
		//int numFilhos)
		Empregado empregado1 = new Empregado("1","Gustavo",Genero.selecionaGenero('M'),1500,"I.T",0);
		Empregado empregado2 = new Empregado("2","Bruna",Genero.selecionaGenero('F'),1500,"I.T",2);
		Empregado empregado3 = new Empregado("3","Fernando",Genero.selecionaGenero('M'),1500,"I.T",1);
		Empregado empregado4 = new Empregado("4","Clara",Genero.selecionaGenero('F'),1500,"I.T",0);
		Empregado empregado5 = new Empregado("5","Fabio",Genero.selecionaGenero('M'),1500,"I.T",1);
		
		//String nome, Empregado nomeCEO, double capitalSocial
		Empresa empresa1 = new Empresa("MyEmpresa",empregado1,130000);
		
		//String nome, double capitalSocial
		Empresa empresa2 = new Empresa("DoisPassos",30000);
		
		System.out.println(seleciona.obtemNumTotalEmpresas());
		
		empresa1.contrataEmpregado(empregado1);
		empresa1.contrataEmpregado(empregado2);
		empresa1.contrataEmpregado(empregado3);
		
		
		empresa2.contrataEmpregado(empregado1);
		empresa2.contrataEmpregado(empregado2);
		empresa2.contrataEmpregado(empregado3);
		empresa2.contrataEmpregado(empregado4);
		empresa2.contrataEmpregado(empregado5);
		
		System.out.println(empresa1);
		System.out.println(empresa2);
		
		empresa1.aumentaNumeroFilhos("1", 1);
		
		
		
	}

}
