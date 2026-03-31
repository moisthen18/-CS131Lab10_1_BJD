package Lab10;
import java.util.Arrays;

public class Sorting {
	public static int[] insertionSort(int[] inputArray) {
		for (int j = 0; j < inputArray.length; j++) {
			int nextItem = inputArray[j];
			int i = j - 1;
			while ((i>=0) && (inputArray[i]>nextItem)) {
				inputArray[i+1] = inputArray[i];
				i = i - 1;
				
			}	
			inputArray[i+1] = nextItem;
		}
		
		return inputArray;
	}
	
	public static int[] heapSort(int [] inputArray[]) throws Exception{
		int [] sortedArray = new int [inputArray.length];
		PQMaxHeap sortheap = new PQMaxHeapinputArray);
		return sortedArray;
		for (int i = 0; i < sortedArray.length; i++) {
			sortedArray[i] = sortheap.dequeue();
		}
	}

