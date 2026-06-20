import java.util.Scanner;

public class Right_angle_triangle {

	public static void main(String[] args) {
		//Scanner class
		Scanner input=new Scanner(System.in);
		//getting input
		System.out.println("Input number of rows:");
		int row=input.nextInt();
		//logic
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
