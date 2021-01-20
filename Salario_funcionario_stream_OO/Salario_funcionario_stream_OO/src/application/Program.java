package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String path = "E:\\NaoEncherSSD\\Eclipse_Java_IDE\\Exercicios\\Salario_funcionario_stream_OO\\funcionarios.txt";
		List<Employee> emps = new ArrayList<>();
		
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String line =  br.readLine();
			while(line != null) {
				String[] arr = line.split(",");
				emps.add(new Employee(arr[0], arr[1], Double.parseDouble(arr[2])));
				line = br.readLine();
			}
			
			System.out.print("Enter salary:  ");
			double salary = sc.nextDouble();
			
			//Comparator<Employee> comp = (s1, s2) -> s1.getName().toUpperCase().compareTo(s2.getName().toUpperCase());
			
			
			List<String> funcionarios = emps.stream()
			.filter(p-> p.getSalary() > salary)
			.map(p-> p.getEmail())
			.sorted()
			.collect(Collectors.toList());
			
			System.out.println("Email fo people whose salary is more than "+salary);
			funcionarios.forEach(System.out::println);

			
			System.out.println("Digite uma letra:  ");
			char InitialLetter = sc.next().toUpperCase().charAt(0);
			double sum = filteredSum(emps, p-> p.getName().charAt(0) == InitialLetter);
			System.out.println("Sum of salary of people whose name starts with " +InitialLetter + " "+ sum);
					
					
		
			
			
			
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}
	
	public static Double filteredSum(List<Employee> emps, Predicate<Employee> criteria) {
		double sum = 0.0;
		for(Employee emp : emps) {
			if(criteria.test(emp)) {
				sum += emp.getSalary();
			}
		}
		return sum;
	}
	
	
}
