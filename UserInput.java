//UserInput.java

import java.util.*; // importing for Array and Scanner
class UserInput{
	int[] arrayInput(){ //method to take array from user
		Scanner scan = new Scanner(System.in); //declaring scanner object
		int[] array = new int[5];  //initializing an Array with size 5
		System.out.println("\nEnter 5 numbers: ");
		
		for (int i = 0; i < array.length; i++){
			array[i] = scan.nextInt();  //taking values from user
		}
		return array; //returns the Array
	}
}