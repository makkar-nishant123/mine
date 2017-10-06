/*package utils;
import java.lang.reflect.Method;
import java.util.HashMap;

import org.testng.annotations.BeforeMethod;

public class Names_listener extends Parent {
	
	@BeforeMethod
	public static void test1(int nishant , String c ) throws ClassNotFoundException {
		
		String c_name  = Thread.currentThread().getStackTrace()[1].getClassName();
		Class class_name = Class.forName(c_name);
		Method [] method = class_name.getDeclaredMethods();
		for (Method m : method)
			{System.out.println(m.getName());
			
	for (Parameter p : m.getParameters())
				if(m.getName().equals("test1"))
				System.out.println( p.get);
	}
		
		
		System.out.println(k.get(""));
		
		}
	
	
	public static void test(int c , double c1) {


	String method_name = 	Thread.currentThread().getStackTrace()[1].getMethodName();
	System.out.println(method_name + "1" );
	}
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		HashMap<String,String> k = new HashMap<String,String>();
		k.put("", "dsaas");
		System.out.println("test(" + k.get("") + ")");
	}
}
*/