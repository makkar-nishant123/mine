package test_package;

public class ClassB {
	public static String str ;
	
	private final int first;
    private final String second;
    
	 public ClassB(int first, String second) {
	        this.first = first;
	        this.second = second;
	    }
	 
	 public int getFirst() {
	        return first;
	    }

	    public String getSecond() {
	        return second;
	    }
	    
	public static ClassB method2(String str) {
		// TODO Auto-generated method stub
		str = str + "ABC";
		fetch(str);
		return new ClassB(1 , str);
	}

	private static String fetch(String str) {
		return str;
		// TODO Auto-generated method stub
		
	}

}
