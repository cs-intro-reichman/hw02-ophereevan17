/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		//// Put your code here
		int n = Integer.parseInt(args[0]);

		for (int i = 1; i <= n; i++){
			for (int x = 1; x <= n; x++){
				if (i % 2 == 0){
					System.out.print(" *");
				}
				else{
					System.out.print("* ");
				}

				
			}
			
			System.out.println();

		}
	}
}
