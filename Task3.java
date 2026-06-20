import java.util.Scanner;
public class Task3 {
	public static void main(String[] args) {
		//scanner class
		Scanner input=new Scanner(System.in);
		//taking input
		System.out.println("Enter the value of a:");
		double a=input.nextDouble();
		
		System.out.println("Enter the value of b:");
		double b=input.nextDouble();
		
		System.out.println("Enter the value of c:");
		double c=input.nextDouble();
		
		//formula
		double dis=((Math.pow(b,2))-(4*a*c)); 
		
		// checking
		if(dis==0) {
			System.out.println("One root.");
		}
		else if(dis>0) {
			System.out.println("Two root.");
		}
		else {
			System.out.println("The equation has no real roots.");
		}
		
		//closing scanner class
		input.close();
		
		
	}

}
