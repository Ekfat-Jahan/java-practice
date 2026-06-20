import java.util.Scanner;
public class Sum_of_digit {
	//method
	public static int sum(int n) {
		int remainder=0;
		int sum=0;
		while(n>0)
		{
			remainder=n%10;
			sum+=remainder;
			n=n/10;
		}
		return sum;
			
		
	}

	public static void main(String[] args) {
		//scanner class
		Scanner input=new Scanner (System.in);
		//getting input
		System.out.println("Enter 5 digit positive integer number:");
		int num=input.nextInt();
		//calling method
		System.out.println("The summation of all 5 digit is: "+sum(num));
		//closing input
		input.close();
		
		

	}

}
