package demo1;

import java.util.Scanner;

public class Program{
	public int day;
	public int month;
	public int year;
	
	public void initDate() {
		this.day=5;
		this.month=5;
		this.year=2004;
				
	}
	
	public void printDate() {
		System.out.printf("%02d/%02d/%04d%n", day, month, year);
	}
	
	public void acceptDate() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("eneter the day:");
		int day = sc.nextInt();
		
		System.out.println("eneter the month:");
		int month = sc.nextInt();
		
		System.out.println("eneter the year:");
		int year = sc.nextInt();
	}
	
	
	public static void main(String argc[]) {
		
		Program program = new Program();
		
		program.initDate();
		program.acceptDate();
		program.printDate();
		
		
		
	}
}
