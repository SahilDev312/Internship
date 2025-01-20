package demo1;
import java.util.Scanner;
public class Basket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int total = 0;
		
		System.out.println("enter the quantity:");
		
		int qty = sc.nextInt();
		
		System.out.println("Menu");
		System.out.println("1.pav");
		System.out.println("2.idli");
		System.out.println("3.tea");
		
		System.out.println("enter the choice :");
		int ch = sc.nextInt();
				
		switch(ch) {
		case 1:
			 total = qty*20;
			 System.out.printf("Total bill is : %d" ,total);
			 break;
		case 2:
			 total = qty*25;
			 System.out.printf("Total bill is : %d" ,total);
			 break;
		case 3:
			 total = qty*10;
			 System.out.printf("Total bill is : %d" ,total);
			 break;
		
			
		}
		
		
	}

}
