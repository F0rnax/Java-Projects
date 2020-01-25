package mySweetProgram;
import java.util.*;

public class MySweetProgram {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int i = 0; //Initialization
		do {
			System.out.println("i is: " + i);
			i++; //Update
		} while(i < 10);
		in.close();
	}

}
