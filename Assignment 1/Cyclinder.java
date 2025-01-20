package demo1;
import java.util.Scanner;

public class Cyclinder {
	public double radius;
	public double height;
	
	Cyclinder(){
		this.height=0;
		this.radius=0;
	}
	Cyclinder(double radius, double height){
		 this.height = height;
		 this.radius = radius;
	}
	public void setheight(double height) {
		this.height= height;
	}
	public void setradius(double radius) {
		this.radius= radius;
	}
	public void getheight(double height) {
		this.height= height;
	}
	public void getradius(double radius) {
		this.radius= radius;
		
	}
	public double getVolume() {
		return  3.14  * radius * radius * height;
	}
	
	public void printVolume() {
		System.out.println(getVolume());
	}
	
	
    public static void main(String argc[]) {
    	Scanner sc = new Scanner(System.in);
    	
    	Cyclinder volume = new Cyclinder();
    	double he = sc.nextDouble();
    	double ra = sc.nextDouble();
    	volume.setheight(he);
    	volume.setradius(ra);
    	volume.printVolume();
    	
    	Cyclinder answer = new Cyclinder(7 , 5);
    	answer.printVolume();
    	
    	
    }
}
