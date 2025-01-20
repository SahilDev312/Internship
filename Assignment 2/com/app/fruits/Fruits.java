package com.app.fruits;

import java.util.Scanner;

class Fruit {

	public String color;
	public double weight;
	public String name;
	public boolean isFresh;
	
	Fruit(String color , double weight , String name, boolean isFresh ){
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh = isFresh;
	}
	
	public String toString() {
		return "color:" + color + "weight:" + weight + "name" + name + "isFresh" + isFresh ;
	}
	
	public String taste() {
		return "no taste " ;
	}

	public String  getname() {
		// TODO Auto-generated method stub
		return name;
	}
}


class Apple extends Fruit{
	
	Apple(String color , double weight , String name, boolean isFresh){
		super(color , weight , name , isFresh);
	}
	
	public String taste() {
		return "apple is sweet ";
	}
}

class Orange extends Fruit{
	
	Orange(String color , double weight , String name, boolean isFresh){
		super(color , weight , name , isFresh);
	}
	
	public String taste() {
		return "apple is sour ";
	}
}

class Mango extends Fruit{
	
	Mango(String color , double weight , String name, boolean isFresh){
		super(color , weight , name , isFresh);
	}
	
	public String taste() {
		return "apple is Delicious ";
	}
}

public class Fruits{
	
	public static void main(String argc[]) {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("enter the length");
		 int len  = sc.nextInt();
		 
		 String color;
		 double weight;
		 String name;
		 boolean isFresh;
		 
		 int counter = 0;
		 Fruit[] basket = new Fruit[len];
		 
		 
		int ch;
		
		do {
			 
			 
		 System.out.println("Menu");
		 System.out.println("1.Mango");
		 System.out.println("2.Orange");
		 System.out.println("3.Apple");
		 System.out.println("4.Display names of all fruits in the basket");
		 System.out.println("5.Display names of all fruits that are fresh");
		 System.out.println("6.Display names of all fruits that are not fresh");
		 
		 
		 
		  ch = sc.nextInt();
		 
		 
		 switch(ch) {
		 
		 case 1:
			 sc.nextLine();
			 System.out.println("color");
			 color = sc.nextLine();
			 System.out.println("weight");
			 weight= sc.nextDouble();
			 System.out.println("name");
			 sc.nextLine();
			 name = sc.nextLine();
			 System.out.println("isFresh");
			 isFresh = sc.nextBoolean();
			 basket[counter++] = new Mango(color , weight , name , isFresh);
			 
			break;
			 
		 case 2:
			 sc.nextLine();
			 System.out.println("color");
			  color = sc.nextLine();
			 System.out.println("weight");
			  weight = sc.nextDouble();
			 System.out.println("name");
			 sc.nextLine();
			  name = sc.nextLine();
			 System.out.println("isFresh");
			  isFresh = sc.nextBoolean();
			 basket[counter++] = new Orange(color , weight , name , isFresh);
			 break;
			 
		 case 3:
			 sc.nextLine();
			 System.out.println("color");
			  color = sc.nextLine();
			 System.out.println("weight");
			  weight = sc.nextDouble();
			 System.out.println("name");
			 sc.nextLine();
			  name = sc.nextLine();
			 System.out.println("isFresh");
			  isFresh = sc.nextBoolean();
			 basket[counter++] = new Apple(color , weight , name , isFresh);
			 break;
			 
		 case 4:
			 System.out.println("Dislaying all names:  ");
			 for(Fruit fru : basket) {
				 System.out.println(fru.getname()); 
			 }
			 System.out.println("Empty");
		     break;
		     
		 case 5 :	 
			 System.out.println("stales fruit names: ");
			 for(Fruit fru : basket) {
				 if(fru.isFresh) {
				 System.out.println(fru.getname()); 
				 }
			 }
			 System.out.println("Empty");
		     break;
		     
		 case 6 :	 
			 System.out.println("stales fruit names: ");
			 for(Fruit fru : basket) {
				 if(!fru.isFresh) {
				 System.out.println(fru.getname()); 
				 }
			 }
			 System.out.println("Empty");
		     break;
		 }
		 
	}while(ch!=0);

	}
	
}

















