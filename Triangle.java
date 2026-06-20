import java.util.Scanner;
public class Triangle {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
			System.out.println("Height of triangle:");
		double height=input.nextDouble();
		
		System.out.println("Base of triangle:");
		double base=input.nextDouble();
		
		double area=((0.5)*base*height);
		
		System.out.println("The area of triangle is:"+area);
		//System.out.println("The area of triangle is:"+(0.5*base*height));
		
		
	}

}
