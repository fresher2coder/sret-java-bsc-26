package sorting;

public interface Sort {
	
	default void swap(int array[], int i, int j) {
		
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	default void printArray(int array[]) {
		
		for(int n: array) {
			System.out.print(n + " ");
		}
		System.out.println();
	}

	void sort(int array[]);
}
