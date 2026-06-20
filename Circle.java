import java.util.Scanner;
public class Circle {
	public static void main(String[] args){
		double pie=3.1416;
		Scanner input=new Scanner (System.in);
		
		System.out.println("Radius of circle is:");
		double radius=input.nextDouble();
	
		double area=(pie*(Math.pow(radius, 2)));
		double perimeter=(2*pie*radius);
		
		System.out.println("The area of circle is:"+area);
		System.out.println("The perimeter of circle is:"+perimeter);
			
	}

}
