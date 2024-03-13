package comstring.demo;
/*
 * when to use"==", equals() and hashcode () on strings
 * ==" operator, equals() method and hash
 */
public class StringComparison 
{

	public static void main(String[] args)
	{
		String s1 = "0-42L";
		
		String s2 = "0-43-";
		
		System.out.println(s1 == s2); //will return false as s1 and s2 are referring to two different
		
		System.out.println(s1.equals(s2)); //false
		
		System.out.println(s1.hashCode() ==s2.hashCode()); //true
		
	}

}
