import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		/* 
		
		//exercicio1
		int i;
		System.out.println("Ex1: Digite um numero inteiro:");
		i = sc.nextInt();
		if(i<0) {
			System.out.println("NEGATIVO");
		} else {
			System.out.println("POSITIVO");
		}
		
		
		//exercicio2
		int n;
		System.out.println("Ex2: Digite um numero inteiro:");
		n = sc.nextInt();
		if(n%2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		} 
		
		
		//exercicio3
		int n1,n2;
		double resto = 0;
		String msg = null;
		System.out.println("Ex3: Digite um numero inteiro n1:");
		n1 = sc.nextInt();
		System.out.println("Ex3: Digite um numero inteiro n2:");
		n2 = sc.nextInt();
		
		if (n1>n2 && n2!=0) {
			resto = n1%n2;
		} else if (n2>n1 && n1!=0) {
			resto = n2%n1;
		} else {
			System.out.println("Ambos valores nao podem ser zero");
			System.exit(0);
		}
		
		if (resto == 0) {
			System.out.println("São Multiplos");
		} else {
			System.out.println("Não São Multiplos");
		}
		
		
		//exercicio4
		int h1,h2;
		System.out.print("Ex4: Digite um numero inteiro h1:");
		h1 = sc.nextInt();
		System.out.print("Ex4: Digite um numero inteiro h2:");
		h2 = sc.nextInt();
		
		if(h1==h2) {
			System.out.println("O JOGO DUROU 24 HORA(S)");
		} else if (h1>h2) {
			System.out.println("O JOGO DUROU "+((24-h1+h2))+" HORA(S)");
		} else {
			System.out.println("O JOGO DUROU "+Math.abs(h1-h2)+" HORA(S)");
		}
		
		
		//exercicio5
		int numItem, quantidade;
		System.out.print("Ex5: Digite o código do item:");
		numItem = sc.nextInt();
		System.out.print("Ex5: Digite a quantidade:");
		quantidade = sc.nextInt();
		
		if(numItem == 1) {
			System.out.println("Total: R$"+(quantidade*4));
		} else if(numItem == 2) {
			System.out.println("Total: R$"+(quantidade*4.5));
		} else if(numItem == 3) {
			System.out.println("Total: R$"+(quantidade*5));
		} else if(numItem == 4) {
			System.out.println("Total: R$"+(quantidade*2));
		} else if(numItem == 5) {
			System.out.println("Total: R$"+(quantidade*1.5));
		} 
		
		
		//exercicio6:
		double valorRandom;
		System.out.print("Ex6: Digite um valor qualquer:");
		valorRandom = sc.nextDouble();
		
		if(valorRandom>=0 && valorRandom<=25) {
			System.out.println("O valor está no intervalo [0-25]");
		} else if(valorRandom>25 && valorRandom<=50) {
			System.out.println("O valor está no intervalo [25-50]");
		} else if(valorRandom>50 && valorRandom<=75) {
			System.out.println("O valor está no intervalo [50-75]");
		} else if(valorRandom>75 && valorRandom<=100) {
			System.out.println("O valor está no intervalo [75-100]");
		} else {
			System.out.println("Fora de intervalo");
		}
		
		
		//exercicio7
		double X,Y;
		System.out.print("Ex7: Digite um valor para X:");
		X = sc.nextDouble();
		System.out.print("Ex7: Digite um valor para Y:");
		Y = sc.nextDouble();
		
		if(X<0 && Y>0) {
			System.out.println("Q2");
		} else if (X>0 && Y>0) {
			System.out.println("Q1");
		} else if (X<0 && Y<0) {
			System.out.println("Q3");
		} else if (X>0 && Y<0){
			System.out.println("Q4");
		} else {
			System.out.println("Origem");
		}
		
		*/
		
		//exercicio8
		double salario, imposto = 0;
		System.out.print("Ex8: Digite o salario do meliante:");
		salario = sc.nextDouble();
		
		if (salario<=2000) {
			System.out.println("Isento");
		} else if (salario>2000 && salario<= 3000) {
			imposto = (salario - 2000)*(0.08);
		} else if (salario >3000 && salario <=4500) {
			imposto = ((3000-2000.01)*(0.08))+((salario-3000)*(0.18));
		} else {
			imposto = ((3000-2000.01)*(0.08))+((4500-3000.01)*(0.18))+((salario-4500)*(0.28));
		}
		System.out.printf("R$ %.2f",imposto);
		
		
		sc.close();
	}

}
