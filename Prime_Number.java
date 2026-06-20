import java.util.Scanner;

public class Prime_Number {
	public static void main(String[] args) {
		//Scanner class
		Scanner input=new Scanner(System.in);
		//getting input
		System.out.println("Enter an integer number:");
		int num=input.nextInt();
		//logic
		boolean flag=true;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag=false;
				break;
			}
			
		}
		if(flag==true)
			System.out.println(num+" is a prime number.");
		else
			System.out.println(num+" is not a prime number.");
		
		
		//close input 
		input.close();
		
	}

}
