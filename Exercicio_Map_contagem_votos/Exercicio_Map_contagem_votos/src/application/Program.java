package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String path =  "E:\\NaoEncherSSD\\Eclipse_Java_IDE\\Exercicios\\Exercicio_Map_contagem_votos\\votos.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			Map<String, Integer> votos = new HashMap<>();
			String line = br.readLine();
 			while(line != null) {
				String[] arr = line.split(",");
				if(!votos.containsKey(arr[0])){
					votos.put(arr[0], Integer.parseInt(arr[1]));
				} else { 
					for(String i : votos.keySet()) {
						int hash = i.hashCode();
						if(hash == arr[0].hashCode()) {
							int sum = votos.get(i) + Integer.parseInt(arr[1]);
							votos.put(arr[0], sum);
						}
					}
				}
				line = br.readLine();
			}
 			
 			for (String i : votos.keySet()) {
 				System.out.println(i+": "+votos.get(i));
 			}
 			
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		sc.close();
		
	}

}
