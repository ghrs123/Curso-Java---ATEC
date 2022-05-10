package Exercicio;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);

		 int n;

		 double alt=0,larg=0;


		 System.out.println("Qual opção pretende escolher?\n1.Criar Retangulo\n2.Criar Triangulo\n3.Sair");

		 n = numero.nextInt();


		 if(n==1)

		 {


		 System.out.println("Qual e a altura?");

		 alt = numero.nextDouble();

		 numero.nextLine();


		 System.out.println("Qual e a largura?");

		 larg = numero.nextDouble();

		 numero.nextLine();


		 Retangulo retangulo1 = new Retangulo(4,"vermelho",alt,larg);

		 System.out.println(retangulo1.getPerimetro());

		 System.out.println(retangulo1.getArea());



		 }

		 else if(n==2)

		 {


		 System.out.println("Qual e a altura?");

		 alt = numero.nextDouble();

		 numero.nextLine();


		 System.out.println("Qual e a largura?");

		 larg = numero.nextDouble();

		 numero.nextLine();


		 Triangulo triangulo1 = new Triangulo(3,"azul",alt,larg);



		System.out.println(triangulo1.getPerimetro());

		 System.out.println(triangulo1.getArea());

		 }

		 else

		 {

		 System.out.println("Fim do programa!");

		 }


		 numero.close();

		 }
}
