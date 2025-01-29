//Main.java
// Name: Tanniru Hari Sri Shanmukha Sai
// PRN: 23070126135
// Batch: AIML B3

class Main{ 
    // entry point to code
	public static void main(String args[]){
		UserInput in = new UserInput();  //Creating Object of UserInput
		ArrayFunctions functions = new ArrayFunctions(); // Creating Object of ArrayFunctions
		
		//calling methods from ArrayFunctions while passing array (arrayInput) from UserInput
		functions.oddEven(in.arrayInput()); 
		functions.minConDiff(in.arrayInput());
		functions.convertArrayList(in.arrayInput());
	}
}
