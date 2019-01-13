package singleton;

public class StaticBlockSingleton {

	private static StaticBlockSingleton instance;
	
	private StaticBlockSingleton() {
		
	}
	
	static {
		try {
			instance = new StaticBlockSingleton();
		} catch (Exception e) {
			System.out.println("Exception occur when creating the instance : "+e);
		}
	}
	
	public static StaticBlockSingleton getINstance() {
		return instance;
	}
}

/*
Static block initialization implementation is similar to eager initialization, except that instance of class is created 
in the static block that provides option for exception handling.
*/