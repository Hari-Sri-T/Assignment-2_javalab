//Main.java

class Main{
	public static void main(String args[]){
		UserInput in = new UserInput();
		ArrayFunctions functions = new ArrayFunctions();
		
		functions.display(in.arrayInput());
		functions.oddEven(in.arrayInput());
		
	}

}