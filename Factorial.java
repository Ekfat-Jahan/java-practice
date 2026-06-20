import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		//scanner class
		Scanner input=new Scanner(System.in);
		//getting input
		System.out.println("Enter a number:");
		int num=input.nextInt();
		//logic
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact*=i;
		}
		System.out.print("The facorial of "+num+" is: "+fact);
		//closing input
		input.close();
	}

}
