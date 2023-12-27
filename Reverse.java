//**
 //* Prints a given string, backward. Then prints the middle character in the string.
 //* The program expects to get one command-line argument: A string.

public class Reverse {
	public static void main (String[] args){
		//// Put your code here
	// Gets string from user:
        
		String s = (args[0]);
		String r = ""; // defines string that will contain reversed string

        // loop that will reverse each letter from string
        for (int i = s.length()-1; i >= 0; i--){
           r = r + s.charAt(i);
		   }

		int middle = (s.length() / 2);
		System.out.println(r);
		System.out.println("The middle character is " + s.charAt(middle));

	}
}
