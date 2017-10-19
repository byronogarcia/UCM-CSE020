import java.util.Scanner;

public class Bobcar {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int car, member, carprice;
		double VIP, base, pep, total, total1, days, discount;

		System.out.println("Available cars: 1 for Economy, 2 for Compact, 3 for Standard");

		System.out.print("Please choose the rental car: ");
		car = input.nextInt();

		System.out.print("Please enter the number of rental days: ");
		days = input.nextDouble();

		System.out.print("Club Member? 1 for yes, 0 for no: ");
		member = input.nextInt();

		if (member == 1) {
			System.out.print("Platinum Executive Package?: 1 for yes, 0 for no: ");
			VIP = input.nextDouble();

			carprice = 0;

			if (car == 1) {
				carprice = 35;
				// 1 = Economy

			} else if (car == 2) {
				carprice = 45;
				// 2 = Compact

			} else if (car == 3) {
				carprice = 95;
				// 3 = Standard

			} else {
				System.out.println("Please enter 1, 2, or 3");
			}

			base = (days * carprice);
			System.out.print("Base: " + days + " days for " + car + " at $" + carprice + " per day.");
			System.out.println(" $ " + base );

			if (member == 1) {

				discount = (double)(days/7) * carprice;
				System.out.print("Club Member Discount:             ");
				System.out.println("- $ " + discount);

			} else if (member == 0) {

			} else {
				System.out.println("Please enter 1, or 2");
			}

			pep = (double)(base * .15);
			System.out.print("Platinum Executive Package:       ");
			System.out.println("+ $ " + pep );

			if (VIP == 1) {
				discount = (days/7) * carprice;
				total = (int) (base - discount + pep);
				System.out.print("Total Estimate for Rental:         ");
				System.out.println(" $ " + total );

			} 
			else if (VIP == 0) {
				discount = (days/7) * carprice;
				total1 = base - discount;
				System.out.print("Total Estimate for Rental:        ");
				System.out.println("  $ " + total1 );

			} else {

			}


		} else if (member == 0) {
			carprice = 0;

			if (car == 1){
				carprice = 35;

			} else if (car == 2) {
				carprice = 45;

			} else if (car == 3) {
				carprice = 95;

			} else {
				System.out.print("Please enter 1, 2, or 3");
			} 

			base = (days * carprice);
			System.out.println("Base: " + days + " days for " + car + " at $" + carprice + " per day.");
			System.out.println(" $ " + base );

			total = base;
			System.out.println("Total Estimate for Rental:         ");
			System.out.println(" $ " + total);


		} else {
			System.out.println("Please enter valid number");
		}


	}
}