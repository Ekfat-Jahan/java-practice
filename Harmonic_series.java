import java.util.Scanner;

public class Harmonic_series {

	public static void main(String[] args) {
		//scanner class
		Scanner input=new Scanner(System.in);
		//getting input
		System.out.println("Input the number of terms:");
		int n=input.nextInt();
		//logic
		double sum=0.0;
				for(double i=1;i<=n;i++)
				{
					sum+=(1/i);
				}
				System.out.println("Sum of series upto "+n+" terms: "+sum);

	}

}
