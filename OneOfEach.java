
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {

		boolean boy = false;
		boolean girl = false;

		int b = 0;
		int g = 0;

		while (boy == false || girl == false){

			int chance = (int) ((Math.random() * 10));

			if (chance % 2 == 0){
				girl = true;
				g = g + 1;
				System.out.print("g ");
			}
			else{
				boy = true;
				System.out.print("b ");
				b = b + 1;
			}
		}
		int total = g + b;
		System.out.println();
		System.out.print("You made it... and you now have " + total + " children.");
	}
}



