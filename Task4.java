import java.util.Random;
public class Task4 {
public static void main(String[] args) {
	// random class
	Random random=new Random();
	
	// formula(upper-lower+1)+1. Here, upper=10 & lower=1
	//input
	int num=random.nextInt(((10-1+1)+1));
	System.out.println(num);
	
	//checking the number is odd or even
	if(num%2==0) {
		System.out.println("The number "+ num+ " is posirive.");
	}
	else {
		System.out.println("the number "+num+" is negative.");
	}
		
	
}
}
