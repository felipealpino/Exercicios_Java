package application;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product> list = new ArrayList<>();
		
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i<n ; i++) {
			System.out.println("Product #"+(i+1)+" data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char status = sc.next().charAt(0);
			sc.nextLine();
			if(status == 'i') {
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Price: ");
				Double price = sc.nextDouble();
				System.out.print("Customs fee: ");
				Double fee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, fee));
			} else if (status == 'c') {
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Price: ");
				Double price = sc.nextDouble();
				list.add(new Product(name, price));
			} else if (status == 'u') {
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Price: ");
				Double price = sc.nextDouble();
				sc.nextLine();
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date data = sdf.parse(sc.nextLine());
				list.add(new UsedProduct(name, price, data));
			}
		}
		
		System.out.println();
		System.out.println("PRICE TAGS: ");
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).priceTag());
		}
		
		

		sc.close();
	}

}
