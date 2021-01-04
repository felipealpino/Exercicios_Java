package application;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;


public class Program {

	public static void main(String[] args) throws ParseException{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		System.out.println("Enter cliente data: ");
		System.out.print("Name: ");
		String clientName = sc.nextLine();
		System.out.print("Email: ");
		String clientEmail = sc.nextLine();
		System.out.print("Birth Date (DD/MM/YYYY): ");
		Date clientbd = sdf.parse(sc.next());
		sc.nextLine();
		System.out.println();
		
		
		System.out.println("Enter order data:");
		System.out.print("Status:");
		String status = sc.nextLine();
		System.out.print("How many itens to this order? ");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println();
		
		Order ordem = new Order(OrderStatus.valueOf(status), new Client(clientName, clientEmail, clientbd));
		
		for(int i=0; i<n; i++) {
			System.out.println("Enter #"+(i+1)+" item data:");
			System.out.print("Product name: ");
			String prodName = sc.nextLine();
			System.out.print("Product price: ");
			Double prodPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int prodQt = sc.nextInt();
			sc.nextLine();
		
			ordem.addItem(new OrderItem(prodQt, prodPrice, new Product(prodName, prodPrice)));
		}
		
		System.out.println();
		System.out.println();
		System.out.println("ORDER SUMMARY: ");
		System.out.println("Order moment: "+sdf2.format(ordem.getMoment()));
		System.out.println("Order status: "+ordem.getStatus());
		System.out.println("Client: "+ordem.getCliente().getName()+" ("+sdf.format(ordem.getCliente().getBirthDate())+") - "+ordem.getCliente().getEmail());
		System.out.println("Order items: ");
		for (int i=0; i<ordem.getList().size(); i++) {
			System.out.println(ordem.getList().get(i).getProduct().getName()+", $"+ordem.getList().get(i).getProduct().getPrice()+", Quantity: "+ordem.getList().get(i).getQuantity()+", Subtotal: $"+ordem.getList().get(i).subTotal());
		}
		
		System.out.println("Total price: "+ordem.total());
		sc.close();
	}

}
