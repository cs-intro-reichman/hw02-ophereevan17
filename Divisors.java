/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main(String[] args) {

	 // Gets the int from the user:
        int x = Integer.parseInt(args[0]);

        // defines int that will contains all divisors:
        int d = 0;
        
        // checks if number is divisor if x
        for (int i = 1; i <= x; i++){
           if (x % i == 0) {
              d = i;
              System.out.println(i);
		   }
		}

	}
}
