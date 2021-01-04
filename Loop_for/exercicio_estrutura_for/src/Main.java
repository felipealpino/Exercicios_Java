import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	/*		
	//exercicio1
	int x = 0;
	System.out.println("Digite um valor para x:");
	x = sc.nextInt();
	
	for (int i=0; i<x; i++) {
		if (i%2!=0){
			System.out.println("O valor "+i+" é impar.");
		}
	}
	
	//exercicio2
	int N=0,v=0,in=0,out=0;
	System.out.println("Digite um valor para limitar o loop: ");
	N = sc.nextInt();
	
	for (int i=1; i<=N; i++) {
		System.out.println("Digite um valor para v:");
		v = sc.nextInt();
		if (v>= 10 && v<=20 ) {
			in+=1;
		} else if (v<0) {
			
		} else {
			out+=1;
		}
	}
	
	System.out.println(in+" in");
	System.out.println(out+" out");
	
	
	
	//exercicio3
	int lim = 0;
	double media = 0.0;
	System.out.println("Digite um valor limite: ");
	lim = sc.nextInt();
	double v1,v2,v3=0;
	
	for(int i=0; i<=lim; i++) {
		System.out.println("Digite um valor v1: ");
		v1 = sc.nextDouble();
		System.out.println("Digite um valor v2: ");
		v2 = sc.nextDouble();
		System.out.println("Digite um valor v3: ");
		v3 = sc.nextDouble();
		
		media = ((v1*2)+(v2*3)+(v3*5))/(2+3+5);
		System.out.printf("%.1f%n",media);
	}
	
	//exercicio4
	int limite = 0;
	
	System.out.println("Digite um limite:");
	limite = sc.nextInt();
	
	for (int i=1; i<=limite; i++) {
		double n1=0, n2=0;
		System.out.println("Digite um valor para n1: ");
		n1 = sc.nextDouble();
		System.out.println("Digite um valor para n2: ");
		n2 = sc.nextDouble();
		
		if(n2==0) {
			System.out.println("divisão impossível");
		} else {
			double total = 0;
			total = n1/n2;
			System.out.printf("%.1f%n",total);
		}
	}
	
	
	//exercicio5 
	int total = 1, valor = 0;
	System.out.println("Digite um valor: ");
	valor = sc.nextInt();
	
	for(int i=1; i<=valor; i++) {
		total *= i;
	}
	
	System.out.println(total);
	
	
	//exercicio6
	
	int inteiro = 0;
	System.out.println("Digite um valor inteiro: ");
	inteiro = sc.nextInt();
	
	
	for (int i=1; i<=inteiro; i++) {
		if(inteiro%i == 0) {
			System.out.println(i);
		}
	}
	
	*/
	
	//exercicio7
	
	int valorzao = 0;
	System.out.println("Digite um valorzao");
	valorzao = sc.nextInt();
	
	for(int i=1; i<=valorzao; i++) {
		System.out.println((Math.pow(i, 1))+" "+(Math.pow(i, 2)+" "+(Math.pow(i, 3))));
	}
	
	
	
	
	
	
	
	
	sc.close();
	}

}
