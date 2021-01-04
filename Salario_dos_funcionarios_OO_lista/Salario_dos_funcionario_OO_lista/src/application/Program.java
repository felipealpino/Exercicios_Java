package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List <Employee> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int N = sc.nextInt();
		sc.nextLine();
		int id;
		
		for (int c=1; c<=N; c++) {
			System.out.println("Employee #"+c+": ");
			System.out.print("Id: ");
			id = sc.nextInt();
			sc.nextLine();

			while (checkId(list,id)) {
				System.out.println("Id inválido, tente outro: ");
				System.out.print("Id: ");
				id = sc.nextInt();
				sc.nextLine();
			}
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();

			list.add(new Employee(id, name, salary));
		}
		
		System.out.println("Enter the employee id that will have salary increase: ");
		int id2 = sc.nextInt();
		sc.nextLine();
		Employee emp = list.stream().filter(x-> x.getId() == id2).findFirst().orElse(null);
		
		if(emp == null) {
			System.out.println("Não foi encontrado nenhum id");
			System.exit(0);
		} else {
			System.out.println("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.aumentaSalario(percentage);
		}
		
		System.out.println("List of employees: ");
		for(Employee obj: list) {
			System.out.println(obj);
		}
			
		
		
		
		
		
		
		
		sc.close();
	}
	
	public static boolean checkId(List <Employee> list, int id) {
		Employee emp = list.stream().filter(x-> x.getId() == id ).findFirst().orElse(null);
		if (emp == null) {
			return false;
		} else { 
			return true;
		}
	}
	

}
