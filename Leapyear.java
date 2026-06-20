import java.util.Scanner;
public class Leapyear {
	public static void main(String args[]) {
		// Scanner sclass
		Scanner input=new Scanner(System.in);
		// input
		System.out.println("Enter the year:");
		int year=input.nextInt();
		
		int p=year%400;
		int q=year%4;
		int r=year%100;
		
		// checking
		if(p==0) {
			System.out.println(year+" is leap year.");
		}
		else if(q==0 && r!=0) {
			System.out.println(year+" is leap year.");
		}
		else {
			System.out.println(year+" is not leap year.");
		}
		
		//Scanner class close
		input.close();
	}
	

}
