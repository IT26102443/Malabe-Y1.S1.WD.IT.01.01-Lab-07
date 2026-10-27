import java.util.Scanner;

public class IT26102443Lab7Q3{
	
	public static void main(String [] args) {
		
		final double DISCOUNT_RATE = 0.05;
		final int NUMBER_OF_CUSTOMERS = 5;
		double billAmount, amountToPay;
		char PaymentMode;
		
		double discount = 0;
		
		Scanner input = new Scanner(System.in);
		
		for (int customercount = 1 ; customercount <= NUMBER_OF_CUSTOMERS ; customercount++){
			
			System.out.println("customer :" +customercount);
			
			System.out.println("Enter the total Bill Amount :");
			billAmount = input.nextDouble();
			
			System.out.println("Enter the mode of payment(C for cash, O for other :)");
			PaymentMode = input.next().toUpperCase().charAt(0);
			
			if(PaymentMode == 'C'){
				
				discount = billAmount * DISCOUNT_RATE;
				amountToPay = billAmount - discount;
				
				System.out.println("Discount is : "+discount);
				System.out.println("Amount to be Paid : "+amountToPay);
			}
			else if(PaymentMode == 'O'){
				
				amountToPay = billAmount;
				
				System.out.println("No Discount Applicable");
				System.out.println("Amount to be paid : "+amountToPay);
				
			}
			else{
				
				System.out.println("Payment Mode is Not Valid");
				System.out.println("");
				
				continue;
			}
			System.out.println("");
		}
		
		
	}
}