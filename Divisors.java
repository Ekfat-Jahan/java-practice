import java.util.Scanner;

public class Divisors {

	public static void main(String[] args) {
		//scanner class
		Scanner input=new Scanner(System.in);
		//getting input
		System.out.println("Enter an integer:");
		int num=input.nextInt();
		//logic
		
		System.out.println("Divisors of "+num+" are:");
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)	
			{
				System.out.print(i+",");
			}
			
		}
		//closing input
		input.close();

	}

}
