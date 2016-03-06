import java.util.Scanner;

public class binarySearch {
	
	public static boolean bSearch(int[] data, int low, int high, int search) {
		

		if (search < low || high < search) {
			return false;
		}
		
		if (low < high) {
			int middle = (high + low) / 2;
			int mid = data[middle];
			
			if (search == mid) {
				return true;
			}
			
			else if (search < mid) {
				return bSearch(data, low, middle, search);
			}
			
			else {
				return bSearch(data, middle, high, search);
			}
		}
		
		else {
			return false;
		}
		

	}
	
	
	public static void main(String[] args) {
		
		int[] data = new int[] {1, 3, 4, 5, 6, 7, 8, 9, 10};
		
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a number to search");
		int search = in.nextInt();
		
		if (bSearch(data, 0, data.length - 1, search)) {
			System.out.println("Its there");
		}
		else 
			System.out.println("It isn't there");
		
		
	}
		
		
		
	}
	

