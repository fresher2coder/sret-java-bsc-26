package sorting;

public class Tester {

	public static void main(String[] args) {
		
		int array[] = {23, 12, 4, 45, 18, 1};
		
		Sort sort = new BubbleSort();
		sort = new InsertionSort();
		
		sort.sort(array);
		
		sort.printArray(array);
		
		

	}
	
	

}
