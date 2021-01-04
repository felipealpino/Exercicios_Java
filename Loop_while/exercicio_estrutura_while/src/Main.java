import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		//exercicio1 
		System.out.println("Digite uma senha");
		int senha = sc.nextInt();
		
		while(senha != 2002) {
			System.out.println("Senha inválida");
			System.out.println("Digite uma senha");
			senha = sc.nextInt();
		}
		System.out.println("Acesso permitido");
		
		
		int x,y;
		System.out.println("Digite um valor para x: ");
		x = sc.nextInt();
		System.out.println("Digite um valor paar y: ");
		y = sc.nextInt();
		
		while (x!=0 && y!=0) {
			if (x<0 && y<0) {
				System.out.println("Terceiro uadrante");
			} else if (x>0 && y<0){
				System.out.println("Quarto quadrante");
			} else if (x<0 && y>0) {
				System.out.println("Segundo quadrante");
			} else if (x>0 && y>0) {
				System.out.println("Primeiro quadrante");
			} else {
				System.out.println("Input incorreto");
				System.exit(0);
			}
			
			System.out.println("Digite um valor para x: ");
			x = sc.nextInt();
			System.out.println("Digite um valor paar y: ");
			y = sc.nextInt();
		}
		*/
		
		int x = 0, a = 0, g = 0, d = 0;
		System.out.println("Digite um valor: ");
		x = sc.nextInt();
		
		while (x!= 4) {
			if(x==1) {
				a+=1; //Alcohol
			} else if (x==2) {
				g+=1; //Gasoline
			} else if (x==3) {
				d+=1; //Diesel
			}
		
			System.out.println("Digite um valor: ");
			x = sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: "+a);
		System.out.println("Gasolina: "+g);
		System.out.println("Diesel: "+d);
		
		
		sc.close();

	}

}
