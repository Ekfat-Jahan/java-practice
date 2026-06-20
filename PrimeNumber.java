import java.util.Scanner;
public class PrimeNumber {
	// method for isPrime
	public static boolean isPrme(int N)
	{
		boolean flag=true;
		for(int i=2;i<N;i++)
		{
			if(N%i==0)
			{
				flag=false;
				break;
			}
		}
		if(flag==true)
		{
			return true;
		}
		else {
			return false;
		}
	}
	
	//method for generatePrime
	public static void generatePrime(int a,int b) {
		for(int i=a;i<=b;i++) {
			if(isPrme(i)==true)
			{
			System.out.println(i)	;
			}
	
		}
	}
	
	
	public static void main(String[] args) {
		//Scanner class
		Scanner input=new Scanner(System.in);
		//getting class
		System.out.println("Enter the value of a:");
		int a=input.nextInt();
		System.out.println("Enter the value of b:");
		int b=input.nextInt();
		//calling method
		System.out.print("Prime number between "+a+" to "+b+" is: ");
		generatePrime(a,b);
		
	}

}
// please explain me why I am getting 1 in answer.Thank you!!
