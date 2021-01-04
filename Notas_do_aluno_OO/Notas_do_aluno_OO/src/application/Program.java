package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program {
	
	public static void main(String[] args) {
		//Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno alex;
		alex = new Aluno();
		double resultado;
		
		System.out.println("Digite o nome do Aluno: ");
		alex.nome = sc.nextLine();
		System.out.println("Digite a nota1: ");
		alex.nota1 = sc.nextDouble();
		System.out.println("Digite a nota2: ");
		alex.nota2 = sc.nextDouble();
		System.out.println("Digite a nota3: ");
		alex.nota3 = sc.nextDouble();
		
		System.out.println("FINAL GRADE: "+String.format("%.2f", alex.somaNotas()));
		alex.passFailed();
		
		sc.close();
	}
}
