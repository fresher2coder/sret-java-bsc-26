package sorting;

public class BubbleSort implements Sort {

	@Override
	public void sort(int[] array) {
		

		for(int i=array.length-1; i>0; i--) { //4
			for(int j=0; j<i; j++) { //0 1 2 3
				
				if(array[j]>array[j+1])
					swap(array, j, j+1);
			}
		}
	}
	
}
