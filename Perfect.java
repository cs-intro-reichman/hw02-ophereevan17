/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int num = Integer.parseInt(args[0]); //gets number from user
		int i = 1;
		int divisor_sum = 0;
		String st = "";

		while(num >= i && i != num){
			if (num % i == 0){
				divisor_sum = divisor_sum + i ;
				st = st + i + " + ";
			}
			i++;
		}

		st = st.substring(0, st.length()-2);

		if(num == divisor_sum){
			System.out.print(num + " is a perfect number since " + num + " =  " + st);
		}

		else{
			System.out.print(num + " is not a perfect number");
		}
		
	}
}
