import java.util.Scanner;

public class SumAllDo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the max number: ");
		
		int max = input.nextInt();
		int i = 0;
		int total = 0;
		
		do {
			System.out.println("Number " + i);
			total += i;
			i++;
		} while (i <= max);
		
		System.out.print("The sum of all is ");
		System.out.print(total);
	}

}
