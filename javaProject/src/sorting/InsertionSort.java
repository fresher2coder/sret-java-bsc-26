package sorting;

public class InsertionSort implements Sort {

	@Override
	public void sort(int[] array) {
		System.out.println("Insersion Sort");
		for(int i=1; i<array.length; i++) { //4
			
			for(int j=i; j>0; j--) { //0 1 2 3
				
				if(array[j] < array[j-1])
					swap(array, j-1, j);
			}
		}
	}

}
