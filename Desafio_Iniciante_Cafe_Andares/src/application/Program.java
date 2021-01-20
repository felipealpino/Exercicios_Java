package application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Digite o valor de A1: ");
	int A1 = sc.nextInt();
	sc.nextLine();
	
	System.out.print("Digite o valor de A2: ");
	int A2 = sc.nextInt();
	sc.nextLine();
	
	System.out.print("Digite o valor de A3: ");
	int A3 = sc.nextInt();
	sc.nextLine();
	
	int valSe1 = (A2*2) + (A3*2)*2;
	int valSe2 = (A1*2) + (A3*2);
	int valSe3 = (A1*2)*2 + (A2*2);
	
	if (valSe1 < valSe2 && valSe1 < valSe3) {
		System.out.println("Saida :"+ valSe1);
	} else if(valSe2 < valSe1 && valSe2 < valSe3) {
		System.out.println("Saida :"+ valSe2);
	} else {
		System.out.println("Saida :"+ valSe3);
	}
	
	
	
	
	
	sc.close();
	}
}
