import java.util.Scanner;

public class Multiplication_Table {
	public static void main(String [] args) {
		// scanner class
		Scanner input=new Scanner (System.in);
		//getting input
		System.out.println("Enter an integer number:");
		int num=input.nextInt();
		//logic
		System.out.println("Multiplication table of "+num+" is:");
		for(int i=1;i<=10;i++)
		{
			System.out.println();
		System.out.println(num+"x"+i+"="+i*num);
		}
		//closing npu
		input.close();
	}

}
