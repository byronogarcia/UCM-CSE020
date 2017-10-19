import java.util.Scanner;

public class AnyAverage {

	public static void main(String[] args) {
		System.out.println("This program will find the average");
		Scanner input = new Scanner(System.in);

		int max, total, i, num, average;

		System.out.print("Please choose amount of numbers to average: ");
		max = input.nextInt();

		total = 0;
		i = 0;
		
		while (i <= max);
		System.out.print("Please enter " + i + " number: ");
		num = input.nextInt();
		total += num;
		i++;
		
		average = total/i;
		System.out.print("The average is: " + average);
	}

}
