import java.util.Scanner;

public class Multiples {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int max, base, mult, count;
		
		System.out.print("Please enter the max number: ");
		max = input.nextInt();
		
		System.out.print("Enter the base: ");
		base = input.nextInt();
		
		for(mult = base; mult <= max; mult += base) {
		
			System.out.println("Number " + mult);
			
		}
		 
	}

}
