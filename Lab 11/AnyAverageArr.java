import java.util.Scanner;

public class AnyAverageArr {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("This program will find the average of any numbers");
		System.out.print("Please choose amount of numbers to average: ");

		int max = input.nextInt();

		int[]arr1 = new int[max];

		int i;
		int total = 0;

		for (i = 0; i < max; i++) {
		System.out.print("Please enter " + i + " number: ");
		arr1[i]= input.nextInt();
		total += arr1[i];
		}
		
		System.out.println("The Numbers being averaged");

		for (i = 0; i < max; i++){
		System.out.print(arr1[i] + " ");
		}
		
		System.out.println("");
		System.out.println("The average is: " + total/max);

	}
}
