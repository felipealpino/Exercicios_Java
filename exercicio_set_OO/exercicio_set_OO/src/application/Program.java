package application;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Set <Integer> c1 = new HashSet<>();
		Set <Integer> c2 = new HashSet<>();
		Set <Integer> c3 = new HashSet<>();

		System.out.print("How many students for couse A? ");
		int a = sc.nextInt();
		sc.nextLine();
		for (int i=0; i<a; i++){
			c1.add(sc.nextInt());
		}
		
		System.out.print("How many students for couse B? ");
		a = sc.nextInt();
		sc.nextLine();
		for (int i=0; i<a; i++){
			c2.add(sc.nextInt());
		}
		
		System.out.print("How many students for couse C? ");
		a = sc.nextInt();
		sc.nextLine();
		for (int i=0; i<a; i++){
			c3.add(sc.nextInt());
		}
	
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		System.out.println();
		
		Set<Integer> total = new HashSet<>(c1);
		total.addAll(c2);
		total.addAll(c3);
		
		System.out.println(total);
		System.out.println(total.size());
		
		
		
		
		
		
		
		sc.close();
	}

}
