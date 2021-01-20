package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//List<Integer> A = Arrays.asList(1,2,3,4,5,6,7,8,9.10);
		List<String> list = new ArrayList<>();
		List<Integer> A = new ArrayList<>();
		for (int i=1; i<=20; i++) {
			A.add(i);
		}
		
		System.out.print("Digite a soma desejada (int): ");
		int S = sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i<A.size(); i++) {
			for(int j=i; j<A.size(); j++) {
				if(i != j) {
					if(A.get(i) + A.get(j) == S) {
						list.add(Integer.toString(A.get(i))+" + "+Integer.toString(A.get(j)));
					}
				}
			}
		}
		
		if(list.size()>0) {
			System.out.print("S = "+S+": True: ");
			for(int i=0; i<list.size(); i++) {
				System.out.print(list.get(i)+", ");
			}
		} else {
			System.out.println("S = "+S+": Falso: não existe nenhuma combinação de dois elementos que some "+S);
		}
		
		
		/*******TESTANDO COMPARATOR*******/
		// se usar negativo = descending , se usar positivo = ascending
		System.out.println();
		A.sort((i1,i2) -> - i1.compareTo(i2));
		//A.forEach(System.out::print);
		System.out.print("[");
		for(int i =0; i<A.size(); i++) {
			System.out.print(A.get(i)+" ");
		}
		System.out.print("]");
		
		
		
		/*******TESTANDO PREDICATE*******/
		System.out.println();
		boolean bol = A.removeIf(i -> i>19);
		if(bol) {
			System.out.println("O Predicate funcionou");
		} else {
			System.out.println("O Predicate NÃO funcionou");
		}
		
		
		
		
		
		sc.close();
	}

}
