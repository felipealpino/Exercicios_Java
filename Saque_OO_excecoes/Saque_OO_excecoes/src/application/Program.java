package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) throws DomainException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter account data");
			System.out.print("Number:  ");
			int num = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Holder:  ");
			String holder = sc.nextLine();
			
			System.out.print("Initial Balance:  ");
			Double initBalance = sc.nextDouble();
			
			System.out.print("Withdraw limit:  ");
			Double withLimit = sc.nextDouble();
			
			Account acc = new Account(num, holder, initBalance, withLimit);
			
			System.out.print("Enter the amount for withdraw:  ");
			Double withD = sc.nextDouble();
			acc.withdraw(withD);
			
			System.out.println(acc);
		}
		catch (DomainException e) {
			System.out.println(e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("Unexpected error:  "+e.getMessage() );
		}
		
		
		
		sc.close();
	}

}
