import java.util.Scanner;
public class PositiveNegitive {
	public static void main(String[] args) {
		// scanner class
		Scanner input=new Scanner(System.in);
		//input
		System.out.println("Enter the number:");
		int num=input.nextInt();
		
		// checking
		if(num==0) {
			System.out.println("It's a zero.");
		}
		else if(num>0) {
			System.out.println("the number "+num+" is posirive.");
		}
		else {
			System.out.println("The number "+num+" is negative.");
		}
		input.close();
		
		
	}

}
