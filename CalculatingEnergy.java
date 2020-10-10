package swe;
import java.util.Scanner;                     
public class CalculatingEnergy {

	public static void main(String[] args) {
	
		Scanner input = new Scanner (System.in);
	
		
		
		System.out.print("Enter  the amount of water in kilograms : ");
		
		double weightofwaterinkilograms = input.nextDouble();
		
		System.out.print("Enter the initial temperature : ");

		double initialtemperature = input.nextDouble();
		
		System.out.print("Enter the final temperature : " );
		
		double finaltemperature = input.nextDouble();
		
		double Energy = weightofwaterinkilograms * (finaltemperature - initialtemperature) *4184;
		
		System.out.println("The Energy needed is: " + Energy+"Joules" );
		
		
	}

}
