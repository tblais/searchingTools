import java.util.TreeMap;
import java.util.Scanner;
import java.io.*;


public class AMap {
	
	public static void main(String[] args) {
		
		TreeMap<Integer, String> myMap = new TreeMap<Integer, String>();
		
		myMap.put(1, "Tyler");
		myMap.put(2, "Jaclyn");
		
		//System.out.println(myMap.values()); >>for validation only
		
		Scanner in = new Scanner(System.in);
		String input = "";
		int count = 3;
		
		while(!input.equals("Exit")) {
		    System.out.println("You have two items in your Map. Add more or type Exit to quit");
		    System.out.println("Entry is...");
		    input = in.nextLine();
		    
		    if(!input.equals("Exit")) {
		    	myMap.put(count, input);
		    	count++;
		    }
		
		}
		
		System.out.println(myMap.values());
	}

}
