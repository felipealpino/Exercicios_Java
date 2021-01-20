package application;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Stream;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		Stream<Integer> st1 = list.stream().map(l-> l*10);
		
		System.out.println(Arrays.toString(st1.toArray()));
		
		Stream<String> st2 = Stream.of("Opa", "tudoooo", "bueno");
		System.out.println(Arrays.toString(st2.toArray()));
		
		Stream<Integer> st3 = Stream.iterate(0, x -> x+2);
		System.out.println(Arrays.toString(st3.limit(10).toArray()));
		
		//fibonacci
		Stream<Long> st4 = Stream.iterate(new Long[] {0L, 1L}, p-> new Long[] {p[1], p[0]+p[1]}).map(p-> p[0]);
		System.out.println(Arrays.toString(st4.limit(10).toArray()));
		
		sc.close();
	}
}