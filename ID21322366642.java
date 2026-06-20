// A company policy is if a is between 25-45 years old he/she is eligible to work

import java.util.Scanner;
//exception subclass
class InvalidAgeException extends Exception{
	int age;

	public InvalidAgeException(int age) {
		this.age = age;
	}
	
public String toString() {
	return "InvalidAgeException: "+age;
}

}


public class ID21322366642 {
	//method for checking age
	public static void checkAge(int age) throws InvalidAgeException{
		if(age>=100 || age<=0)
			throw new InvalidAgeException(age);
		else {
			System.out.print("Age: "+age+" Result: ");
			if(age>=25 && age<=45) {
				System.out.println("CONGRACHULATION!! You are selected.");
				
			}
			else if(age<25) {
				System.out.println("SORRY!! You are too young.");
				
			}

				else if(age>45) {
					System.out.println("SORRY!! You are too old.");
					
				}
			}
		}
	
// main method
	public static void main(String[] args) {
		
		//taking input class
		Scanner input=new Scanner(System.in);
		
		
		//taking number input
		System.out.println("Enter a number:");
		int num=input.nextInt();
		
		//loop
		for(int i=1;i<=num;i++) {
			
			System.out.print("Enter your age:");
			int age=input.nextInt();
			
			try {
				checkAge(age);
			}
			catch(InvalidAgeException ex) {
				System.out.println("Exception occurs:"+ex);
				
			}
		}
	
		//closing input
		input.close();
	}

}
