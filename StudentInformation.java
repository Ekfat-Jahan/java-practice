import java.util.Scanner;
public class StudentInformation {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Student name:");
		String name=input.nextLine();
		
		System.out.println("ID:");
		int ID=input.nextInt();
		
		System.out.println("CGPA:");
		double cgpa=input.nextDouble();
		
		System.out.println("Department");
		String dept=input.next();
		
		System.out.println("Student Information:");
		System.out.println("Name:"+name);
		System.out.println("ID:"+ID);
		System.out.println("CGPA: "+cgpa);
		System.out.println("Department: "+dept);
		
	}

}
