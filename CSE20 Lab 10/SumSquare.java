import java.util.Scanner;

public class SumSquare {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the max number: ");

		int max = input.nextInt();
		int i = 1;
		int total = 0;
		while (i <= max) {
			System.out.println("Number " + i + " squared is " + (i * i));
			total += i * i;
			i++;
		}
		System.out.print("The sum of all is ");
		System.out.print(total);

	}

}
