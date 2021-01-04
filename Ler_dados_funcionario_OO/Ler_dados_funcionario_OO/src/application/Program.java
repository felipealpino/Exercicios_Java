package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		//Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double porcent;
		Employee joao;
		joao = new Employee();
		
		System.out.println("Digite o nome do meliante: ");
		joao.name = sc.nextLine();
		System.out.println("Digite o gross Salary: ");
		joao.grossSalary = sc.nextDouble();
		System.out.println("Digite a taxa cobrada: ");
		joao.tax = sc.nextDouble();
		
		
		System.out.printf("Employee: %s, $ %.2f%n ",joao.name,joao.netSalary());
		System.out.println("Which percentage to increase salary? ");
		porcent = sc.nextDouble();
		joao.increaseSalary(porcent);
		System.out.printf("Update data: %s, $ %.2f%n",joao.name,joao.netSalary());
		
		
		
		sc.close();
		
	}

}
