import java.util.Scanner;
public class Operator {
	public static void main(String args[]) {
		//scanner class
		Scanner input=new Scanner(System.in);
		//taking input
		System.out.println("Enter 1st number:");
		int a=input.nextInt();
		
		System.out.println("Enter 2nd number:");
		int b=input.nextInt();
		
		System.out.println("enter the operator:");
		char operator=input.next().charAt(0);
		
		//logic
		int sum;
		switch(operator) {
		case '+':
		  sum=a+b;
			System.out.println("The addition is "+sum);
			break;
			
		case '-':
			sum=a-b;
			System.out.println("The subtraction is "+sum);
			break;
			
		case '*':
			 sum=a*b;
			System.out.println("The product is "+sum);
			break;
			
		case '/':
			 sum=a/b;
			System.out.println("The division is "+sum);
			break;
			
			default:
				System.out.println("Invalid ");
				
		}
		//Scanner class close
		input.close();
		
	}

}
