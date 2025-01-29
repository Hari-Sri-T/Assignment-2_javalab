//ArrayFunctions.java

import java.util.*;
class ArrayFunctions{ 

    // method to print the arraylist
	public void display(ArrayList<Integer>  array){
		System.out.println("Array is: "+(array));
	}

	public void convertArrayList(int[] array){ //method to convert Int Array into Array List
		ArrayList<Integer> list = new ArrayList<Integer>();	
		
		for (int i = 0; i < array.length; i++){		
			list.add(array[i]);
		}
		display(list); // to display the Array List
	}
	
	public void oddEven(int[] array){ // method to seperate odd and even  
		//declaring Arraylists of even and odd
		ArrayList<Integer> even = new ArrayList<Integer>();
		ArrayList<Integer> odd = new ArrayList<Integer>();
		for (int i = 0; i < array.length; i++){
			if (array[i] % 2 == 0){ // if its perfectly divisible by 2
				even.add(array[i]);
			}
			else{
				odd.add(array[i]);
			}
		}
		System.out.println("\nOdd numbers are: ");
		display(odd); //calling display method
		System.out.println("\nEven numbers are: ");
		display(even);
	}
	
	//method to find 2 consecutive numbers with least difference
	public void minConDiff(int[] array){	
		int min_index = 0;    //initializing required variables
		int min_diff = Math.abs(array[0] - array[1]);
		
		for ( int i = 1; i < array.length-1; i++){
			int diff;
			
			diff = Math.abs(array[i] - array[i+1]); // will find difference btw consecutive numbers
			
			if ( diff < min_diff ){ //will check if difference is smaller than min_diff
				min_index = i;
				min_diff = diff; //will update the variables if true
			}
		}
			System.out.println("Minimum Difference: "+min_diff);
			System.out.println("index: "+min_index); // print the outputs
	}
}
