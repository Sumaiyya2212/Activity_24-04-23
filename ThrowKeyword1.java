package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword1 {
	static void checkNum(int num) throws NumDivisibleException{
		if(num%5==0 && num%11==0) {
			System.out.println(num+" is divisible by both 5 & 11");
		}
	   else 
	   {
			throw new NumDivisibleException(num+"is not divisible by 5 & 11");	
	   }
	 }

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in))
		{
			System.out.println("Enter a Number : ");
			int num = sc.nextInt();
		    checkNum(num);
			}
        catch(InputMismatchException e) {
        	System.out.println("Please give corrct input!!!");
        }
		catch(NumDivisibleException e) {
			System.out.println(e.getMessage());
		}
	}
	}


