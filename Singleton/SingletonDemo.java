
public class SingletonDemo {

	public static void main(String[] args) {
		
		// First object created
		SingletonClass obj = SingletonClass.getInstance();
		
		// Second object created
		SingletonClass obj1 = SingletonClass.getInstance();
		
		// first object changed the value of a to 1
		obj.countObj();
		// second object changed the value of a to 2
		obj1.countObj();
		
		
		// Both objects when printed will be seen to bee the same.
		System.out.println(obj);
		System.out.println(obj1);
		
				
	}
}
