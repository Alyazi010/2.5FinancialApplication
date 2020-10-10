package swe;
import java.util.Scanner;
public class FinancialApplication {

	public static void main(String[] args) {

  Scanner input = new Scanner (System.in);
  
  System.out.print("PLease Enter The Subtotal And a Gratuity Rate:  ");
  
  double subtotal = input.nextDouble();
  
  double gravtuityRate = input.nextDouble();
  
  double gravtuity = subtotal *(gravtuityRate/100);
  
  double total = subtotal + gravtuity;
		  
 System.out.println("The Gratuity is $" + gravtuity + " and total is $"+ total );

 }

}
2.