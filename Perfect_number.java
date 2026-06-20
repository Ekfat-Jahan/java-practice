import java.util.Scanner;

public class Perfect_number {
	//method
	public static int perfect(int n) {
		
				 int sum=0;
				for(int i=1;i<n;i++)
				{
					
						if(n%i==0)
						{
							sum+=i;
						}
				}
					
					if(sum==n)
						return 1;
					else
						return 0;
								
	}

	public static void main(String[] args) {
		
		//scanner class
		Scanner input=new Scanner(System.in);
		//getting input
		System.out.println("Enter a number:");
		int n=input.nextInt();
		 //logic
		for(int i=2;i<=n;i++)
		{
			//calling method
			if(perfect(i)==1)
				System.out.println(i);
		}
		//closing input
		input.close();
		

	}

}
