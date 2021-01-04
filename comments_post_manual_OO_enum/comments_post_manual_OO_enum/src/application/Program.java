package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		System.out.print("Enter num of posts: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		List<Post> posts = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			System.out.print("Moment: dd/MM/yyyy HH:mm:ss: ");
			Date dataMoment = sdf.parse(sc.nextLine());
			System.out.print("Title: ");
			String newTitle = sc.nextLine();
			System.out.print("Content: ");
			String newContent = sc.nextLine();
			System.out.print("Likes: ");
			Integer newLikes = sc.nextInt();
			sc.nextLine();
			Post post = new Post(dataMoment, newTitle, newContent, newLikes);
			posts.add(post);
			
			int nComments = 2;
			for (int c=0; c<nComments; c++) {
				System.out.print("Digite um comentário: ");
				posts.get(i).addComments(new Comment(sc.nextLine()));

			}
			
		}
		
		
			
		
		for (Post x : posts) {
			Calendar cal = Calendar.getInstance();
			cal.setTime(x.getMoment());
			int day = cal.get(Calendar.DAY_OF_MONTH);
			int month = cal.get(Calendar.MONTH);
			int year = cal.get(Calendar.YEAR);
			
			//System.out.println(x);
			System.out.println(x.getTitle());
			System.out.println(x.getLikes()+" Likes - "+day+"/"+month+"/"+year);
			System.out.println(x.getContent());
			System.out.println("Comments: ");
			for (int c=0; c<x.getComments().size(); c++) {
				System.out.println(x.getComments().get(c).getText());
			}
			
			System.out.println();
			System.out.println();
			
		}
		
		
		
		
		
		
		sc.close();
	}

}
