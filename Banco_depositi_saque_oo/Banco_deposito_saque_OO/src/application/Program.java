package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		//Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account alex;
		
		System.out.print("Enter account number: ");
		int numConta = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		
		System.out.print("Is there an initial deposit? (y/n)? ");
		char confirm = sc.next().charAt(0);
		
		if (confirm == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialValue = sc.nextDouble();
			alex = new Account(numConta, name, initialValue);
		} else {
			alex = new Account(numConta, name);
		}
		
		
		
		
		
		System.out.println("Account data: ");
		//System.out.printf("Account %d, Holder: %s, Balance: $ %.2f%n",alex.getNumConta(),alex.getNomeTitular(),alex.getValorNaConta());
		alex.accountData();
		
		System.out.print("Enter a deposit value: ");
		alex.novoDeposito(sc.nextDouble());
		System.out.println("Updated account data: ");
		//System.out.printf("Account %d, Holder: %s, Balance: $ %.2f%n",alex.getNumConta(),alex.getNomeTitular(),alex.getValorNaConta());
		alex.accountData();
		
		System.out.print("Enter a withdraw value: ");
		alex.novoSaque(sc.nextDouble());
		System.out.println("Updated account data: ");
		alex.accountData();
		
		
		
		
		
		
		
		
		sc.close();
	}

}
