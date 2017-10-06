package test_package;

public class ClassA {
	
	
	public static String str = "A";
	
	public static void method1(){
		
		str = "ABCD";
		ClassB method2 = ClassB.method2(str);
System.out.println(method2.getFirst());
System.out.println(method2.getSecond());

	}

	public static void display() {
		// TODO Auto-generated method stub
		System.out.println(str);
	}
	public static void main(String[] args) {
		method1();
	}

}
