import java.util.Scanner;
public class Task6 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Quantity of book:");
		int p=input.nextInt();
		
		System.out.println("Quantity of pen:");
		int q=input.nextInt();
		
		System.out.println("Quantity of bag:");
		int r=input.nextInt();
		 
		int total=((10*p)+(5*q)+(20*r));
		
		System.out.println("\nInformation:");
		System.out.println("The price of book is 10$");
		System.out.println("The price of pen is 5$");
		System .out.println("The price of bag is 20$");
		System.out.println("\nYou have purchase "+p+" book(s), "+q+" pan(s) and "+r+" bag(s)");
		System.out.println("\nYout total cost is: "+total);
	}

}
