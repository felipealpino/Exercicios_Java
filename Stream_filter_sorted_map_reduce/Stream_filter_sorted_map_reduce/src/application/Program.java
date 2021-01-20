package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String path = "E:\\NaoEncherSSD\\Eclipse_Java_IDE\\Exercicios\\Stream_filter_sorted_map_reduce\\exercicio.txt";
		List<Product> prods = new ArrayList<>();
		List<Double> val = new ArrayList<>();
		int totalItens = 0;
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
		
			String line = br.readLine();
			while(line != null) {
				String[] arr = line.split(",");
				prods.add(new Product(arr[0], Double.parseDouble(arr[1])));
				val.add(Double.parseDouble(arr[1]));
				line = br.readLine();
				totalItens += 1;
			}
			
			//animals = animals.stream().sorted(Comparator.comparing(Product::getNameProd)).collect(Collectors.toList());
			//animals = animals
			
			double average = val.stream().reduce (0.0, (x, y) -> x+y);
			Double av = average/totalItens;
			System.out.println("Average price: "+ String.format("%.2f", av));
			
			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			List<String> produtos = prods.stream()
				.filter(p -> p.getPrecoProd() < av)
				.map(p-> p.getNameProd())
				.sorted(comp.reversed())
				.collect(Collectors.toList());
			
			produtos.forEach(System.out::println);
			
	
			
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		sc.close();
	}

}
