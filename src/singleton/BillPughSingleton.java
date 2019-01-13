package singleton;

public class BillPughSingleton {
	
	private BillPughSingleton() {
		
	}
	
	// inner static helper clz
	private static class SingletonHelper{
		private static final BillPughSingleton instance = new BillPughSingleton();
	}
	
	// global access point
	public static BillPughSingleton getInstance() {
		return SingletonHelper.instance;
	}
	
}

/*
 Notice the private inner static class that contains the instance of the singleton class. When the singleton class is loaded, 
 SingletonHelper class is not loaded into memory and only when someone calls the getInstance method, this class gets loaded and 
 creates the Singleton class instance.

This is the most widely used approach for Singleton class as it doesn’t require synchronization. 
I am using this approach in many of my projects and it’s easy to understand and implement also.
 */
