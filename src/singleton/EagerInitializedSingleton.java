package singleton;

public class EagerInitializedSingleton {
	
	// instance is creating when class is loaded
	private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
	
	private EagerInitializedSingleton() {
		
	}
	
	// global access point
	public static EagerInitializedSingleton getInstance() {
		return instance;
	}

}


/*
 If your singleton class is not using a lot of resources, this is the approach to use. But in most of the scenarios, 
 Singleton classes are created for resources such as File System, Database connections etc. We should avoid the instantiation 
 until unless client calls the getInstance method. Also, this method doesn’t provide any options for exception handling.
 */