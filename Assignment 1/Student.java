package demo1;
import java.util.Scanner;
public class Student {
	public int roll;
	public String name;
	public double marks;
	
	Student(){
		this.roll = 07;
		this.name = "Sahil Balfe";
		this.marks = 7.9;
	}
     
	public void printDetails() {
		System.out.println(roll);
		System.out.println(name);
		System.out.println(marks);
		
	}
	
	public void acceptDetails() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enetr roll:");
		this.roll = sc.nextInt();
		
		sc.nextLine();
        System.out.println("enetr name:");
		this.name = sc.nextLine();
        
		System.out.println("enetr marks:");
        this.marks = sc.nextInt();
		
	}
	public static void main(String argc[]) {
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		System.out.println("enter choices:");
		System.out.println("1 for initialization");
		System.out.println("2 for acceptance");
		System.out.println("3 for print");
		int ch = sc.nextInt();
		
		switch(ch){
		case 1: 
			 student = new Student();
			 System.out.println("initiated with default values:");
			 student.printDetails();
			 break;
	    
		case 2:
			student.acceptDetails();
			student.printDetails();
			break;
		
		case 3:
			student.printDetails();
			break;
		
		default:
			 System.out.println("try again");

		}
	}
}
