package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		List<Product> listProd = new ArrayList<>();
		String strPath = "E:\\NaoEncherSSD\\Eclipse_Java_IDE\\Exercicios\\trabalhando_com_arquivos_java\\readme.csv";
		String strNewMkdir = "E:\\NaoEncherSSD\\Eclipse_Java_IDE\\Exercicios\\trabalhando_com_arquivos_java";
		new File(strNewMkdir + "\\out").mkdir();
		String path = "E:\\\\NaoEncherSSD\\\\Eclipse_Java_IDE\\\\Exercicios\\\\trabalhando_com_arquivos_java\\out\\summary.csv";
		String line = "";
		String[] arr = null;
		
		try(BufferedReader br = new BufferedReader(new FileReader(strPath))) {
			line = br.readLine();
			while (line != null) {
				//System.out.println(line);
				arr = line.split(",");
				//System.out.println(arr[0].trim().substring(1));
				//System.out.println(arr[1].trim());
				//System.out.println(arr[2].trim().substring(0, arr[2].length() - 2 ));
				Product produto = new Product(arr[0].trim(),Double.parseDouble(arr[1].trim()), Integer.parseInt(arr[2].trim().substring(0, arr[2].length()-2)));
				listProd.add(produto);
				line = br.readLine();
			}
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
			for (int i=0; i<listProd.size(); i++) {
				bw.write(listProd.get(i).getProduto());
				bw.write(",   ");
				bw.write(String.valueOf(listProd.get(i).totalVendido()));
				bw.newLine();
			}	
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		
	}



}
