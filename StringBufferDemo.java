package comstring.demo;

public class StringBufferDemo {

	public static void main(String[] args) {
        //String is immutable class
		// StringBuffer and String Builder are mutable
		
		//StringBuffer objects are thread safety
		StringBuffer sb=new StringBuffer("Java");
		sb.replace(0, 0, null);
		sb.substring(0);
		
		//StringBuffer objects are thread safety.
		StringBuilder sb1=new  StringBuilder();
		
		
	}

}
