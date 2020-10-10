package swe;
import java.util.Scanner;
public class MultiplyDigits {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Number Between 0 and 1000 :");
		
		int  Number = input.nextInt();
		
		
		int Number1 = Number % 10;
		Number /=10;
		int Number2 = Number % 10;
		Number /=10;
		int Number3 = Number % 10;
		Number /=10;

     
     	int Multiplication = Number1*Number2*Number3;
     	
	    System.out.println("The Multiplication Of All Digits In " +    "is " + Multiplication);
	    		
		
	}

}
