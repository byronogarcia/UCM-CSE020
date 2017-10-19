import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a number 0-25: ");
		double num = input.nextDouble();
		
		if (num >= 0 && num <= 25) {
			System.out.print("character "+ num + " in the alphabet is ");
			System.out.print((char)('A' + num));
		} else {
			System.out.print("Outside of acceptable range");
		}
		
	}

}
