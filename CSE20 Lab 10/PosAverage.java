import java.util.Scanner;

public class PosAverage {

	public static void main(String[] args) {
		 Scanner input = new Scanner (System.in);
		 
		 int num = 0;
		 int i = 0;
		 int total = 0;
		 
		 do {
			 System.out.print("Enter " + i + " number: ");
			 num = input.nextInt();
			 
			 if (num >= 0) {
				 total += num;
				 i++;
			 }
			 
			 else {
				 
			 }
			 
		 } while (num >= 0);

		 System.out.print("Average is " + total/i);
		 
	}
}


