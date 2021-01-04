package application;

import java.util.Scanner;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Product TV;
		TV = new Product();

		System.out.println("Nome do produto: ");
		TV.name = sc.next();
		System.out.println("Valor do produto: ");
		TV.price = sc.nextDouble();
		System.out.println("Quantidade do produto: ");
		TV.quantity = sc.nextInt();
		
		System.out.println("Product data:"+TV.name+" $"+TV.price+", "+TV.quantity+"un, Total: $"+(TV.TotalValueInStock()));
		System.out.println("Enter the number of products to be added in stock");
		TV.AddProducts(sc.nextInt());
		System.out.println("Updated data:"+TV.name+", $"+TV.price+", "+TV.quantity+"un, Total: $"+TV.TotalValueInStock());
		TV.RemoveProducts(sc.nextInt());
		System.out.println("Updated data:"+TV.name+", $"+TV.price+", "+TV.quantity+"un, Total: $"+TV.TotalValueInStock());
		
		sc.close();
	}
	
}
