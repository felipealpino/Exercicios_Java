package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

import entities.UserLog;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String path = "E:\\NaoEncherSSD\\Eclipse_Java_IDE\\Exercicios\\Set_List_logs_usuarios_OO\\Set_List_logs_usuarios_OO\\logsEX.txt";
	
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			Set<UserLog> listLog = new HashSet<>();
			String line = br.readLine();
			while (line != null) {
				String[] arr = line.split(" ");
				//if (!listLog.contains(arr[0])) {
					listLog.add(new UserLog(arr[0]));
				//}
				line = br.readLine();
			}
			System.out.println("Total users: "+ listLog.size()); 
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		
		
		
		
		sc.close();
	}

}
