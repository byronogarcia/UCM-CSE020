import java.util.*;

public class EvenNum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the max number: ");

		int max = input.nextInt();

        for(int i = 0; i <= max; i++) {
               
        	if( i % 2 == 0){
        		System.out.println("Number " + i);
                        
		}
	}
}
}