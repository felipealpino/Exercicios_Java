package application;

import java.util.Scanner;
import utilities.Student;

public class Program {

	public static void main(String[] args) {
		//Locale.setDefault(LOCALE.US);
		Scanner sc = new Scanner(System.in);
		
		Student[] quartos = new Student[10];

		
		System.out.print("How many rooms will be rented? ");
		int numStud = sc.nextInt();
		if (numStud < 1 || numStud > 10) {
			System.out.println("Numero de estudantes precisa ser entre 1 e 10");
			System.exit(0);
		}
		
		for (int c=1; c<=numStud; c++) {
			System.out.println();
			System.out.println("Rent #"+ c +":");
			System.out.print("Name:");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			quartos[room-1] = new Student(name, email, room);
		}
		
		System.out.println("Busy rooms:");
		for (int c=0; c<quartos.length; c++) {
			if (quartos[c] != null) {
				quartos[c].finalMessage();
			}
		}
		
		
		
		
		
		
		sc.close();
	}

}
