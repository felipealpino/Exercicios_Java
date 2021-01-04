package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		List<Employee> list = new ArrayList<>();
		
		for (int i=0; i<n; i++) {
			System.out.println("Employee #"+(i+1)+" data:");
			System.out.print("Outsourced (y/n)? ");
			int outS = sc.next().charAt(0);
			sc.nextLine();
				if(outS == 'n') {
					System.out.print("Name: ");
					String name = sc.nextLine();
					System.out.print("Hours: ");
					int hours = sc.nextInt();
					sc.nextLine();
					System.out.print("Value per hour: ");
					Double valueHour = sc.nextDouble();
					System.out.println();
					list.add(new Employee(name, hours, valueHour));
				} else {
					System.out.print("Name: ");
					String name = sc.nextLine();
					System.out.print("Hours: ");
					int hours = sc.nextInt();
					sc.nextLine();
					System.out.print("Value per hour: ");
					Double valueHour = sc.nextDouble();
					System.out.print("Additionaal charge: ");
					Double addCharg = sc.nextDouble();
					System.out.println();
					list.add(new OutsourcedEmployee(name, hours, valueHour, addCharg));
				}
		}
		
		System.out.println("");
		System.out.println("PAYMENTS: ");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getName()+" - $ "+list.get(i).payment());
		}
		
		
		
		sc.close();
	}

}
