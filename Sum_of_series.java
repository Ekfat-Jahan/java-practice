import java.util.Scanner;

public class Sum_of_series {
	public static void main(String[] args) {
		//scanner class
		Scanner input=new Scanner(System.in);
		//getting input
		System.out.println("Input the number of terms:");
		int n=input.nextInt();
		//logic
		int sum=0;
		int one=1;
		for(int i=1;i<=n;i++)
		{
			sum+=one;
			one=(one*10)+1;
			
		}
		System.out.println("The sum is: "+sum);
		//closing input
		input.close();
	}

}
