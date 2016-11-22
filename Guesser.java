public class Guesser{
	
	
	static int theNum;	// having been declared outside of all the methods,
					// this variable is available to ALL the methods
	
	// makeNum sets theNum to a random number between x & y
	public static void makeNum(int x, int y){
		int z = 9;	// since z was made within a pair of braces, it only exists 
				// within that block of code
		
		
	}
	
	public static boolean tryThis(int n){
		return n==theNum;
		
	}
		
}