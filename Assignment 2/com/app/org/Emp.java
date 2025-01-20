package com.app.org;
import java.util.Scanner;
import java.util.ArrayList;
 class Emp1 {
    
	 public int id;
	 public String name;
	 public String depid;
	 public double basic;
	 
	public Emp1(int id , String name , String depid  , double basic) {
		this.id = id;
		this.name = name;
		this.depid = depid;
		this.basic = basic;
		
		
		}
	 public String toString() {
		 return "id"+id+"name"+name+"basic"+basic;
		 
	 }
}
 
 class Manager extends Emp1{
	 public double perBonus;
	 
	  public Manager(int id , String name , String depid  , double basic , double perBonus) {
		super(id , name , depid , basic);
		  this.perBonus = perBonus;
		  
	  }
	 public double netsalary() {
		 return basic + perBonus;
	 }
	 
	 public double Bonus() {
		 return perBonus; 
	 }
	 
	 public String toString() {
		 return "id: "+id+"name: "+name+"basic: "+basic+"perBonus: "+perBonus;
		 
	 }
	   
 }
 
 class Worker extends Emp1{
	 
	 
	 public double hoursWorked;
	 public double hourlyRate;
	 
	  public Worker(int id , String name , String depid  , double basic , double hoursWorked , double hourlyRate ) {
		  super(id , name , depid , basic);
		  this.hoursWorked = hoursWorked;
		  this.hourlyRate = hourlyRate;
		  
	  }
	 public double netsalary() {
		 return hoursWorked * hourlyRate;
	 }
	 	 
	 public String getDetails() {
		 return toString();
	 }
	 
	 public double getWorker() {
		 return hourlyRate;
	 }
	 
	 public String toString() {
		 return "id: "+id+"name: "+name+"basic: "+basic+"hoursWorked: "+hoursWorked+"hourlyRate: "+hourlyRate;
		 
	 }
 
 }
 
 public class Emp{
	 


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String > e = new ArrayList();
		ArrayList<Emp1>employee = new ArrayList();
		
		int id;
		String name;
		String depid;
		double basic;
		double perBonus;
		double hoursWorked;
		double hourlyRate;
		
		int ch;
		do {
			
		
		System.out.println("menu");
		System.out.println("1.Hire Manager");
		System.out.println("2.Hire Worker");
		System.out.println("3.Display info of all employee");
		System.out.println("4.update basic salary");
		System.out.println("5.Exit");
		
		 ch = sc.nextInt();
		
		switch(ch) {
		case 1:
			System.out.println("Enter the id of manager:");
			 id = sc.nextInt();
			 sc.nextLine();
			System.out.println("Enter the name of manager:");
			name = sc.nextLine();
			 sc.nextLine();
			System.out.println("Enter the depid of manager:");
			 depid = sc.nextLine();
			 System.out.println("Enter the basic of manager:");
			basic = sc.nextDouble();	 
			 System.out.println("Enter the perBonus of manager:");
			perBonus = sc.nextDouble();
			employee.add(new Manager( id ,  name ,  depid  ,  basic, perBonus));
			break ;
			
		case 2:
			System.out.println("Enter the id of worker:");
			 id = sc.nextInt();
			 sc.nextLine();
			System.out.println("Enter the name of worker:");
			name = sc.nextLine();
			 sc.nextLine();
			System.out.println("Enter the depid of worker:");
			 depid = sc.nextLine();
			 System.out.println("Enter the basic of worker:");
			basic = sc.nextDouble();	 
			 System.out.println("Enter the hoursWorked  of worker:");
			 hoursWorked = sc.nextDouble();
			 System.out.println("Enter the hoursWorked  of worker:");
			 hourlyRate = sc.nextDouble();
			 
			employee.add(new Worker( id ,  name ,  depid  ,  basic, hoursWorked ,  hourlyRate));
			break ;
			
		case 3:
			System.out.println("Display the employee:");
			for(Emp1 employ : employee) {
				System.out.println(employ.toString());
			}
			break;
		
		case 4:
			System.out.println("enter id:");
			id=sc.nextInt();
			for(Emp1 employ : employee) {
				if(employ.id==id) {
				  double newbasic = sc.nextDouble();
				  employ.basic = newbasic;
				 
				}
			}
			break;
		}
		
		}while(ch!=0);
		
	
	}
	}
