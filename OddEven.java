import java.util.Scanner;
public class OddEven {
	public static void main(String[] args) {
		//scanner class
		Scanner input=new Scanner(System.in);
		//taking input
		System.out.println("Enter a number:");
		int num=input.nextInt();
		
		//logic
		switch(num%2) {
		case 0:
			System.out.println(num+" is a positive number.");
			break;
		case 1:
			System.out.println(num+" is a negetive number.");
			break;
			default:
				System.out.println("Invalid number.");
				input.close();
		}
		
		
		
	}

}
