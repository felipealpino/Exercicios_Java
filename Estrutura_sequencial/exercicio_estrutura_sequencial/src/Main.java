//import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//exercicio1
		int x,y;
		x = sc.nextInt();
		y = sc.nextInt();
		System.out.println("SOMA = "+(x+y));
		
		//exercicio2
		double r,area;
		r = sc.nextDouble();
		area = Math.PI * Math.pow(r, 2);
		System.out.printf("A= %.4f %n",area);
		
		
		//exercicio3
		int a,b,c,d;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		System.out.println("DIFERENÇA = "+((a*b)-(c*d)));

		
		//exercicio4
		double[] funcionario = {sc.nextDouble(),sc.nextDouble(),sc.nextDouble()};
		double salario = funcionario[1]*funcionario[2];
		System.out.println("NUMBER = "+funcionario[0]);
		System.out.printf("SALARY = U$ %.2f%n",salario);
		
		
		//exercicio5
		double[][] valores = {
				{sc.nextDouble(),sc.nextDouble(),sc.nextDouble()},
				{sc.nextDouble(),sc.nextDouble(),sc.nextDouble()}
		};
		double total = ((valores[0][2]*valores[0][1]) + (valores[1][2]*valores[1][1]));
		System.out.printf("VALOR A PAGAR: R$ %.2f",total);
		
		
		//exercicio6
		double A,B,C, triangulo, retangulo, circulo, trapezio, quadrado;
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		//DecimalFormat formato = new DecimalFormat("#.##");
		triangulo = (A*C)/2;
		circulo = Math.PI*(Math.pow(C, 2));
		trapezio = ((A+B)/2)*C;
		quadrado = B*B;
		retangulo = A*B;
		
		System.out.printf("TRIANGULO: %.3f%n",triangulo);
		System.out.printf("CIRCULO: %.3f%n",circulo);
		System.out.printf("TRAPÉZIO: %.3f%n",trapezio);
		System.out.printf("QUADRADO: %.3f%n",quadrado);
		System.out.printf("RETANGULO: %.3f%n",retangulo);
		
		
	}
}
	