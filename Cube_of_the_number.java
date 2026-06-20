import java.util.Scanner;

public class Cube_of_the_number {
	public static void main(String[] args) {
		//Scanner class
		Scanner input=new Scanner(System.in);
		//getting input
		System.out.println("Enter a number:");
		int num=input.nextInt();
		//logic
		System.out.println("Cubic number till "+num+" are: ");
		for(int i=1;i<=num;i++)
		{
		System.out.print((int)Math.pow(i,3)+",");
	}
		//closing input
		input.close();
	}

}
