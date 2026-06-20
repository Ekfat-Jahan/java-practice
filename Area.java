import java.util.Scanner;
public class Area {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Value of X is:");
		int x=input.nextInt();
		
		System.out.println("Value of Y:");
		int y=input.nextInt();
		
		System.out.println("Value of Z:");
		int z=input.nextInt();
		
		double s=((double)(x+y+z)/2);
		System.out.println("s is:"+s);
		
		double area=(Math.sqrt(s*(s-x)*(s-y)*(s-z)));
		
	System.out.println("The area is:"+area);
		
		
	}

}
