import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Locale;

public class TratamentoDeExcecoes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		boolean continueLopping = true;
		
		do {
			try {
				System.out.print("Please enter an integer numerator: ");
				int numerator = sc.nextInt();
				System.out.print("Please enter an integer denominator: ");
				int denominator = sc.nextInt();
				
				int result = quotient(numerator, denominator);
				
				System.out.printf("Result: %d / %d = %d",numerator, denominator, result);
				continueLopping = false;			
			}
			catch (InputMismatchException inputMismatchException) {
				System.err.printf("%nException: %s%n", inputMismatchException);
				sc.nextLine();
				System.out.println("You must enter integers. Please try again.\n");
				System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");

			}
			
			catch (ArithmeticException arithmeticException) {
				System.err.printf("%nException: %s%n", arithmeticException);
				System.out.println("Zero is an invalid denominator. Please try again\n");
				System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
			}		
			
		}while (continueLopping);
		
		sc.close();

	}
	
	public static int quotient(int numerator, int denominator) throws ArithmeticException { // demonstra lançamento de exceção quando ocorre divisão por zero
		return numerator / denominator;
	}
	
	

}
