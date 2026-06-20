import java.util.Scanner;

public class Sum_of_digit {

	public static void main(String[] args) {
		//Scanner class
		Scanner input=new Scanner(System.in);
		//getting input
		System.out.println("Enter a number:");
		int num=input.nextInt();
		//logic
		int sum=0;
		while(num>0)
		{
			int remainder=num%10;
			sum+=remainder;
			num=num/10;
		}
		System.out.println("Sum of digits: "+sum);
		//close input
		input.close();
		

	}

}
