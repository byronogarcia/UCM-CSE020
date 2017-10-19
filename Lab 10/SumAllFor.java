import java.util.Scanner;

public class SumAllFor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the max number: ");
		
		int max = input.nextInt();
		int i;
		int total = 0;
		
		for (i = 0; i <= max; i++) {
			System.out.println("Number " + i);
			total += i;
		}
		System.out.print("The sum of all is ");
		System.out.print(total);

		 
	}

}
