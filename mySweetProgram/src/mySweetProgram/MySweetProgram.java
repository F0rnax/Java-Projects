package mySweetProgram;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class MySweetProgram {


	public static void main(String[] args){

		LinkedList<String> names = new LinkedList<String>();
		names.push("Isaac");
		names.push("Caleb");
		names.push("Susan");
		System.out.println(names.pop());
		System.out.println(names.pop());
		System.out.println(names.pop());
	}
}
