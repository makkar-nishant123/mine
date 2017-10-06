package utils;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Print_code  {
	
	
	/*public static void main(String[] args) {
	test(10.00);	
	test1("Testing");	
	
	test2(2);
	}*/

	private static void test2(int a) {
		
		// TODO Auto-generated method stub
		System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
		new Object(){}.getClass().getEnclosingMethod().getName();

	}

	private static void test1(String b) {
		Method method = Print_code.class.getDeclaredMethods()[0];
		// TODO Auto-generated method stub
        Parameter[] parameters = method.getParameters();

        System.out.println(parameters[0]);
	}

	private static void test(Double c) {
		// TODO Auto-generated method stub
		System.out.println("In TEST");

	}
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		String temp_source_code = "";
		String class_path = "C:\\Users\\nmakkar\\workspace\\Sel_project_AI\\src\\temp\\temp_cl.java";
		try (BufferedReader br = new BufferedReader(new FileReader(class_path))) {
		    String line;
		    while ((line = br.readLine()) != null) {
		       // process the line.
		    	temp_source_code += line;
		    }
		}
		System.out.println(temp_source_code); ;
	}

}
