import java.util.Scanner;
public class Palindrome {
	//method
	public static boolean isPalindrome(String str) {
		String reverse="";
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse+=str.charAt(i);
		}
		if(str.toLowerCase().equals(reverse.toLowerCase()))
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
		
		public static void main(String[] args) {
			//scanner class
			Scanner input=new Scanner(System.in);
			//getting input
			System.out.println("Enter a word:");
			String str=input.next();
			//logic
			if(isPalindrome(str)==true)
			{
				System.out.println(str+" is palindrome");
			}
			else {
				System.out.println(str+" is not palindrome");
			}
		}
		
	

}
