//ArrayFunctions.java

import java.util.*;
class ArrayFunctions{
	public void display(ArrayList<Integer>  array){
		System.out.println("Array is: "+(array));
	}
	
	public void oddEven(int[] array){
		ArrayList<Integer> even = new ArrayList<Integer>();
		ArrayList<Integer> odd = new ArrayList<Integer>();
		for (int i = 0; i < array.length; i++){
			if (array[i] % 2 == 0){
				even.add(array[i]);
			}
			else{
				odd.add(array[i]);
			}
		}
		display(odd);
		display(even);
	}
	
	public void minConDiff(int[] array){
		
		int min_index = 0;
		int min_diff = array[0] - array[1];
		
		for ( int i = 1; i < array.length-1; i++){
			int diff;
			
			diff = array[i] - array[i+1];
			
			if ( diff < min_diff ){
				min_index = i;
				min_diff = diff;
			}
	

		}
			System.out.println("Minimum Difference: "+min_diff);
			System.out.println("index: "+min_index);
	}
}