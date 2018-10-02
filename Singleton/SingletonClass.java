
public class SingletonClass {
	
	private static SingletonClass obj = new SingletonClass();
	
	// instance variable
	int a = 0;
	
	// private constructor
	private SingletonClass() {}
	
	public static SingletonClass getInstance() {
		return obj;
	}
	
	void countObj() {
		a++;
		System.out.println("Object " + a);
	}

}
