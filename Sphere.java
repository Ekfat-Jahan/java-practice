import java.util.Scanner;
public class Sphere {
	public static void main(String[] args) {
		double pie=3.1416;
		
		Scanner input=new Scanner (System.in);
		System.out.println("Radius of sphere is:");
		double radius=input.nextDouble();
		
		double volume=(1.33*(pie)*(Math.pow(radius, 3)));
		
		//System.out.println("The volume of sphere is: "+((4/3)*pie*Math.pow(radius,3)));
		System.out.println("The volume of sphere is: "+volume);

		
	}

}


