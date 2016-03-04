
public class QSort {

	public static void quickSort(int[] data, int left, int right) {
		int i = left;
		int j = right;
		int temp;
		
		int pivot = data[(left + right) / 2];
		
		while(i <= j) {
			while (data[i] < pivot)
				i++;
			while (data[j] > pivot)
				j--;
			if (i <= j) {
				temp = data[i];
				data[i] = data[j];
				data[j] = temp;
				i++;
				j--;
			}
		if (left < j) 
			quickSort(data, left, j);
		if (i < right)
			quickSort(data, i, right);
		}
	}
	
	
	
	public static void main(String[] args) {
		int[] data = new int[20];
		
		
		for (int i = 0; i < data.length; i++) 
			data[i] = (int)(Math.random() * 100);
		
		
		quickSort(data, 0, (data.length - 1));
		
		for (int element : data) 
			System.out.println(element);
		
			
			
		
		
	}
	
}
