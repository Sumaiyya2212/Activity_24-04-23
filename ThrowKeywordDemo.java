package exception;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeywordDemo {
	static void validateAge(int age) throws AgeValidationException{
		if(age>=18) {
			System.out.println("Eligible to Vote");
		}
	   else {
			throw new AgeValidationException("Not Eligible To Vote!!!");	
	   }
	   }

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter Your Age : ");
			int age = sc.nextInt();
			validateAge(age);
			}
        catch(InputMismatchException e) {
        	System.out.println("Please give corrct input!!!");
        }
		catch(AgeValidationException e) {
			System.out.println(e.getMessage());
		}
	}

}
